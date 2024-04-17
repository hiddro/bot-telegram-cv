package com.telegram.bot.cv;

import com.telegram.bot.cv.builder.HomeBuilder;
import com.telegram.bot.cv.keyboard.KeyboardBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class Bot extends TelegramLongPollingBot {

    HomeBuilder homeBuilder;

    KeyboardBuilder keyboardBuilder;

    public Bot(HomeBuilder homeBuilder, KeyboardBuilder keyboardBuilder) {
        this.homeBuilder = homeBuilder;
        this.keyboardBuilder = keyboardBuilder;
    }

    public Bot() {
    }


    @Override
    public String getBotUsername() {
        return "EduBot";
    }

    @Override
    public String getBotToken() {
        return "7027052997:AAGKdz_l6-CcIKuLRlDVgeE0I1e0UDKrXu0";
    }

    @Override
    public void onRegister() {
        this.setBotCommands();
    }

    @Override
    public void onUpdateReceived(Update update) {
        var msg = update.getMessage();
        var user = msg.getFrom();
        var id = user.getId();

        if(msg.isCommand()){
            if(msg.getText().equals("/start")){      //If the command was /scream, we switch gears
                sendText(id, homeBuilder.startBuilder().replace("${Username}", update.getMessage().getFrom().getUserName()));
            }
            else{
                sendText(id, msg.getText());
                keyboardBuilder.keyboardMarkBuilder(this, update.getMessage());
            }

            return;                                     //We don't want to echo commands, so we exit
        }

        //sendText(id, msg.getText());

    }

    public void sendText(Long who, String what){
        SendMessage sm = SendMessage.builder()
                .chatId(who.toString()) //Who are we sending a message to
                .text(what)
                .parseMode(ParseMode.MARKDOWN)
                .build();    //Message content
        try {
            execute(sm);                        //Actually sending the message
        } catch (TelegramApiException e) {
            e.printStackTrace();      //Any error will be printed here
        }
    }

    public void setBotCommands() {

        // Define los comandos del bot
        List<BotCommand> commands = new ArrayList<>();
        commands.add(new BotCommand("info", "Información"));
        commands.add(new BotCommand("resumen", "Hoja de vida"));
        commands.add(new BotCommand("contacto", "Redes Sociales"));

        // Crea un objeto SetMyCommands
        SetMyCommands setMyCommands = new SetMyCommands();
        setMyCommands.setCommands(commands);

        try {
            // Ejecuta el método setMyCommands para establecer los comandos del bot
            execute(setMyCommands);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}

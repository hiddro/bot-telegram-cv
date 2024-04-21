package com.telegram.bot.cv;

import com.telegram.bot.cv.keyboard.KeyboardBuilder;
import com.telegram.bot.cv.service.MenuService;
import com.telegram.bot.cv.utils.Utils;
import com.telegram.bot.cv.utils.constant.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class Bot extends TelegramLongPollingBot {

    private final MenuService menuService;

//    KeyboardBuilder keyboardBuilder;
//
//    public Bot(KeyboardBuilder keyboardBuilder) {
//        this.keyboardBuilder = keyboardBuilder;
//    }

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
        var mensage = "";

        if(msg.isCommand()){

            if(Arrays.asList(Constants.URL_MENU_START,
                    Constants.URL_MENU_INFO,
                    Constants.URL_MENU_RESUMEN,
                    Constants.URL_MENU_CONTACTO).contains(msg.getText())){
                /*OLD CALL EVENT MESSAGE*/
//                sendText(id, homeBuilder.startBuilder().replace("${Username}", update.getMessage().getFrom().getUserName()));
                sendText(id, menuService.buildMessageMenu(msg.getText(), update));

//                if(!msg.getText().equals(Constants.URL_MENU_START))
//                    keyboardBuilder.keyboardMarkBuilder(this, update.getMessage());
            }else{
                sendText(id, msg.getText());
//                keyboardBuilder.keyboardMarkBuilder(this, update.getMessage());
            }

        }else{
            sendText(id, msg.getText());
        }

//        sendText(id, mensage);
    }

    public void sendText(Long who, String what){
        SendMessage sm = SendMessage.builder()
                .chatId(who.toString())
                .text(what)
                .parseMode(ParseMode.MARKDOWN)
                .build();
        try {
            execute(sm);
        } catch (TelegramApiException e) {
            e.printStackTrace();
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
            execute(setMyCommands);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}

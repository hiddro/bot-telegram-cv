package com.telegram.bot.cv.keyboard;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.bots.AbsSender;

import java.util.List;

public class KeyboardBuilder {

    public static void keyboardMarkBuilder(AbsSender absSender, Message message, List<String> options){
        // Crear el objeto SendMessage para enviar el menú
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText("Selecciona una opción:");

        // Crear el teclado del menú
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setOneTimeKeyboard(true); // Ocultar el teclado después de seleccionar una opción

        // Crear filas de botones del teclado
        List<KeyboardRow> keyboard = options
                .stream()
                .map(op -> {
                    KeyboardRow krow = new KeyboardRow();
                    krow.add(op);
                    return krow;
                })
                .toList();

        // Establecer el teclado en el mensaje
        keyboardMarkup.setKeyboard(keyboard);
        sendMessage.setReplyMarkup(keyboardMarkup);

        try {
            // Enviar el mensaje con el menú
            absSender.execute(sendMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

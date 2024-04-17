package com.telegram.bot.cv.keyboard;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.bots.AbsSender;

import java.util.ArrayList;
import java.util.List;

public class KeyboardBuilder {

    public static void keyboardMarkBuilder(AbsSender absSender, Message message){
        // Crear el objeto SendMessage para enviar el menú
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText("Selecciona una opción:");

        // Crear el teclado del menú
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setOneTimeKeyboard(true); // Ocultar el teclado después de seleccionar una opción

        // Crear filas de botones del teclado
        List<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        row1.add("Habilidades");
        KeyboardRow row2 = new KeyboardRow();
        row2.add("Experiencia Laboral");

        KeyboardRow row3 = new KeyboardRow();
        row3.add("Educación");

        KeyboardRow row4 = new KeyboardRow();
        row4.add("Certificados");
        keyboard.add(row1);
        keyboard.add(row2);
        keyboard.add(row3);
        keyboard.add(row4);

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

package com.telegram.bot.cv.builder;

import org.telegram.telegrambots.meta.api.objects.Update;

public class HomeBuilder {

    public static String startBuilder(){
        return "*Bienvenido estimado(@)* _${Username}!_ \n\n" +
                "¡Hola! Soy @EduBot. Estoy aquí para ayudarte a conocer más sobre mi experiencia y habilidades profesionales \n\n" +
                "Puedes hacerme preguntas sobre mi educación, experiencia laboral, habilidades y más. ¡Estoy a tu disposición para proporcionarte toda la información que necesites!".formatted();
    }
}

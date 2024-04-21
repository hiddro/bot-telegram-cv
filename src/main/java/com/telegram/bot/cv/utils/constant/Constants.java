package com.telegram.bot.cv.utils.constant;

public class Constants {

    /* LIST MENU PATH & TEMPLATES*/
    public static final String URL_MENU_START = "/start";

    public static final String TEMPLATE_MENU_START = "*Bienvenido estimado(@)* _${Username}!_ \n\n" +
            "¡Hola! Soy @EduBot. Estoy aquí para ayudarte a conocer más sobre mi experiencia y habilidades profesionales \n\n" +
            "Puedes hacerme preguntas sobre mi educación, experiencia laboral, habilidades y más. ¡Estoy a tu disposición para proporcionarte toda la información que necesites!".formatted();

    public static final String URL_MENU_INFO = "/info";

    public static final String TEMPLATE_MENU_INFO = "*Info menu*";

    public static final String URL_MENU_RESUMEN = "/resumen";

    public static final String TEMPLATE_MENU_RESUMEN = "*Resumen menu*";

    public static final String URL_MENU_CONTACTO = "/contacto";

    public static final String TEMPLATE_MENU_CONTACTO = "*Contacto menu*";
}

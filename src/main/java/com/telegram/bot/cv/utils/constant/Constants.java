package com.telegram.bot.cv.utils.constant;

public class Constants {

    /* LIST MENU PATH & TEMPLATES*/
    public static final String URL_MENU_START = "/start";

    public static final String TEMPLATE_MENU_START = "\uD83C\uDF1F *¡Bienvenido estimado(@)* _${Username}!_ \n\n" +
            "¡Hola! Soy @EduBot. Estoy aquí para ayudarte a conocer más sobre mi experiencia y habilidades profesionales \n\n" +
            "Puedes hacerme preguntas sobre mi educación, experiencia laboral, habilidades y más. ¡Estoy a tu disposición para proporcionarte toda la información que necesites!".formatted();

    public static final String URL_MENU_INFO = "/info";

    public static final String TEMPLATE_MENU_INFO = "\uD83C\uDF1F Aquí encontrarás toda la información relevante sobre mí. Desde mi educación y experiencia laboral hasta mis habilidades y certificados.".formatted();

    public static final String URL_MENU_RESUMEN = "/resumen";

    public static final String TEMPLATE_MENU_RESUMEN = "\uD83C\uDF1F Si van a empezar un proceso y quieren validar si cumplo con los requisitos dejare adjunto mi Curriculum Vitae, además el repositorio de mis proyectos personales".formatted();

    public static final String URL_MENU_CONTACTO = "/contacto";

    public static final String TEMPLATE_MENU_CONTACTO = "\uD83C\uDF1F Si tienes alguna pregunta específica o quieres saber más sobre algún aspecto en particular, no dudes en contactarme por mis redes sociales. Estoy aquí para ayudarte a conocerme mejor. \n\n" +
            "✔\uFE0F [Linkedin](https://www.linkedin.com/in/edwardcca/) \n\n" +
            "✔\uFE0F [WhatsApp](https://wa.me/+51983478763) \n\n" +
            "✔\uFE0F Gmail   - edd.ckalb@gmail.com \n\n" +
            "✔\uFE0F Outlook - dde.ckalb@hotmail.com".formatted();
}

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

    /* LIST SUB MENU PATH & TEMPLATES*/
    public static final String CAD_HABILIDADES = "Habilidades";

    public static final String TEMPLATE_SUB_MENU_HABILIDADES = "\uD83C\uDF10 A continuación mis habilidades: \n\n" +
            "\uD83D\uDD32 Lenguajes de Programación.- Java, Javascript, Typescript \n\n" +
            "\uD83D\uDD32 Framework y Tecnologia Backend.- Java 8/11, Spring Boot, Spring Cloud, Spring Data, Spring Security, Spring Webfluxm, RxJava, Spring Kafka \n\n" +
            "\uD83D\uDD32 Bases de Datos.- MongoDB, Azure Cosmos DB, MySQL, PostgreSQL \n\n" +
            "\uD83D\uDD32 Control de Versiones.- Git, GitHub, BitBucket \n\n" +
            "\uD83D\uDD32 Gestión de Proyectos y Tareas.- Jira, Miro, Trello, Notion \n\n" +
            "\uD83D\uDD32 Herramientas y Tecnologias Adiciones.- Maven, Sonar, Postman, DBeaver, JPA, Hibernate, Docker, Kubernetes, SwaggerHUB, Microservicios, Patrones de diseño, Azure Services, JUnit, Mockito, ELK, Dynatrace, Jenkins, Confluent".formatted();

    public static final String CAD_EXPERIENCIA_LABORAL = "Experiencia Laboral";

    public static final String TEMPLATE_SUB_MENU_EXPERIENCIA_LABORAL = "\uD83D\uDC68\u200D\uD83D\uDCBC Estare colocando en una lista desde mi experiencia laboral actual a la mas antigua: \n\n" +
            "\uD83D\uDD32 Java Backend Software Developer   - Tata Consultancy Services \n\n" +
            "\uD83D\uDD32 Java Backend Developer APX / ASO  - INDRA \n\n" +
            "\uD83D\uDD32 Center Developer / Java Developer - NTT DATA \n\n" +
            "\uD83D\uDD32 Consultor SCP / Java Developer    - ITTEAM CORP \n\n" +
            "\uD83D\uDD32 Consultor SCP                     - CSTI CORP".formatted();

    public static final String CAD_EDUCACION = "Educación";

    public static final String TEMPLATE_SUB_MENU_EDUCACION = "\uD83E\uDDD1\u200D\uD83C\uDF93 Actualmente estoy llevando mi ultimo ciclo en la *UTP*  - *Universidad Técnologica del Perú*, donde estudio la carrera de *Ingeniería de Software*".formatted();

    public static final String CAD_CERTIFICADOS = "Certificados";

    public static final String TEMPLATE_SUB_MENU_CERTIFICADOS = "\uD83D\uDCDA En la siguiente lista aparecera mis certificados mas imporntantes durante estos ultimos años: \n\n" +
            "\uD83D\uDD32 Java 11 Fundamentals Developer - CIBERTEC \n\n" +
            "\uD83D\uDD32 Java 11 Web Developer - CIBERTEC \n\n" +
            "\uD83D\uDD32 Microservicios con Java y Azure, Arquitectura Distribuida Cloud - Aforo255 \n\n" +
            "\uD83D\uDD32 Java 11 Backend Developer - MITOCODE \n\n" +
            "\uD83D\uDD32 Spring Webflux, Reactor - MITOCODE \n\n" +
            "\uD83D\uDD32 AZ900 Azure Fundamentals - MITOCODE".formatted();

    public static final String CAD_CV = "Curriculum Vitae";

    public static final String TEMPLATE_SUB_MENU_CV = "\uD83D\uDDD2\uFE0F En el siguiente enlace podra visualizar mi Curriculim Vitae con mas precision experiencia laboral y las responsabilidades en cada rol que estuve asignado. \n\n" +
            "✔\uFE0F [Cv](https://drive.google.com/file/d/1JNppz0tE0bfkPO_TD4nILTYfntnD3e15/view?usp=sharing)".formatted();

    public static final String CAD_GITHUB = "GitHub";

    public static final String TEMPLATE_SUB_MENU_GITHUB = "\uD83D\uDDA5\uFE0F Todos mis proyectos personales o desarrollos backend se encuentran en mi repositorio de GitHub, el cuál mostrara un poco de información respecto a las herramientas que utilizo. \n\n" +
            "✔\uFE0F [GitHub](https://github.com/hiddro)".formatted();

}

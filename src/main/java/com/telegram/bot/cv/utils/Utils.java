package com.telegram.bot.cv.utils;

import com.telegram.bot.cv.utils.constant.Constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utils {

    public static List<String> validatekeyboard(String msg){
        return msg.equalsIgnoreCase(Constants.URL_MENU_INFO) ?
                Arrays.asList("Habilidades", "Experiencia Laboral", "Educación", "Certificados") :
                msg.equalsIgnoreCase(Constants.URL_MENU_RESUMEN) ? Arrays.asList("Curriculum Vitae", "Linkedin") : Collections.emptyList();
    }

}

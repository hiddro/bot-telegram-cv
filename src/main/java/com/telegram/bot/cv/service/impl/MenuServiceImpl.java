package com.telegram.bot.cv.service.impl;

import com.telegram.bot.cv.models.Menu;
import com.telegram.bot.cv.service.MenuService;
import com.telegram.bot.cv.utils.constant.Constants;
import lombok.extern.slf4j.Slf4j;
import org.jvnet.hk2.annotations.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Arrays;

@Service
@Slf4j
public class MenuServiceImpl implements MenuService {

    @Override
    public String buildMessageMenu(String path, Update update) {
        Menu menuStart = new Menu(Constants.URL_MENU_START, Constants.TEMPLATE_MENU_START);
        Menu menuInfo = new Menu(Constants.URL_MENU_INFO, Constants.TEMPLATE_MENU_INFO);
        Menu menuResumen = new Menu(Constants.URL_MENU_RESUMEN, Constants.TEMPLATE_MENU_RESUMEN);
        Menu menuContacto = new Menu(Constants.URL_MENU_CONTACTO, Constants.TEMPLATE_MENU_CONTACTO);

        return Arrays.asList(menuStart, menuInfo, menuResumen, menuContacto)
                .stream()
                .filter(el -> el.getPath().equals(path))
                .findFirst()
                .map(mn -> {
                    if(mn.getPath().equals(Constants.URL_MENU_START))
                        return mn.getTemplate().replace("${Username}", update.getMessage().getFrom().getUserName());

                    return mn.getTemplate();
                })
                .get();
    }
}

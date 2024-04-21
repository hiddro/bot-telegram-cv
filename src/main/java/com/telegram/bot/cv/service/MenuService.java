package com.telegram.bot.cv.service;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface MenuService {
    String buildMessageMenu(String path, Update update);
}

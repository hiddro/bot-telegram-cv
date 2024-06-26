package com.telegram.bot.cv.config;

import com.telegram.bot.cv.Bot;
import com.telegram.bot.cv.keyboard.KeyboardBuilder;
import com.telegram.bot.cv.service.impl.MenuServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Configuration
public class TelegramBotConfiguration {

    @Bean
    public Bot bot() {
        return new Bot(new MenuServiceImpl(), new KeyboardBuilder());
    }

    @Bean
    public TelegramBotsApi telegramBotsApi() throws TelegramApiException {
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        botsApi.registerBot(bot());
        return botsApi;
    }

}

package com.telegram.bot.cv;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class CvApplication {

	public static void main(String[] args) throws TelegramApiException{
		try {
			TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
			Bot bot = new Bot();
			botsApi.registerBot(bot);
//			bot.setBotCommands();
//			bot.sendText(1532979869L, "Hello World!");  //The L just turns the Integer into a Long
			//1532979869
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

}

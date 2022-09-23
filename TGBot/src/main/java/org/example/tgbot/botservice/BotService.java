package org.example.tgbot.botservice;

import com.pengrad.telegrambot.Callback;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.response.BaseResponse;

import java.io.IOException;

public class BotService {

    private final String TOKEN = "5275496275:AAGNfXr1aZZ6Fpdql0sG6RWWd-0tk_3uRdw";
    private final TelegramBot bot = new TelegramBot(TOKEN);

    public void initUpdateListener() {

        bot.setUpdatesListener(updates -> {

            for (Update update : updates) {

                if (update.message() != null && update.message().text() != null) {
                    long chatId = update.message().chat().id();
                    String messageFromUser = update.message().text();
                    System.out.println(messageFromUser);
                    MessageAnalyzer.analyzeMessage(chatId, messageFromUser,this.bot);
                }
            }
            return UpdatesListener.CONFIRMED_UPDATES_ALL;

        });
    }

    static Callback emptyCallback = new Callback() {
        @Override
        public void onResponse(BaseRequest request, BaseResponse response) {
        }

        @Override
        public void onFailure(BaseRequest request, IOException e) {
            e.printStackTrace();
        }
    };
}

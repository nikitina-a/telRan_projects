package org.example.tgbot.botservice;

import com.pengrad.telegrambot.Callback;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import com.pengrad.telegrambot.response.SendResponse;
import org.example.tgbot.Berlin24Searcher;
import org.example.tgbot.CatalogParser;
import org.example.tgbot.utils.TelegramKeyBoard;

import java.io.IOException;
import java.util.List;

public class MessageAnalyzer {

    public static void analyzeMessage(long chatId, String message, TelegramBot bot) {
        if (message.equals("/start") || message.equals("Новый поиск")) {
            initOnStart(chatId, message, bot);

        } else {
            processMessage(chatId, message, bot);
        }
    }


    private static void initOnStart(long chatId, String message, TelegramBot bot) {

        var replyKeyboardMarkup = TelegramKeyBoard.createTelegramKeyboard(Berlin24Searcher.getLabels());
        SendResponse execute = bot.execute(new SendMessage(chatId, "Berlin 24").replyMarkup(replyKeyboardMarkup));
    }

    private static void processMessage(long chatId, String message, TelegramBot bot) {

        if (Berlin24Searcher.getLabels().contains(message)) {
            Berlin24Searcher searcher = new Berlin24Searcher();
            searcher.getLinksAndLabels();

            CatalogParser catalogParser = new CatalogParser(searcher, message);
            catalogParser.createCatalog();
            List<String> catalog = catalogParser.getCatalog();

            catalog.forEach(info-> bot.execute(new SendMessage(chatId, info),BotService.emptyCallback));


            SendResponse execute4 = bot.execute(new SendMessage(chatId, "Berlin 24").replyMarkup(TelegramKeyBoard.createBotton()));

        }
    }



}



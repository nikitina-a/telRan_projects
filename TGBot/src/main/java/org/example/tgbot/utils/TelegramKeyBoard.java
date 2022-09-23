package org.example.tgbot.utils;

import com.pengrad.telegrambot.model.request.Keyboard;
import com.pengrad.telegrambot.model.request.KeyboardButton;
import com.pengrad.telegrambot.model.request.ReplyKeyboardMarkup;

import java.util.List;

public class TelegramKeyBoard {


    public static Keyboard createTelegramKeyboard(List<String> labels){
      return new ReplyKeyboardMarkup(
                new String[]{labels.get(0),labels.get(1),labels.get(2)},
                new String[]{labels.get(3),labels.get(4),labels.get(5)},
                new String[]{labels.get(6),labels.get(7),labels.get(8)},
                new String[]{labels.get(9),labels.get(10),labels.get(11)},
                new String[]{labels.get(12),labels.get(13),labels.get(14)},
                new String[]{labels.get(15),labels.get(16),labels.get(17)},
                new String[]{labels.get(18),labels.get(19),labels.get(20)},
                new String[]{labels.get(21),labels.get(22),labels.get(23)},
                new String[]{labels.get(24),labels.get(25),labels.get(26)},
                new String[]{labels.get(27),labels.get(28),labels.get(29)},
                new String[]{labels.get(30),labels.get(31),labels.get(32)},
                new String[]{labels.get(33),labels.get(34),labels.get(35)},
                new String[]{labels.get(36),labels.get(37),labels.get(38)}
        )
                .oneTimeKeyboard(true)
                .resizeKeyboard(true)
                .selective(true);
    }

    public static ReplyKeyboardMarkup createBotton() {
        return new ReplyKeyboardMarkup(
                new KeyboardButton[]{
                        new KeyboardButton("Новый поиск")
                });
    }

    public static ReplyKeyboardMarkup createAnotherBotton() {
        return new ReplyKeyboardMarkup(
                new KeyboardButton[]{
                        new KeyboardButton("Ещё")
                });
    }
}

package main.com.vladpetrishin.service.impl;

import main.com.vladpetrishin.service.MessageService;

/**
 * Created by Влад on 8/27/2016.
 */
public class MessageServiceImpl implements MessageService {

    @Override
    public String getGreetings(String name) {
        return String.format("Hello %s! How are you?", name);
    }
}

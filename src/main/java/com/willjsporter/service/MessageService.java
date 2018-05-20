package com.willjsporter.service;

import com.willjsporter.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageService {

    public List<Message> getAllMessages() {
        Message message1 = new Message(1, "Hello World", "Will");
        Message message2 = new Message(2, "Hello Koushik", "Will");
        List<Message> messages = new ArrayList<>();
        messages.add(message1);
        messages.add(message2);
        return messages;
    }
}

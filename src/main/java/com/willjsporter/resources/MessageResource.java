package com.willjsporter.resources;

import com.willjsporter.model.Message;
import com.willjsporter.service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/messages")
public class MessageResource {

    private MessageService messageService = new MessageService();


//    public static void main(String... args) {
//        MessageService test = new MessageService();
//        Message message1 = new Message(1, "Hello World", "Will");
//        Message message2 = new Message(2, "Hello Koushik", "Will");
//        System.out.println(test.addMessage(message1));
//        System.out.println(test.addMessage(message2));
//        System.out.println(test.getAllMessages());
//        System.out.println(test.removeMessage(1L));
//        System.out.println(test.getMessage(2).getMessage());
//        System.out.println(test.getMessage(1));
//        System.out.println(test.getAllMessages());
//    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages() { return messageService.getAllMessages(); }
}

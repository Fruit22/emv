package ru.emv.message;

import org.springframework.stereotype.Service;

/**
 * Created by fruit on 17.04.2017.
 */
@Service
public class MessageBuilder {
    private int id;
    private String message;

    public MessageBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public MessageBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public EventMessage build () {
        return new EventMessage(id, message);
    }
}

package ru.emv.message;

/**
 * Created by fruit on 17.04.2017.
 */
public class EventMessage {
    private final int id;
    private final String message;

    public EventMessage(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }


    @Override
    public String toString() {
        return message + " " + id;
    }
}

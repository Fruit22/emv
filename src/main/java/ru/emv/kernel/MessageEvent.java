package ru.emv.kernel;

/**
 * Created by fruit on 17.04.2017.
 */
public class MessageEvent {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

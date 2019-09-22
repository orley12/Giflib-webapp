package com.teamtreehouse.giflib.exc;

public class NotEmptyException extends Throwable {

    private String message;

    public NotEmptyException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

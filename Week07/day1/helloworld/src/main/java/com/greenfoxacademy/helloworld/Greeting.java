package com.greenfoxacademy.helloworld;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    long id;
    String content;
    static AtomicLong currentID = new AtomicLong(0);

    public static AtomicLong getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(AtomicLong currentID) {
        Greeting.currentID = currentID;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}

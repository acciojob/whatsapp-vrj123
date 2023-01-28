package com.driver;

import java.util.Date;

public class Message {
    private int id;
    private String content;
    private Date timestamp;

    Message(String content){
        this.content=content;
        Date obj = new Date();
        this.timestamp=obj;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public void setTimestamp(Date timestamp){
        this.timestamp=timestamp;
    }

    public Date getTimestamp(){
        return this.timestamp;
    }
}

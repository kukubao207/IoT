package nju.edu.IoT.entity;

import lombok.Data;

@Data
public class Message<T> {
    private T data;
    private int code;
    private String info;

    public Message(T data, int code, String info) {
        this.data = data;
        this.code = code;
        this.info = info;
    }
}
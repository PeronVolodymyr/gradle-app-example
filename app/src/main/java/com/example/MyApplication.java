package com.example;

import org.apache.commons.lang3.StringUtils;

public class MyApplication {
    public static void main(String[] args) {
        var message = StringUtils.capitalize("Hello World!");
        new PrintService().print(new MessageModel(message));
    }
}

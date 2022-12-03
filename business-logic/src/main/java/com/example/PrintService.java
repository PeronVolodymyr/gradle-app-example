package com.example;

import org.apache.commons.lang3.StringUtils;

public class PrintService {
    public void print(MessageModel model) {
        var message = StringUtils.trim(model.getMessage());
        System.out.println(message);
    }
}

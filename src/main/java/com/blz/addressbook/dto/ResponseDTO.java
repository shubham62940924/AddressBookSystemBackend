package com.blz.addressbook.dto;

import com.blz.addressbook.entity.Contact;
import lombok.Data;

import java.util.Optional;

@Data
public class ResponseDTO {
private String message;
    private Object data;

    /**
     *
     * @param message
     * @param data
     */
    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}

package com.toomuch2learn.springboot2.crud.catalogue.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Error {

    private int code;
    private String message;
    private String description;
}

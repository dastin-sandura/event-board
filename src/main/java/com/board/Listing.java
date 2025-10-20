package com.board;

import lombok.Data;

@Data
public class Listing {

    private String name;

    private String description;

    private User author;
}

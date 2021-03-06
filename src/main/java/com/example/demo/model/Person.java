package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;



import java.util.UUID;

public class Person {

    private final UUID id;
    //@NotNull // I cannot use adnotation is @NotBlank, instead of this I used @NotNull -> I cannot post a null object, however i can post blank 'name'.
    private final String name;

    public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

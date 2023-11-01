package com.hauschildt.demo.day21;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Name {
    @JsonProperty("title")
    private String title;
    @JsonProperty("first")
    private String first;
    @JsonProperty("last")
    private String last;

    public String getTitle() {
        return title;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }
    
    public String getFullName() {
        return first + " " + last;
    }

    @Override
    public String toString() {
        return title + ' ' + first + ' ' + last ;
    }
}
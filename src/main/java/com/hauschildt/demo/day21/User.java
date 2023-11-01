package com.hauschildt.demo.day21;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("name")
    private Name name;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("cell")
    private String cell;
    @JsonProperty("nat")
    private String nat;
    @JsonProperty("picture")
    private Picture picture;

    public Name getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getCell() {
        return cell;
    }

    public String getNat() {
        return nat;
    }

    public Picture getPicture() {
        return picture;
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                "\n\tgender='" + gender + '\'' +
                "\n\tlocation=" + location +
                "\n\temail='" + email + '\'' +
                "\n\tphone='" + phone + '\'' +
                "\n\tcell='" + cell + '\'' +
                "\n\tnat='" + nat + '\'' +
                "\n\tpicture='" + picture + '\'' +
                "}\n";
    }
}

package com.zahid.entity;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
    private Long userId;
    @NotNull(message = "Username cannot be empty")
    @Size(min = 4, max = 20, message = "Size needs to be between 4-20")
    @Pattern(regexp = "^[A-Za-z0-9]+([-_.][A-Za-z0-9]+){0,2}$", message = "Invalid format, it can only take A-z, 0-9, .,-,_")
    private String userName;
    @NotNull(message = "First Name cannot be empty")
    @Size(min = 4, max = 20, message = "Size needs to be between 4-20")
    @Pattern(regexp = "^[A-Z][a-z]+$", message = "Invalid format. Must Start with capital and only take A-z")
    private String firstName;
    @NotNull(message = "Last Name cannot be empty")
    @Size(min = 4, max = 20, message = "Size needs to be between 4-20")
    @Pattern(regexp = "^[A-Z][a-z]+$", message = "Invalid format. Must Start with capital and only take A-z")
    private String lastName;

    private boolean enabled;
    @NotNull(message = "Are you belongs to 3rd Gender? Please select one")
    private String gender;
    @NotNull
//    @Pattern(regexp = "$[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
//            message = "Invalid Email Format")
    @Email
    private String email;

    public User() {
    }

    public User(Long userId, String userName, String firstName, String lastName, boolean enabled, String gender, String email) {
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;
        this.gender = gender;
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package models;

import exceptions.EmailException;

public class Maker {

    private String name;
    private String email;
    private String gender;


    public Maker(String name, String email, String gender) throws EmailException {
        isEmailValid(email);
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    private void isEmailValid(String email) throws EmailException {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if (!email.matches(regex)) {
            throw new EmailException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Maker{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

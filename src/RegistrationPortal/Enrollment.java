package RegistrationPortal;

import java.util.InputMismatchException;

public class Enrollment {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public String firstName(String firstName) {

        return this.firstName = firstName;

    }
    public String lastName(String firstName) {

        return this.firstName = firstName;

    }


    public String getEmail(String email) {
        System.out.println(email);
        return this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword() {
        return this.password;
    }


    public void getCourse(int course,String password) {

        if(password.equals(this.password)){

        }
    }
}
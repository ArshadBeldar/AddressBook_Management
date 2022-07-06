package com.infogalaxy;

public class Contact {
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private String phonenumber;
    private String email;

    //getter Method....

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {

        return this.state;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public String getEmail(){
        return  this.email;
    }


//setter Method...

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phoneno='" + phonenumber + '\'' +
                ", emailId='" + email + '\'' +
                '}';
    }
}

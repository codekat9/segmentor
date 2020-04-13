package com.myproject.segmentor.Beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@ApiModel(description = "Contacts are the details of the customers you have done some" +
        " business or are the potential customers.")
public class Contacts {

    @Id
    @ApiModelProperty(notes = "The Unique ID of Contact")
    private String id;
    @Field("first_name")
    @ApiModelProperty(notes = "The first name of Contact")
    private String firstName;
    @Field("last_name")
    @ApiModelProperty(notes = "The last name of Contact")
    private String lastName;
    @ApiModelProperty(notes = "The title/surname of Contact")
    private String title;
    private String country;
    private String city;
    private String postcode;
    private String street;
    @Field("house_number")
    private String houseNumber;
    private String gender;
    @ApiModelProperty(notes = "Email address of Contact")
    private String email;
    @Field("email_optin")
    @ApiModelProperty(notes = "Information whether a customer has given consent to be contacted via email.")
    private String emailOptIn;
    @Field("phone_number")
    private String phoneNo;
    @Field("phone_number_optin")
    private String phoneNoOptIn;
    @Field("date_of_birth")
    private String dateOfBirth;

    public Contacts(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
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

    public String getEmailOptIn() {
        return emailOptIn;
    }

    public void setEmailOptIn(String emailOptIn) {
        this.emailOptIn = emailOptIn;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNoOptIn() {
        return phoneNoOptIn;
    }

    public void setPhoneNoOptIn(String phoneNoOptIn) {
        this.phoneNoOptIn = phoneNoOptIn;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



}

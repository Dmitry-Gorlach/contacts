package com.itechart.stlab.contacts.model;

class PhoneNumber extends Entity {
    private int contactId;
    private String countryCode;
    private String phoneCode;
    private String number;
    private TypeCode type;
    private String comment;

}

enum TypeCode{
    HOME, MOBILE
}


   


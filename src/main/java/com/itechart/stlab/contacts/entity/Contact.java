package com.itechart.stlab.contacts.entity;

import java.time.*;

public class Contact extends Entity{

    private static final long serialVersionUID = -91248281876276786L;

    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birthday;
    private Gender gender;
    private String nationality;
    private String maritalStatus;
    private String company;
    private String webSite;
    private String email;
    private String currentJob;
    private Address address;

}

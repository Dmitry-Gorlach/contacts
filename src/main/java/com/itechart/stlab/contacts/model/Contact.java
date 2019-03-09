package com.itechart.stlab.contacts.model;

import java.time.*;
import java.util.*;

public class Contact extends Entity{

    private static final long serialVersionUID = -91248281876276786L;

    private String firstName;
    private String surname;
    private String lastname;
    private LocalDate birthday;
    private Gender gender;
    private String nationality;
    private String maritalStatus;
    private String company;
    private String webSite;
    private String email;
    private String currentJob;
    private Set<PhoneNumber> phoneNumbers = new HashSet<>();
    private List<Attachment> attachments = new ArrayList<>();
    private String photoUri;
    private String country;
    private String city;
    private String street;
    private String house;
    private String flat;
    private int postcode;

}

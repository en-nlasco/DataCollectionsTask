package com.company;

import java.util.Map;
import java.util.Random;

public class User {
    public long id;
    public String userName;
    public Map<String, Address> addresses;

    public User(String userName, Map<String, Address> addresses) {
        this.id = new Random().nextLong();
        this.userName = userName;
        this.addresses = addresses;
    }

}

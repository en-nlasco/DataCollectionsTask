package com.company;

import java.util.*;

public class User {
    public long id;
    public String userName;
    public Map<String, Address> addresses;
    public List<Item> basket;


    public User(String userName) {
        this.id = new Random().nextLong();
        this.userName = userName;
        this.addresses=new HashMap<>();
        this.basket=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName +
                '}';
    }
     public void addAddress(String type, Address address){
        this.addresses.put(type, address);
     }

     public void addToBasket(Item item){
        this.basket.add(item);
     }
}

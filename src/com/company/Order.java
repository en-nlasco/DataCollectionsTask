package com.company;

import java.time.*;
import java.util.List;
import java.util.Random;


public class Order {
    public long id;
    public LocalDateTime date;
    public User user;
    public List<Item> items;

    public Order(User user, List<Item> items) {
        this.id = new Random().nextLong();
        this.date = LocalDateTime.now();
        this.user = user;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", user=" + user +
                ", items=" + items +
                '}';


    }
}

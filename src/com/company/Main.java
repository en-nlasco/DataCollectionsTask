package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Set<Item> catalog = new HashSet<>();
        catalog.add(new Item(1, "Dress", Type.CLOTHES));
        catalog.add(new Item(2, "T-Shirt", Type.CLOTHES));
        catalog.add(new Item(3, "Pants", Type.CLOTHES));
        catalog.add(new Item(4, "Shorts", Type.CLOTHES));
        catalog.add(new Item(5, "Skirt", Type.CLOTHES));
        catalog.add(new Item(6, "Cardigan", Type.CLOTHES));
        catalog.add(new Item(7, "Shirt", Type.CLOTHES));
        catalog.add(new Item(8, "Scarf", Type.ACCESSORIES));
        catalog.add(new Item(9, "Gloves", Type.ACCESSORIES));
        catalog.add(new Item(11, "Hat", Type.ACCESSORIES));
        catalog.add(new Item(12, "Day Cream", Type.COSMETICS));
        catalog.add(new Item(13, "Night Cream", Type.COSMETICS));
        catalog.add(new Item(14, "Eye Cream", Type.COSMETICS));
        catalog.add(new Item(15, "Perfume", Type.COSMETICS));
        catalog.add(new Item(16, "Foreo", Type.GADGET));
        catalog.add(new Item(17, "MiBand", Type.GADGET));
        catalog.add(new Item(18, "AppleWatch", Type.GADGET));
        List<User> users = new ArrayList<>();
        users.add(new User("Tom Brady"));
        users.add(new User("Emma Stone"));
        users.add(new User("Guillermo Del Toro"));
        users.add(new User("Quentin Tarantino"));
        users.add(new User("Uma Turman"));
        users.add(new User("Scarlett Johansson"));
        users.add(new User("John Travolta"));
        users.add(new User("Tom Hanks"));

        users.get(3).addAddress("Billing", new Address("Moldova", "Chisinau", "Cuza Voda"));
        users.get(3).addAddress("Shipping", new Address("Moldova", "Orhei", "Vasile Lupu"));
        users.get(3).addToBasket(pickItem("T-Shirt", Type.CLOTHES, catalog));
        users.get(3).addToBasket(pickItem("Pants", Type.CLOTHES, catalog));
        users.get(3).addToBasket(pickItem("AppleWatch", Type.GADGET, catalog));

        users.get(4).addAddress("Billing", new Address("Moldova", "Chisinau", "Alecu Russo"));
        users.get(4).addAddress("Shipping", new Address("Moldova", "Chisinau", "Alecu Russo"));
        users.get(4).addToBasket(pickItem("Dress", Type.CLOTHES, catalog));
        users.get(4).addToBasket(pickItem("Sandals", Type.SHOES, catalog));
        users.get(4).addToBasket(pickItem("Foreo", Type.GADGET, catalog));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(users.get(3), users.get(3).basket));
        orders.add(new Order(users.get(4), users.get(4).basket));

        System.out.println(orders);
        System.out.println(filterOrderByItemType(orders, Type.CLOTHES));
        System.out.println(filterUsersByCity(users, "Chisinau"));


    }

    static Item pickItem(String title, Type type, Set<Item> catalog) {
        Item pickedItem = null;
        for (Item item : catalog)
            if (title == item.title && type == item.type)
                pickedItem = item;
        return pickedItem;
    }

    static List<Order> filterOrderByItemType(List<Order> orders, Type type) {
        List<Order> filteredList = new ArrayList<>();
        for (Order o : orders)
            for (Item i : o.items)
                if (i.type == type) {
                    filteredList.add(o);
                    break;
                }
        return filteredList;
    }

    static List<User> filterUsersByCity(List<User> users, String city) {
        List<User> filteredUsers = new ArrayList<>();
        for (User u : users)
            for (Address a : u.addresses.values())
                if (a.city == city) {
                    filteredUsers.add(u);
                    break;
                }
        return filteredUsers;
    }
}

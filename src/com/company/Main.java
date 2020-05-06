package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Set<Item> catalog= new HashSet<>();
        catalog.add(new Item(1,"Dress",Type.CLOTHES));
        catalog.add(new Item(2,"T-Shirt",Type.CLOTHES));
        catalog.add(new Item(3,"Pants",Type.CLOTHES));
        catalog.add(new Item(4,"Shorts",Type.CLOTHES));
        catalog.add(new Item(5,"Skirt",Type.CLOTHES));
        catalog.add(new Item(6,"Cardigan",Type.CLOTHES));
        catalog.add(new Item(7,"Shirt",Type.CLOTHES));
        catalog.add(new Item(8,"Scarf",Type.ACCESSORIES));
        catalog.add(new Item(9,"Gloves",Type.ACCESSORIES));
        catalog.add(new Item(11,"Hat",Type.ACCESSORIES));
        catalog.add(new Item(12,"Day Cream",Type.COSMETICS));
        catalog.add(new Item(13,"Night Cream",Type.COSMETICS));
        catalog.add(new Item(14,"Eye Cream",Type.COSMETICS));
        catalog.add(new Item(15,"Perfume",Type.COSMETICS));
        catalog.add(new Item(16,"Foreo",Type.GADGET));
        catalog.add(new Item(17,"MiBand",Type.GADGET));
        catalog.add(new Item(18,"MiBand",Type.GADGET));


    }
}

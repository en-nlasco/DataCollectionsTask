package com.company;

import java.util.Objects;

public class Item {
    public long id;
    public String title;
    public Type type;

    public Item(long id, String title, Type type) {
        this.id = id;
        this.title = title;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return title.equals(item.title) &&  type.equals(item.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, type);
    }

}

package com.wu.类.泛型;

import com.wu.静态块.Parent;

public class Plate<T> {
    T item;

    public Plate(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Plate<? extends Fruit> plate = new Plate<>(new Fruit());
        //plate.setItem(new Apple());
    }
}


class Fruit{}
class Apple extends Fruit{}
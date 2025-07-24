package com.study._38_Generic.animal;

public abstract class Animal {
    private String name;
    private int size;

    public Animal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    public abstract void sound();
}

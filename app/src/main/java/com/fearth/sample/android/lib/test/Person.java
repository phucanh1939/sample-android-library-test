package com.fearth.sample.android.lib.test;

import androidx.annotation.NonNull;

class Person {
    public String name;
    public int age;

    // Constructor (needed for object creation)
    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @NonNull
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
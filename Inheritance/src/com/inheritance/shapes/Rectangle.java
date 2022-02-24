package com.inheritance.shapes;

class Rectangle extends Shapes {

    public Rectangle(String name, int a, int b) {
        super(name, a, b);
    }

    public int area() {
        return a * b;
    }

}
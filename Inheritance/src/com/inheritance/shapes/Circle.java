package com.inheritance.shapes;

class Circle extends Shapes {

    Circle(String name, int a) {
        super(name, a);
    }

    public int area() {
        return (int) (Pi * a * a);
    }
}
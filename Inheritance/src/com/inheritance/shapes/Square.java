package com.inheritance.shapes;

class Square extends Shapes {

    public Square(String name, int a) {
        super(name, a);

    }

    public int area() {
        return a * a;
    }
}

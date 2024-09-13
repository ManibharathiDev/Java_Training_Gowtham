package org.example;

public class Area {
    int l;
    int b;

    Area(int l)
    {
        this.l = l;
    }

    Area(int l, int b)
    {
        this.l = l;
        this.b = b;
    }

    int square()
    {
        return this.l*this.l;
    }

    int rect(){
        return this.l*this.b;
    }
}

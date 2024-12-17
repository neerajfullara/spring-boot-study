package org.practice;

public class Dev {

    private Computer comp;

    public Dev(){
        System.out.println("Dev Constructor");
    }


    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build(){

        System.out.println("Working on Awesome Project.");
        comp.compile();
    }
}

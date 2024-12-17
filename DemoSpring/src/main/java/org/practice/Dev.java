package org.practice;

public class Dev {

    private Laptop laptop;
    private int age;

//    setter injection ----
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
//    ---------

//    constructor injection ------
    public Dev(int age) {
        this.age = age;
        System.out.println("Dev new constructor for constructor injection!");
    }
//    ----------


    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Dev(){
        System.out.println("Dev Constructor");
    }

    public void build(){

        System.out.println("Working on Awesome Project.");
        laptop.compile();
    }
}

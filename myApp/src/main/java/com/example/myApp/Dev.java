package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {


    /*
    If we got multiple beans which implementing the same interface and both having @Component define then compiler will get
    confused, and it will give this error
    "
    example:-
    Description:
    Field comp in com.example.myApp.Dev required a single bean, but 2 were found:
	- desktop: defined in file [C:\Users\admin\Desktop\Java Practice\myApp\target\classes\com\example\myApp\Desktop.class]
	- laptop: defined in file [C:\Users\admin\Desktop\Java Practice\myApp\target\classes\com\example\myApp\Laptop.class]
    "
    To Solve this we have few methods, and methods are as follows:
    1. REMOVE @Component tag from non-desired bean.
    2. USE @Primary tag on desired class.
    what if @Primary tag is on both the classes or do not want to put @Primary tag. then use this,
    3. USE @Qualifier() tag and pass the bean name. ex - for 'Laptop' class the bean name will be 'laptop'. So, now in
    second main class put @Qualifier("laptop") after @Autowired tag.
    */
    @Autowired // Field Injection
    @Qualifier("laptop")
    private Computer comp;

//    // Construction Injection
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){

        comp.compile();
        System.out.println("Working on Code.");
    }
}

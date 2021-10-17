package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Details obj1 = new Details();
        Details obj2 = new Details();
        obj1.age = 19;
        obj1.height = 178;
        obj1.name = "nitin";
        obj2.age = 20;
        obj2.height = 186;
        obj2.name = "rahul";
        obj1.walk();
        obj1.walk(78);
        obj2.walk();
        obj2.walk(87);
    }
}

 class Details{
    String name;
    int age;
    int height;
    public void walk(){
        System.out.println(name+" is walking and his height is "+height);
    }
    public void walk(int steps){
        System.out.println(name+" whose height is "+height+" and age "+age+" is walking "+steps+" steps ");
    }

}

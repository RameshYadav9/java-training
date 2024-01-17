package org.example;

public class Person {
    public int age;
    public String name;
    public Address address;

    //Default Constructor
    public Person(){
        this.name = "Amandeep";
        this.age =50;
        this.address= new Address();
    }

    //Parameterized Constructor
    public Person(String name,int age,Address address){
        this.name =name;
        this.age =age;
        this.address= address;
    }

    public <Address> Person(int age, Address personTwoAddress) {
    }
}

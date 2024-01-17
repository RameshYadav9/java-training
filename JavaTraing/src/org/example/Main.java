package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person defaultPerson = new Person();
        System.out.println(defaultPerson.age);
        System.out.println(defaultPerson.name);
        System.out.println(defaultPerson.address);

        Address personOneAddress = new Address("Delhi","A-2",110002); //Parameterized Constructor
        Person personOne= new Person("Ramesh",24, (org.example.Address) personOneAddress);


        Address personTwoAddress = new Address("Ghaziabad","A-3",201005);//Parameterized Constructor
        Person personTwo= new Person("mausmi",24, (org.example.Address) personTwoAddress);



        System.out.println(personOne.age);
        System.out.println(personOne.name);
        System.out.println(personOne.address);

        System.out.println(personTwo.age);
        System.out.println(personTwo.name);
        System.out.println(personTwo.address);
    }
    }


package com.jwt.jwt;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Serailization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Person person = new Person("Prakash", "p@gmail.com", "123");
//
//        FileOutputStream fileOutputStream = new FileOutputStream("person.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        objectOutputStream.writeObject(person);
//        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("person.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
       Person p= (Person) objectInputStream.readObject();
       System.out.println(p.getName());
        System.out.println(p.getPassword());
        System.out.println(p.getEmail());

        AtomicInteger atm=new AtomicInteger(0);
        System.out.println("========"+atm.addAndGet(2));

        List<Integer> a1= Arrays.asList(1,2,3,4,5);
        Comparator<Integer> c=(i1, i2)->i2-i1;

        Collections.sort(a1,c);
        System.out.println("==="+a1);



        int a[]={1,2,3,4,5,6};
        int n=6;
        int k=1;
        k=k%a.length;

        int result[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            result[i]=a[(i+k)%n];
        }
        for(int i=0;i<a.length;i++){
            System.out.println(result[i]);
        }






    }
}

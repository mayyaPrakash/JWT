package com.jwt.jwt;

import java.io.*;

public class Serailization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Person person = new Person("Prakash", "p@gmail.com", "123");
//
//        FileOutputStream fileOutputStream = new FileOutputStream("person.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        objectOutputStream.writeObject(person);
//        objectOutputStream.close();

//        FileInputStream fileInputStream = new FileInputStream("person.txt");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//       Person p= (Person) objectInputStream.readObject();
//       System.out.println(p.getName());
//        System.out.println(p.getPassword());
//        System.out.println(p.getEmail());




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

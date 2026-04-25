package com;

import java.util.Scanner;

class Student {
    String name, course;
    int age;

    void display() {
        System.out.println("\n===========\n");
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String name, course;
        int age;

        Student stu = new Student();

        System.out.println("\n=====Welcome to Enrollment Form=====\n");
        System.out.println("Enroll Now!");

        System.out.print("Name: ");
        stu.name = scn.nextLine();

        System.out.print("Course: ");
        stu.course = scn.nextLine();

        System.out.print("Age: ");
        stu.age = scn.nextInt();

        stu.display();
    }
}

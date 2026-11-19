
package com.example.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> skills = new ArrayList<>();

        skills.add("Java");
        skills.add("Python");
        skills.add("SQL");

        Student s1 = new Student(
                101,
                "Anupriya Singh",
                "anupriya@gmail.com",
                "B.Tech CSE",
                90,
                85,
                skills
        );

        s1.displayDetails();

        // Update course using setter
        s1.setCourseName("Computer Science Engineering");

        System.out.println("\nAfter Updating Course:");
        System.out.println(s1.getCourseName());

        // Add new skill
        s1.addSkill("Spring Boot");

        System.out.println("Updated Skills: "
                + s1.getTechnicalSkills());
    }
}

package com.github.lophixyz;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Student {
  private long id;
  private String firstName;
  private String lastName;
  private int age;
  private DateTime dob;
  private ArrayList<Module> modules;
  private Course course;

  public Student(long id, String firstName, String lastName, int age, DateTime dob, ArrayList<Module> modules, Course course) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.dob = dob;
    this.modules = modules;
    this.course = course;
  }

  // getUsername returns a username based on the user's name and age.
  // Converts all letters in name to lower case and concatenates with age.
  public String getUsername() {
    String username = firstName + lastName;
    username = username.toLowerCase() + age;
    return username;
  }
}
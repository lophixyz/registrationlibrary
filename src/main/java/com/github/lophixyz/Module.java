package com.github.lophixyz;

import java.util.ArrayList;

public class Module {
  private String id;
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Course> courses;

  public Module(String id, String name, ArrayList<Student> students, ArrayList<Course> courses) {
    this.id = id;
    this.name = name;
    this.students = students;
    this.courses = courses;
  }
}
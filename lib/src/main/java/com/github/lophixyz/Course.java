package com.github.lophixyz;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
  private String name;
  private ArrayList<Module> modules;
  private ArrayList<Student> students;
  private DateTime startDate;
  private DateTime endDate;

  public Course(String name, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate, DateTime endDate) {
    this.name = name;
    this.modules = modules;
    this.students = students;
    this.startDate = startDate;
    this.endDate = endDate;
  }
}
package com.github.lophixyz;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Student {
  private static long id = 1;
  private final long studentID;
  private String firstName;
  private String lastName;
  private int age;
  private DateTime dob;
  private ArrayList<Module> modules;
  private Course course;

  public Student(String firstName, String lastName, int age, DateTime dob) {
    this.studentID = id++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.dob = dob;
    this.modules = new ArrayList<Module>();
  }
  public long getStudentID() {
    return studentID;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public DateTime getDob() {
    return dob;
  }

  public void setDob(DateTime dob) {
    this.dob = dob;
  }

  public ArrayList<Module> getModules() {
    return modules;
  }

  public void addModule(Module module) {
    this.modules.add(module);
  }

  public void removeModule(Module module) {
    this.modules.remove(module);
  }

  public void removeAllModules() {
    this.modules.clear();
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
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
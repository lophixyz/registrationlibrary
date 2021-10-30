package com.github.lophixyz;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Student {
  private static long id = 1;
  private final long studentID;
  private String firstName;
  private String lastName;
  private String username;
  private int age;
  private DateTime dob;
  private final ArrayList<Module> modules;
  private Course course;

  public Student(String firstName, String lastName, int age, DateTime dob) {
    this.studentID = id++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = generateUsername(firstName, lastName, age);
    this.age = age;
    this.dob = dob;
    this.modules = new ArrayList<>();
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

  public String getUsername() {
    if (username.isEmpty()) {
      username = generateUsername(firstName, lastName, age);
    }
    return username;
  }

  // generateUsername returns a username based on the user's name and age.
  // Converts all letters in name to lower case and concatenates with age.
  public String generateUsername(String firstName, String lastName, int age) {
    String username = firstName + lastName;
    username = username.replace(" ", "");
    username = username.toLowerCase() + age;
    return username;
  }
}
package com.github.lophixyz;

import java.util.ArrayList;

public class Module {
  private String id;
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Course> courses;

  public Module(String id, String name) {
    this.id = id;
    this.name = name;
    this.students = new ArrayList<Student>();
    this.courses = new ArrayList<Course>();
  }

  public ArrayList<Student> getStudents() {
    return students;
  }

  public void registerStudent(Student student) {
    students.add(student);
  }

  public void unregisterStudent(Student student) {
    students.remove(student);
  }

  public void unregisterAllStudents() {
    students.clear();
  }

  public ArrayList<Course> getCourses() {
    return courses;
  }

  public void addCourse(Course course) {
    courses.add(course);
  }

  public void removeCourse(Course course) {
    courses.remove(course);
  }

  public void removeAllCourses() {
    courses.clear();
  }
}
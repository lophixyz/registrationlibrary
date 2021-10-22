package com.github.lophixyz;

import java.util.ArrayList;

public class Module {

  private final String id;
  private final String name;
  private final ArrayList<Student> students;
  private final ArrayList<Course> courses;

  public Module(String id, String name) {
    this.id = id;
    this.name = name;
    this.students = new ArrayList<>();
    this.courses = new ArrayList<Course>();
  }

  public String getId() { return id; }

  public String getName() { return name; }

  public ArrayList<Student> getStudents() {
    return students;
  }

  public ArrayList<Course> getCourses() {
    return courses;
  }

  public void registerStudent(Student student) {
    students.add(student);
    student.addModule(this);
  }

  public void unregisterStudent(Student student) {
    students.remove(student);
    student.removeModule(this);
  }

  public void unregisterAllStudents() {
    for (Student student : students) {
      student.removeModule(this);
    }
    students.clear();
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
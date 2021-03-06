package com.github.lophixyz;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class Course {

  private final ArrayList<Module> modules;
  private final ArrayList<Student> students;
  private String name;
  private DateTime startDate;
  private DateTime endDate;

  public Course(String name, DateTime startDate, DateTime endDate) {
    this.name = name;
    this.modules = new ArrayList<>();
    this.students = new ArrayList<>();
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTime startDate) {
    this.startDate = startDate;
  }

  public DateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(DateTime endDate) {
    this.endDate = endDate;
  }

  public List<Student> getStudents() {
    return students;
  }

  public List<Module> getModules() {
    return modules;
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

  public void addModule(Module module) {
    modules.add(module);
  }

  public void removeModule(Module module) {
    modules.remove(module);
  }

  public void removeAllModules() {
    modules.clear();
  }
}
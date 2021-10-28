package com.github.lophixyz;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

class ModuleTest {

  @Test
  void registerStudent() {
    Module softwareEngineeringIII = new Module("CT417", "Software Engineering III");
    Student johnSmith = new Student("John", "Smith", 22, DateTime.parse("1999-01-01"));
    softwareEngineeringIII.registerStudent(johnSmith);
    assertTrue(softwareEngineeringIII.getStudents().contains(johnSmith));
  }

  @Test
  void unregisterStudent() {
    Module softwareEngineeringIII = new Module("CT417", "Software Engineering III");
    Student johnSmith = new Student("John", "Smith", 22, DateTime.parse("1999-01-01"));
    softwareEngineeringIII.getStudents().add(johnSmith);
    softwareEngineeringIII.unregisterStudent(johnSmith);
    assertFalse(softwareEngineeringIII.getStudents().contains(johnSmith));
  }

  @Test
  void unregisterAllStudents() {
    Module softwareEngineeringIII = new Module("CT417", "Software Engineering III");
    Student johnSmith = new Student("John", "Smith", 22, DateTime.parse("1999-01-01"));
    Student marySue = new Student("Mary", "Sue", 21, DateTime.parse("1999-12-30"));
    softwareEngineeringIII.getStudents().add(johnSmith);
    softwareEngineeringIII.getStudents().add(marySue);
    softwareEngineeringIII.unregisterAllStudents();
    assertAll(
        "Software Engineering III should have no students registered",
        () -> assertFalse(softwareEngineeringIII.getStudents().contains(johnSmith)),
        () -> assertFalse(softwareEngineeringIII.getStudents().contains(marySue))
    );
  }

  @Test
  void isRegistered() {
    Module softwareEngineeringIII = new Module("CT417", "Software Engineering III");
    Student johnSmith = new Student("John", "Smith", 22, DateTime.parse("1999-01-01"));
    softwareEngineeringIII.getStudents().add(johnSmith);
    assertTrue(softwareEngineeringIII.isRegistered(johnSmith));
  }

  @Test
  void addCourse() {
    Module softwareEngineeringIII = new Module("CT417", "Software Engineering III");
    Course computerScience = new Course("Computer Science and Information Technology",
        DateTime.parse("2021-09-06"), DateTime.parse("2022-06-01"));
    softwareEngineeringIII.addCourse(computerScience);
    assertTrue(softwareEngineeringIII.getCourses().contains(computerScience));
  }

  @Test
  void removeCourse() {
    Module softwareEngineeringIII = new Module("CT417", "Software Engineering III");
    Course computerScience = new Course("Computer Science and Information Technology",
        DateTime.parse("2021-09-06"), DateTime.parse("2022-06-01"));
    softwareEngineeringIII.addCourse(computerScience);
    assertTrue(softwareEngineeringIII.getCourses().contains(computerScience));
  }

  @Test
  void removeAllCourses() {
    Module softwareEngineeringIII = new Module("CT417", "Software Engineering III");
    Course computerScience = new Course("Computer Science and Information Technology",
        DateTime.parse("2021-09-06"), DateTime.parse("2022-06-01"));
    softwareEngineeringIII.addCourse(computerScience);
    assertTrue(softwareEngineeringIII.getCourses().contains(computerScience));
  }
}
package com.github.lophixyz;

import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

class CourseTest {

  @Test
  void registerStudent() {
    Course computerScience = new Course("Computer Science and Information Technology", DateTime.parse("2021-09-06"), DateTime.parse("2022-06-01"));
    Student johnSmith = new Student("John", "Smith", 22, DateTime.parse("1999-01-01"));
    computerScience.registerStudent(johnSmith);
    assertTrue(computerScience.getStudents().contains(johnSmith));
  }

  @Test
  void unregisterStudent() {
    Course computerScience = new Course("Computer Science and Information Technology",DateTime.parse("2021-09-06"), DateTime.parse("2022-06-01"));
    Student johnSmith = new Student("John", "Smith", 22, DateTime.parse("1999-01-01"));
    computerScience.getStudents().add(johnSmith);
    computerScience.unregisterStudent(johnSmith);
    assertFalse(computerScience.getStudents().contains(johnSmith));
  }

  @Test
  void unregisterAllStudents() {
    Course computerScience = new Course("Computer Science and Information Technology",DateTime.parse("2021-09-06"), DateTime.parse("2022-06-01"));
    Student johnSmith = new Student("John", "Smith", 22, DateTime.parse("1999-01-01"));
    Student marySue = new Student("Mary", "Sue", 21,  DateTime.parse("1999-12-30"));
    computerScience.getStudents().add(johnSmith);
    computerScience.getStudents().add(marySue);
    computerScience.unregisterAllStudents();
    assertAll(
        "John Smith and Mary Sue should not be present in Computer Science's students",
        () ->     assertFalse(computerScience.getStudents().contains(johnSmith)),
        () ->     assertFalse(computerScience.getStudents().contains(marySue))
    );
  }

  @Test
  void addModule() {
    Course computerScience = new Course("Computer Science and Information Technology",DateTime.parse("2021-09-06"), DateTime.parse("2022-06-01"));
    Module softwareEngineeringIII = new Module("CT417", "Software Engineering III");
    computerScience.addModule(softwareEngineeringIII);
    assertTrue(computerScience.getModules().contains(softwareEngineeringIII));
  }

  @Test
  void removeModule() {
    Course computerScience = new Course("Computer Science and Information Technology",DateTime.parse("2021-09-06"), DateTime.parse("2022-06-01"));
    Module softwareEngineeringIII = new Module("CT417", "Software Engineering III");
    computerScience.getModules().add(softwareEngineeringIII);
    computerScience.removeModule(softwareEngineeringIII);
    assertFalse(computerScience.getModules().contains(softwareEngineeringIII));
  }

  @Test
  void removeAllModules() {
    Course computerScience = new Course("Computer Science and Information Technology",DateTime.parse("2021-09-06"), DateTime.parse("2022-06-01"));
    Module softwareEngineeringIII = new Module("CT417", "Software Engineering III");
    Module informationRetrieval = new Module("CT4100", "Information Retrieval");
    computerScience.getModules().add(softwareEngineeringIII);
    computerScience.getModules().add(informationRetrieval);
    computerScience.removeAllModules();
    assertAll(
        "John Smith and Mary Sue should not be present in Computer Science's students",
        () ->     assertFalse(computerScience.getModules().contains(softwareEngineeringIII)),
        () ->     assertFalse(computerScience.getModules().contains(informationRetrieval))
    );
  }
}
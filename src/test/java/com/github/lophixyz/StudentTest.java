package com.github.lophixyz;

import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

class StudentTest {

  @Test
  void getUsername() {
    Course course = new Course("Software Engineering III", DateTime.parse("2021-08-28"),DateTime.parse("2022-08-27"));
    Student student = new Student( "John", "Smith", 22, DateTime.parse("1999-01-01"));
    course.registerStudent(student);
    student.setCourse(course);
    String wantUsername = "johnsmith22";
    String gotUsername = student.getUsername();
    assertEquals(wantUsername, gotUsername);
  }

  @Test
  void addModule() {
    Student johnSmith = new Student("John", "Smith", 22, DateTime.parse("1999-01-01"));
    Module softwareEngineeringIII = new Module("CT417", "Software Engineering III");
    johnSmith.addModule(softwareEngineeringIII);
    assertTrue(johnSmith.getModules().contains(softwareEngineeringIII));
  }

  @Test
  void removeModule() {
    Student johnSmith = new Student("John", "Smith", 22, DateTime.parse("1999-01-01"));
    Module softwareEngineeringIII = new Module("CT417", "Software Engineering III");
    johnSmith.getModules().add(softwareEngineeringIII);
    johnSmith.removeModule(softwareEngineeringIII);
    assertFalse(johnSmith.getModules().contains(softwareEngineeringIII));
  }

  @Test
  void removeAllModules() {
    Student johnSmith = new Student("John", "Smith", 22, DateTime.parse("1999-01-01"));
    Module softwareEngineeringIII = new Module("CT417", "Software Engineering III");
    Module informationRetrieval = new Module("CT4100", "Information Retrieval");
    johnSmith.addModule(softwareEngineeringIII);
    johnSmith.addModule(informationRetrieval);
    johnSmith.removeAllModules();
    assertAll(
        "Software Engineering III and Information Retrieval should not be present in John Smith",
        () -> assertFalse(johnSmith.getModules().contains(softwareEngineeringIII)),
        () -> assertFalse(johnSmith.getModules().contains(informationRetrieval))
    );
  }
}
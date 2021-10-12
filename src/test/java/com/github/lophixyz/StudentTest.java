package com.github.lophixyz;

import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

class StudentTest {

  @Test
  void testGetUsername() {
    Course course = new Course("Software Engineering III", DateTime.parse("2021-08-28"),DateTime.parse("2022-08-27"));
    Student student = new Student( "John", "Smith", 22, DateTime.parse("1999-01-01"));
    course.registerStudent(student);
    student.setCourse(course);
    assertEquals("johnsmith22", student.getUsername());
  }
}
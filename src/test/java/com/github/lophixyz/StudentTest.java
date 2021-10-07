package com.github.lophixyz;

import static org.junit.jupiter.api.Assertions.*;

import com.github.lophixyz.Course;
import com.github.lophixyz.Module;
import com.github.lophixyz.Student;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

class StudentTest {

  @Test
  void testGetUsername() {
    ArrayList<Module> modules = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    Course course = new Course("Software Engineering III", modules, students, DateTime.parse("2021-08-28"),DateTime.parse("2022-08-27"));
    Student student = new Student(123456789, "John", "Smith", 22, DateTime.parse("1999-01-01"), modules, course);
    assertEquals("johnsmith22", student.getUsername());
  }
}
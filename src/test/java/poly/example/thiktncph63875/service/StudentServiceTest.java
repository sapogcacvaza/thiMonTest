package poly.example.thiktncph63875.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import poly.example.thiktncph63875.entity.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    private StudentService studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentService();
    }

    @Test
    @DisplayName("Thêm sinh viên")
    void addStudentWithValidStudent() {
        Student student = new Student(1, "Nguyễn Văn A", 9.0, 20);
        studentService.add(student);

        assertEquals(20, studentService.getById(1).getAge());
    }

    @Test
    @DisplayName("Thêm sinh viên với null")
    void addStudentWithNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> studentService.add(null));
        assertEquals("Student can not be null!", exception.getMessage());
    }

    @Test
    @DisplayName("Thêm sinh viên với giá trị tên là null")
    void addStudentWithInvalidName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> studentService.add(new Student(2, "", 8.0, 21)));
        assertEquals("Name must not be null or empty!", exception.getMessage());
    }
}
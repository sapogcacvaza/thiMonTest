package poly.example.thiktncph63875.service;

import poly.example.thiktncph63875.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    List<Student> listStudent = new ArrayList<>();

    public void add(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student can not be null!");
        }

        listStudent.add(student);
    }

    public void update(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student can not be null!");
        }

        for(int i=0; i < listStudent.size(); i++) {
            if(student.getId() == listStudent.get(i).getId()) {
                listStudent.set(i, student);
                return;
            }
        }
    }

    public void deleteById(long id) {
        for(int i=0; i < listStudent.size(); i++) {
            if(listStudent.get(i).getId() == id) {
                listStudent.remove(i);
                return;
            }
        }
    }

    public Student getById(long id) {
        for (int i=0; i < listStudent.size(); i++) {
            if(listStudent.get(i).getId() == id) {
                return listStudent.get(i);
            }
        }
        return null;
    }
 }

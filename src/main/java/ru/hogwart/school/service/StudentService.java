package ru.hogwart.school.service;

import org.springframework.stereotype.Service;
import ru.hogwart.school.model.Student;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {
    private Map<Long, Student> studentsList= new HashMap <> ();
    private long lastId =0;


    public Student createStudent (Student student ){
        student.setId(++lastId);
        studentsList.put(lastId,student);
        return student;

    }

    public Student find (long id){
        return studentsList.get(id);
    }


    public Student  changeStudentInfo (Student student){
        studentsList.put(student.getId(),student);
        return student;
    }

    public Student removeStudent (Long id){
        return studentsList.remove(id);
    }
    public Student sortStudentByAge (int age){
        return studentsList.get(age);
    }
}

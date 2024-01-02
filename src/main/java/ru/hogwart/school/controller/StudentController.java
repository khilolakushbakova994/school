package ru.hogwart.school.controller;


import org.springframework.web.bind.annotation.*;
import ru.hogwart.school.model.Student;
import ru.hogwart.school.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("{id}")
    public Student find(@PathVariable long id) {
        return studentService.find(id);
    }

    @PutMapping
    public Student changeStudentInfo(@RequestBody Student student) {
        return studentService.changeStudentInfo(student);
    }

    @DeleteMapping("{id}")
    public Student removeStudent(@PathVariable Long id) {
        return studentService.removeStudent(id);
    }

    @GetMapping("{age}")
    public Student sortStudentByAge(@PathVariable int age) {
        return studentService.sortStudentByAge(age);
    }


}

package ru.hogwart.school.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwart.school.model.Faculty;
import ru.hogwart.school.service.FacultyService;

@RestController
@RequestMapping("faculty")
public class FacultyController {

    private FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Faculty createFaculty(@RequestBody Faculty faculty) {
         facultyService.createFaculty(faculty);
        return new ResponseEntity<>(faculty, HttpStatus.CREATED).getBody();

    }

    @GetMapping("{id}")
    public Faculty findFaculty(@PathVariable long id) {
        return facultyService.findFaculty(id);
    }

    @PutMapping
    public Faculty changeFacultyInfo(@RequestBody Faculty faculty) {
        return facultyService.changeFacultyInfo(faculty);
    }

    @DeleteMapping("{id}")
    public Faculty removeFaculty(@PathVariable long id) {
        return facultyService.removeFaculty(id);
    }

    @GetMapping("{color}")
    public Faculty softFacultyByColor(@PathVariable String color) {
        return facultyService.softFacultyByColor(color);
    }
}

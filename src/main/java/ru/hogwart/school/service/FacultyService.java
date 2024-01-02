package ru.hogwart.school.service;

import org.springframework.stereotype.Service;
import ru.hogwart.school.model.Faculty;
import ru.hogwart.school.model.Student;

import java.util.HashMap;
import java.util.Map;

@Service
public class FacultyService {
    private Map<Long, Faculty> allFaculties = new HashMap<>();
    private long lastId =0;



    public Faculty createFaculty (Faculty faculty ){
        lastId++;
        allFaculties.put(lastId,faculty);
        return faculty;


    }

    public Faculty findFaculty (long id) {
        return allFaculties.get(id);
    }


    public Faculty changeFacultyInfo (Faculty faculty){
        allFaculties.put(faculty.getId(), faculty);
        return faculty;
    }

    public Faculty removeFaculty (long id){
       return allFaculties.remove(id);
    }

    public Faculty softFacultyByColor (String color){
        return  allFaculties.get(color);
    }
}

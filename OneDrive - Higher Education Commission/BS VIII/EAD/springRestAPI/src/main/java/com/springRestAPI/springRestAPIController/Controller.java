package com.springRestAPI.springRestAPIController;

import com.springRestAPI.springRestAPIEntities.Course;
import com.springRestAPI.springRestAPIServices.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    public CourseServices courseService;
    @GetMapping("/home")
    public String homepage(){
        return "this is homepage";
    }
    //get courses
    @GetMapping("/courses")
    public List<Course> getCourse(){
        return this.courseService.getCourse();
    }

}
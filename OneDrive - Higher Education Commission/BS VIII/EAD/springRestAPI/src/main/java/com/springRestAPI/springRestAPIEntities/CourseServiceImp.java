package com.springRestAPI.springRestAPIEntities;

import com.springRestAPIServices.CourseServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImp implements CourseServices {

    List<Course> list;
    public CourseServiceImp(){
        list=new ArrayList<>();
        list.add(new Course(1,"DS", "Data Science"));


    }
    @Override
    public List<Course> getCourse() {
        return list;
    }
}

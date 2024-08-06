package RiwiAcademy.Controllers;

import RiwiAcademy.Entities.Course;
import RiwiAcademy.Models.CourseModelImpl;
import RiwiAcademy.Persistence.IModel.ICourseModel;

import java.util.ArrayList;

public class CourseController {

    ICourseModel courseModel = new CourseModelImpl();

    public boolean create(Course course){
        return  courseModel.create(course);
    }

    public boolean delete(Course course){
        return courseModel.delete(course);
    }

    public ArrayList<Course> readAll(){
        return courseModel.readAll();
    }



}

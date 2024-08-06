package RiwiAcademy.Controllers;

import RiwiAcademy.Entities.Student;
import RiwiAcademy.Models.StudentModelImpl;
import RiwiAcademy.Persistence.IModel.IStudentModel;

import java.util.ArrayList;

public class StudentController {

   IStudentModel studentmodel = new StudentModelImpl();
   public boolean create(Student student){
       return studentmodel.create(student);
   }

   public ArrayList<Student> readAll(Student student){
       return studentmodel.readAll();
   }
   public Student readById(Student student){
       return studentmodel.readById(student);
   };
   public boolean update(Student student){
       return studentmodel.update(student);
   };

    public Student readByEmail(Student student){
        return studentmodel.readByEmail(student);
    }




}

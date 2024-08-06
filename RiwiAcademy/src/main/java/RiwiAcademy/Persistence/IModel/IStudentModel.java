package RiwiAcademy.Persistence.IModel;

import RiwiAcademy.Entities.Student;
import RiwiAcademy.Persistence.CRUD.CreateModel;
import RiwiAcademy.Persistence.CRUD.ReadAllModel;
import RiwiAcademy.Persistence.CRUD.Readmodel;
import RiwiAcademy.Persistence.CRUD.UpdateModel;


public interface IStudentModel extends CreateModel<Student>, UpdateModel<Student>, ReadAllModel<Student>, Readmodel<Student> {

    public Student readByEmail(Student student);


}

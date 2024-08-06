package RiwiAcademy.Persistence.IModel;

import RiwiAcademy.Entities.Course;
import RiwiAcademy.Entities.Student;
import RiwiAcademy.Persistence.CRUD.CreateModel;
import RiwiAcademy.Persistence.CRUD.DeleteModel;
import RiwiAcademy.Persistence.CRUD.ReadAllModel;

public interface ICourseModel extends CreateModel<Course>, DeleteModel<Course>, ReadAllModel<Course>{
}

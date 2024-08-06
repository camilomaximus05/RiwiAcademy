package RiwiAcademy.Persistence.IModel;

import RiwiAcademy.Entities.Inscription;
import RiwiAcademy.Entities.Student;
import RiwiAcademy.Persistence.CRUD.CreateModel;
import RiwiAcademy.Persistence.CRUD.DeleteModel;

public interface IInscriptionModel extends CreateModel<Inscription>, DeleteModel<Inscription> {
}

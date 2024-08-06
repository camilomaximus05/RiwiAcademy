package RiwiAcademy.Controllers;

import RiwiAcademy.Entities.Inscription;
import RiwiAcademy.Entities.Qualification;
import RiwiAcademy.Models.InscriptionModelImpl;
import RiwiAcademy.Models.QualificationModelImpl;
import RiwiAcademy.Persistence.IModel.IInscriptionModel;
import RiwiAcademy.Persistence.IModel.IQualificationModel;

public class QualificationController {


    IQualificationModel qualificationModel = new QualificationModelImpl();

    public boolean create(Qualification qualification){
        return qualificationModel.create(qualification);
    }

    public boolean update(Qualification qualification){
        return qualificationModel.update(qualification);
    }




}

package RiwiAcademy.Controllers;

import RiwiAcademy.Entities.Inscription;
import RiwiAcademy.Models.InscriptionModelImpl;
import RiwiAcademy.Persistence.IModel.IInscriptionModel;

public class InscriptionController {
    IInscriptionModel inscriptionModel = new InscriptionModelImpl();

    public boolean create(Inscription inscription){
        return inscriptionModel.create(inscription);
    }

    public boolean delete(Inscription inscription){
        return inscriptionModel.delete(inscription);
    }


}

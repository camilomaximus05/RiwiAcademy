package RiwiAcademy.Entities;

public class Qualification {

    /*Attributes*/
    private int id;
    private int id_inscription;
    private String description;
    private int qualification;

    /*End attributes*/


    /*Constructor`s*/

    /*Empty constructor */
    public Qualification() {
    }

    /*All attribute constructor*/
    public Qualification(int id, int id_inscription, String description, int qualification) {
        this.id = id;
        this.id_inscription = id_inscription;
        this.description = description;
        this.qualification = qualification;
    }

    /*End constructor`s*/



    /*-----Getter`s-----*/

    public int getId() {
        return id;
    }

    public int getId_inscription() {
        return id_inscription;
    }

    public String getDescription() {
        return description;
    }

    public int getQualification() {
        return qualification;
    }

    /*-----End getter`s-----*/

    /*-----setter`s-----*/

    public void setId(int id) {
        this.id = id;
    }

    public void setId_inscription(int id_inscription) {
        this.id_inscription = id_inscription;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    /*-----End setter`s-----*/

    /*-----Method toString-----*/

    @Override
    public String toString() {
        return "-----Calificaión-----\nId-calificación: "+id+"\nId-inscripcion: "+id_inscription+"\nDescripción: "+description+"\nCalificaión: "+qualification;
    }
}

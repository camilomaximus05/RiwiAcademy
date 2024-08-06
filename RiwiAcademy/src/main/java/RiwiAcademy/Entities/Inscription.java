package RiwiAcademy.Entities;

public class Inscription {

    /*Attributes*/
    private int id;
    private int id_Course;
    private int id_Stundent;

    /*End attributes*/

    /*Constructor`s*/

    /*Empty constructor */
    public Inscription() {
    }

    /*To search for id*/
    public Inscription(int id) {
        this.id = id;
    }

    /*All attribute constructor*/

    public Inscription(int id, int id_Course, int id_Stundent) {
        this.id = id;
        this.id_Course = id_Course;
        this.id_Stundent = id_Stundent;
    }

    /*End constructor`s*/


    /*-----Getter`s-----*/

    public int getId() {
        return id;
    }

    public int getId_Course() {
        return id_Course;
    }

    public int getId_Stundent() {
        return id_Stundent;
    }

    /*-----End getter`s-----*/

    /*-----setter`s-----*/

    public void setId(int id) {
        this.id = id;
    }

    public void setId_Course(int id_Course) {
        this.id_Course = id_Course;
    }

    public void setId_Stundent(int id_Stundent) {
        this.id_Stundent = id_Stundent;
    }

    /*-----End setter`s-----*/

    /*-----Method toString-----*/

    @Override
    public String toString() {
        return "-----Inscripción-----\nid-inscripción:"+id+"\nid-estudiante: "+id_Stundent+"\nid_curso: "+id_Course;
    }
}

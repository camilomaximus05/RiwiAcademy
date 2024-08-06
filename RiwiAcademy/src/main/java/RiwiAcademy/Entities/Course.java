package RiwiAcademy.Entities;

public class Course {

    /*Attributes*/
    private int id;
    private String name_course;
    /*End attributes*/


    /*Constructor`s*/

    /*Empty constructor */
    public Course() {
    }


    /*Constructor for id*/
    public Course(int id) {
        this.id = id;
    }

    /*All attribute constructor*/
    public Course(int id, String name_course) {
        this.id = id;
        this.name_course = name_course;
    }
    /*End constructor`s*/


    /*-----Getter`s-----*/
    public int getId() {
        return id;
    }

    public String getName_course() {
        return name_course;
    }
    /*-----End getter`s-----*/

    /*-----setter`s-----*/
    public void setId(int id) {
        this.id = id;
    }

    public void setName_course(String name_course) {
        this.name_course = name_course;
    }
    /*-----End setter`s-----*/

    /*-----Method toString-----*/
    @Override
    public String toString() {
        return "-----Curso-----\nNombre del curso: : "+name_course+"\nid: "+id;
    }
}

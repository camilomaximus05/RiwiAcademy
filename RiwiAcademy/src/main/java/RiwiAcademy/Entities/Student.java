package RiwiAcademy.Entities;

import RiwiAcademy.Utils.Enum.State;

public class Student {

    /*Attributes*/
    private int id;
    private String name;
    private String last_name;
    private String email;
    private State state;
    /*End attributes*/


    /*Constructor`s*/

    /*Empty constructor */
    public Student() {
    }

    /*To search for id*/
    public Student(int id) {
        this.id = id;
    }

    /*To search for email*/
    public Student(String email) {
        this.email = email;
    }

    /*All attribute constructor*/
    public Student(int id, String name, String last_name, String email, State state) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.state = state;
    }

    /*End constructor`s*/


    /*-----Getter`s-----*/
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public State getState() {
        return state;
    }
    /*-----End getter`s-----*/


    /*-----setter`s-----*/
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setState(State state) {
        this.state = state;
    }
    /*-----End setter`s-----*/

    /*-----Method toString-----*/

    @Override
    public String toString() {
        return "-----Estudiante-----\nId: "+id+"\nNombre: "+name+"\nApellido: "+last_name+"\nEmail: "+email+"\nEstado: "+state;
    }
}

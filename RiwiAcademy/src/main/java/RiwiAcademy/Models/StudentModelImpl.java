package RiwiAcademy.Models;


import RiwiAcademy.Entities.Course;
import RiwiAcademy.Entities.Student;
import RiwiAcademy.Persistence.Connetion.Conexion;
import RiwiAcademy.Persistence.IModel.IStudentModel;
import RiwiAcademy.Utils.Enum.State;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentModelImpl implements IStudentModel {


    @Override
    public boolean create(Student student) {

        /*Query*/
        String sql="INSERT INTO student (name ,last_name , email , state) VALUES (?,?,?,?)";

        try{

            /*Establish connection*/
            Connection conexion = Conexion.getConexion();

            /*Converting the 'ps' variable to a sql format*/
            PreparedStatement ps = conexion.prepareStatement(sql);

            /*Solving the sql unknowns*/
            ps.setString(1, student.getName());
            ps.setString(2, student.getLast_name());
            ps.setString(3,student.getEmail());
            ps.setString(4,student.getState().toString());

            /*running sql format*/
            ps.execute();

            return true;
        }catch (SQLException e){

            /*error handling*/
            System.out.print("Error al crear un estudiante"+e.getMessage());
        }finally {

            /*connection closure*/
            Conexion.closeConexion();
        }

        return false;
    }

    @Override
    public ArrayList<Student> readAll() {

        /*list where entities are saved*/
        ArrayList<Student> studentList = new ArrayList<>();

        /*Query*/
        String sql="SELECT * FROM student";

        try{

            /*Establish connection*/
            Connection conexion = Conexion.getConexion();

            /*Converting the 'ps' variable to a sql format*/
            PreparedStatement ps = conexion.prepareStatement(sql);

            /*running sql format*/
            ResultSet rs = ps.executeQuery();

            /*Asking if there is a result or if there is another result*/
            while (rs.next()){
                Student e = new Student();

                /*assigning attributes*/
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setLast_name(rs.getString("last_name"));
                e.setEmail(rs.getString("email"));
                e.setState(State.valueOf(rs.getString("state")));

                /*Add query to course list */
                studentList.add(e);
            }

            return studentList;


        }catch (SQLException e){

            /*error handling*/
            System.out.print("Error al listar los estudiantes "+e.getMessage());
        }finally {

            /*connection closure*/
            Conexion.closeConexion();
        }

        return null;

    }

    @Override
    public Student readById(Student student) {

        /*Query*/
        String sql="SELECT * FROM student WHERE id = ?";

        try{

            /*Establish connection*/
            Connection conexion = Conexion.getConexion();

            /*Converting the 'ps' variable to a sql format*/
            PreparedStatement ps = conexion.prepareStatement(sql);

            /*Solving the sql unknowns*/
            ps.setInt(1,student.getId());

            /*running sql format*/
            ResultSet rs = ps.executeQuery();

            Student student1 = new Student();

            /*Asking if there is a result*/
            if(rs.next()){
                student1.setId(rs.getInt("id"));
                student1.setName(rs.getString("name"));
                student1.setLast_name(rs.getString("last_name"));
                student1.setEmail(rs.getString("email"));
                student1.setState(State.valueOf(rs.getString("state")));
            }

            return student1 ;

        }catch (SQLException e){

            /*error handling*/
            System.out.print("Error al buscar un estudiante :"+e.getMessage());
        }finally {

            /*connection closure*/
            Conexion.closeConexion();
        }

        return null;
    }

    @Override
    public boolean update(Student student) {

        /*Query*/
        String sql="UPDATE student SET (name = ?,last_name = ?,email = ?,state = ?) WHERE id = ?";

        try{

            /*Establish connection*/
            Connection conexion = Conexion.getConexion();

            /*Converting the 'ps' variable to a sql format*/
            PreparedStatement ps = conexion.prepareStatement(sql);

            /*Solving the sql unknowns*/
            ps.setString(1, student.getName());
            ps.setString(2, student.getLast_name());
            ps.setString(3,student.getEmail());
            ps.setString(4,student.getState().toString());

            /*running sql format*/
            ps.execute();

            return true;

        }catch (SQLException e){

            /*error handling*/
            System.out.print("Error al actualizar un estudiante: "+e.getMessage());
        }finally {

            /*connection closure*/
            Conexion.closeConexion();
        }


        return false;
    }

    @Override
    public Student readByEmail(Student student) {

        /*Query*/
        String sql="SELECT * FROM student WHERE email = ?";

        try{
            /*Establish connection*/
            Connection conexion = Conexion.getConexion();

            /*Converting the 'ps' variable to a sql format*/
            PreparedStatement ps = conexion.prepareStatement(sql);

            /*Solving the sql unknowns*/
            ps.setString(1,student.getEmail());

            /*running sql format*/
            ps.execute();

            return student;

        }catch (SQLException e){

            /*error handling*/
            System.out.print("Error al buscar un estudiante por correo: "+e.getMessage());
        }finally {

            /*connection closure*/
            Conexion.closeConexion();
        }

        return null;
    }
}

package RiwiAcademy.Models;

import RiwiAcademy.Entities.Course;
import RiwiAcademy.Persistence.Connetion.Conexion;
import RiwiAcademy.Persistence.IModel.ICourseModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CourseModelImpl implements ICourseModel {
    @Override
    public boolean create(Course course) {

        /*Query*/
        String sql="INSERT INTO course (id,name_course) VALUES (?,?)";

        try{

            /*Establish connection*/
            Connection conexion = Conexion.getConexion();

            /*Converting the 'ps' variable to a sql format*/
            PreparedStatement ps = conexion.prepareStatement(sql);

            /*Solving the sql unknowns*/
            ps.setInt(1,course.getId());
            ps.setString(2,course.getName_course());

            /*running sql format*/
            ps.execute();

            return true;

        }catch (SQLException e){

            /*error handling*/
            System.out.print("Error al crear un curso: "+e.getMessage());
        }finally {

            /*connection closure*/
            Conexion.closeConexion();
        }


        return false;

    }

    @Override
    public boolean delete(Course course) {

        /*Query*/
        String sql="DELETE FROM course WHERE id = ?";

        try{
            /*Establish connection*/
            Connection conexion = Conexion.getConexion();

            /*Converting the 'ps' variable to a sql format*/
            PreparedStatement ps = conexion.prepareStatement(sql);

            /*Solving the sql unknowns*/
            ps.setInt(1,course.getId());

            /*running sql format*/
            ps.execute();

            return true;

        }catch (SQLException e){

            /*error handling*/
            System.out.print("Error al eliminar un curso"+e.getMessage());
        }finally {

            /*connection closure*/
            Conexion.closeConexion();
        }

        return false;
    }

    @Override
    public ArrayList<Course> readAll() {

        /*list where entities are saved*/
        ArrayList<Course> courseList = new ArrayList<>();

        /*Query*/
        String sql="SELECT * FROM course";

        try{

            /*Establish connection*/
            Connection conexion = Conexion.getConexion();

            /*Converting the 'ps' variable to a sql format*/
            PreparedStatement ps = conexion.prepareStatement(sql);

            /*running sql format*/
            ResultSet rs = ps.executeQuery();

            /*Asking if there is a result or if there is another result*/
            while (rs.next()){
                Course e = new Course();

                /*assigning attributes*/
                e.setId(rs.getInt("id"));
                e.setName_course(rs.getString("name_course"));

                /*Add query to course list */
                courseList.add(e);
            }


        }catch (SQLException e){

            /*error handling*/
            System.out.print("Error al listar los cursos: "+e.getMessage());
        }finally {

            /*connection closure*/
            Conexion.closeConexion();
        }

        return courseList ;
    }

}

package RiwiAcademy.Models;

import RiwiAcademy.Entities.Qualification;
import RiwiAcademy.Persistence.Connetion.Conexion;
import RiwiAcademy.Persistence.IModel.IQualificationModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QualificationModelImpl implements IQualificationModel {
    @Override
    public boolean create(Qualification qualification) {

        /*Query*/
        String sql="INSERT INTO qualification (id ,id_inscription,description,qualification) VALUES (?,?,?,?)";

        try{

            /*Establish connection*/
            Connection conexion = Conexion.getConexion();

            /*Converting the 'ps' variable to a sql format*/
            PreparedStatement ps = conexion.prepareStatement(sql);

            /*Solving the sql unknowns*/
            ps.setInt(1,qualification.getId());
            ps.setInt(2,qualification.getId_inscription());
            ps.setString(3,qualification.getDescription());
            ps.setInt(4,qualification.getQualification());

            /*running sql format*/
            ps.execute();


            return true;

        }catch (SQLException e){

            /*error handling*/
            System.out.print("Error al crear un _____"+e.getMessage());
        }finally {

            /*connection closure*/
            Conexion.closeConexion();
        }

        return false;
    }

    @Override
    public boolean update(Qualification qualification) {

        /*Query*/
        String sql="UPDATE qualification SET (id_inscription =?, description =?,qualification =?) WHERE id = ?";

        try{

            /*Establish connection*/
            Connection conexion = Conexion.getConexion();

            /*Converting the 'ps' variable to a sql format*/
            PreparedStatement ps = conexion.prepareStatement(sql);

            /*Solving the sql unknowns*/
            ps.setInt(1, qualification.getId_inscription());
            ps.setString(2, qualification.getDescription());
            ps.setInt(3, qualification.getQualification());
            ps.setInt(4, qualification.getId());


            /*running sql format*/
            ps.execute();

            return true;
        }catch (SQLException e){

            /*error handling*/
            System.out.print("Error al actualizar  una calificaión "+e.getMessage());
        }finally {

            /*connection closure*/
            Conexion.closeConexion();
        }

        return false;
    }
}

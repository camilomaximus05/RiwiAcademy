package RiwiAcademy.Models;

import RiwiAcademy.Entities.Inscription;
import RiwiAcademy.Persistence.Connetion.Conexion;
import RiwiAcademy.Persistence.IModel.IInscriptionModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InscriptionModelImpl implements IInscriptionModel {

    @Override
    public boolean create(Inscription inscription) {

        /*Query*/
        String sql="INSERT INTO inscription (id,id_course,id_student) VALUES (?,?,?)";

        try{

            /*Establish connection*/
            Connection conexion = Conexion.getConexion();

            /*Converting the 'ps' variable to a sql format*/
            PreparedStatement ps = conexion.prepareStatement(sql);

            /*Solving the sql unknowns*/
            ps.setInt(1, inscription.getId());
            ps.setInt(2, inscription.getId_Course());
            ps.setInt(3, inscription.getId_Stundent());

            /*running sql format*/
            ps.execute();

            return true;

        }catch (SQLException e){

            /*error handling*/
            System.out.print("Error al crear una inscripción: "+e.getMessage());
        }finally {

            /*connection closure*/
            Conexion.closeConexion();
        }

        return false;
    }

    @Override
    public boolean delete(Inscription inscription) {

        /*Query*/
        String sql="DELETE FROM inscription WHERE id = ?";

        try{
            /*Establish connection*/
            Connection conexion = Conexion.getConexion();

            /*Converting the 'ps' variable to a sql format*/
            PreparedStatement ps = conexion.prepareStatement(sql);

            /*Solving the sql unknowns*/
            ps.setInt(1,inscription.getId());

            /*running sql format*/
            ps.execute();

            return true;

        }catch (SQLException e){

            /*error handling*/
            System.out.print("Error al eliminar un _____"+e.getMessage());
        }finally {

            /*connection closure*/
            Conexion.closeConexion();
        }

        return false;
    }
}

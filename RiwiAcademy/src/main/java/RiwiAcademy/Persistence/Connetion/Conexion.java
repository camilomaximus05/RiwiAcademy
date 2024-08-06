package RiwiAcademy.Persistence.Connetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    /*Attributes*/

    /*Object for establish connection*/
    private static Connection conexion;

    /*Name of database*/
    private static String database = "RiwiAcademyDB";

    /*Url of mysql database*/
    private static String url = "jdbc:mysql://locahost:3306/"+database;
    /*User role name*/
    private static String user = "root";

    private static String password = "Rlwl2023.";
    /*End attributes*/

    /*Method to get connection*/
    public static Connection getConexion(){

        try {

            conexion = DriverManager.getConnection(url,user,password);

        }catch (SQLException e){
            System.out.printf("Error de conexion: "+e.getMessage());
        }

        return conexion;

    }

    /*Method to close the connection*/
    public static void closeConexion() {

        if (conexion != null) {
            try {
                conexion.close();
            }catch(SQLException e){
            System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }

        }
    }





}

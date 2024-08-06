package RiwiAcademy;


import javax.swing.*;
import java.util.regex.*;

public class Main {

    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }

        public static void main(String[] args) {

            int option = 6;
            String optionString;

            do {
                do {
                    optionString = JOptionPane.showInputDialog("------¿Que deseas modificar?------\n1.) Cursos\n2.)Estudiantes\n3.)Inscripción\4.)Calificaciones");

                    if(optionString == null){
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");
                        continue;
                    }

                    if(!isNumeric(optionString)){
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");
                        continue;
                    }

                    option = Integer.parseInt(optionString);

                    if (option >= 4 && option<0){
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");
                        continue;
                    }

                    switch (option){

                        case 1:

                            do {
                                optionString = JOptionPane.showInputDialog("------¿Que deseas hacer con los cursos?------\n1.) Crear un curso\n2.)Eliminar curso\n3.)Listar cursos");

                                if(optionString == null){
                                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
                                    continue;
                                }

                                if(!isNumeric(optionString)){
                                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
                                    continue;
                                }

                                option = Integer.parseInt(optionString);

                                if (option >= 4 && option<0){
                                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
                                    continue;
                                }

                            }while(option >= 4 && option<0);





                    }


                }while (true);


            }while (option != 0);




    }
}
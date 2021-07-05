
package pooii;

import entidades.Alumno;
import javax.swing.JOptionPane;

public class POOII {

    public static void main(String[] args) {
        
        Alumno a1 = new Alumno();
        try{
            a1.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
            a1.setApellido(JOptionPane.showInputDialog("Ingrese su apellido"));
            a1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad")));
            
        }catch(NumberFormatException e){
            e.getMessage();
        }finally{
            a1.setHobbie(JOptionPane.showInputDialog("Ingrese su hobbie"));
            a1.setEditorCodPreferido(JOptionPane.showInputDialog("Ingrese su editor de código preferido"));
            a1.setSistOperativo(JOptionPane.showInputDialog("Ingrese sistema operativo usado"));
        }
      
        System.out.println(a1.toString());
    }
    
}

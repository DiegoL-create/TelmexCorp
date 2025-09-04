
package djl.telmexcorp;
import djl.oficinas.*;
import javax.swing.JOptionPane;
public class Telmex {   
    
    public static void main(String[] args) {
        int resultado=0, x=0,y=0;
        boolean bandera=true;
        boolean bandera1=true;
        boolean bandera2=true;
         
        
        try {
    char sexo=JOptionPane.showInputDialog("introduce un caracter").charAt(0);
}
    catch(StringIndexOutOfBoundsException e){
    JOptionPane.showMessageDialog(null,"no se puede introducir campos vacios >:V");
}
   try{
       String Nombre=JOptionPane.showInputDialog("introduce tu nombre porfavor: ");
       Validaciones.validarCampoStringVacio(Nombre);
   }
      catch(Validaciones e){
         JOptionPane.showMessageDialog(null,e.getMessage());
      }
   try{
       int numeroCuenta=Integer.parseInt(JOptionPane.showInputDialog("introduce tu numero de cuenta"));
       Validaciones.ValidarNumeroCuenta(numeroCuenta);
   }
   catch (Validaciones v){ 
       JOptionPane.showMessageDialog(null,v.getMessage());
   }
        
 /**    do{
            
 try {
   do{
       x=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de x: "));
       bandera=false;
   }while(bandera1);
   do{ 
       y=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de y: "));
       bandera=false;
   }while(bandera2);
   
resultado=x+y;
bandera=false;

//resultado=x/y;
//ojo no se escibre ninguna operacion
}
           catch(Exception e){ 
          JOptionPane.showMessageDialog(null, "erro no debiste existir"+e.getMessage());
          }
/**catch(NumberFormatException e){
    JOptionPane.showMessageDialog(null, e.getMessage()+"tipo de dato incorrecto!!");
}
catch(ArithmeticException e){
    JOptionPane.showMessageDialog(null, "division invalida por 0");
}
catch(RuntimeException e){
    JOptionPane.showMessageDialog(null, "operacion no se lleva acabo por falta de terminos");
}**/

           /**finally{ //muestra el resultado sin excepcion aunque su tipo de dato este mal 
           JOptionPane.showMessageDialog(null, resultado);
          
           }**/
        } 
        //while(bandera);
        //JOptionPane.showMessageDialog(null, resultado);
    }
   
/** las opciones try es donde el usuario genere un error
 * donde ocupamos try y su perteneciente cathc la clase NumberFormat
 * solo captura la excepcion unicamente
 * de todos los catch solo se ejecutara el que aplique la excepcion :) 
 */
//JOptionPane.showConfirmDialog(null,Oficina.getNumero());
/** 
 * excepciones personalizadasd investigaaaaar y ejercicio
 */

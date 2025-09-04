
package djl.oficinas;

public class Validaciones extends Exception {
    // cuando se aplica herencia si tu vas a heredar de otra clase tienes que invocar al metodo contructor de la clase padre
    public Validaciones(String msg){
        super(msg);// de esta forma invocas el metodo costructor de la clase padre
        //la mismca cantidad de parametros que establezcas deben coincidir para las que se 
        //deben enviar a la clase padre 
    }
    public static void validarCampoStringVacio(String dato)throws Validaciones{
        if (dato.isBlank() || dato.isEmpty()){
            throw new Validaciones("no se permiten campos vacios");
        }  //lengt para tipo de caracter validando 
        else if (dato.length()==1){
            
                throw new Validaciones ("no se permiten caracteres de un solo ");
            }
        else if (dato.matches("[0-9]+")){
                    throw new Validaciones ("no se permiten numeros");
                    }
        }
        public static void ValidarNumeroCuenta( int numeroCuenta) throws Validaciones{
            String aux=String.valueOf(numeroCuenta);
            if(aux.length()!=5){
                throw new Validaciones ("Introduce 5 digitos por favor");
            }
    }
    /** 
     * tarea para el domingo cada pedido de dato con su try catch y su do while
     * tiene que tener validaciones personalizadas, y las demas validaciones que ya se vieron como 
     * exception, numberformat,aritmetich runtime exception, programa de las ventas aaa
     */
}
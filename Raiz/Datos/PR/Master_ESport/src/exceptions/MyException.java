
package exceptions;

/**
 *
 * @author Eqdaw03
 */

/**
 * Clase MyException
 * Esta clase nos permite poner mensajes a las exceptiones creadas
 */

public class MyException extends Exception{
    
    private Integer error;

    public MyException() {
    }

    public MyException(Integer error) {
        this.error = error;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }
    @Override
    public String getMessage(){
    
        String mensaje = "";
        
        switch(error){
        
            case 1:
                mensaje = "Nickname no válido"+"\nPrimera letra mayúscula y mínicmo 3 caracteres";
                break;
                
            case 2:
                mensaje = "Nombre no válido"+"\nPrimero letra es mayúscula y mínimo 3 carácteres";
                break;
                
            case 3:
                mensaje = "Apellido no válida"+"\nPrimero letra es mayúscula y mínimo 3 carácteres";
                break;
                
            case 4:
                mensaje = "Contraseña no válida"+"\nMínimo 5 caracteres";
                break;

            case 5:
                mensaje = "Primera letra mayúscula";
                break;
                
            case 6:
                mensaje = "Primera letra mayúscula"+"\nMínimo 3 caracteres";
                break;
                
            case 7:
                mensaje = "Sueldo mínimo 760";
                break;


        }
        
        return mensaje;
    }
}

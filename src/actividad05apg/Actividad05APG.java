
 
package actividad05apg;

import java.io.IOException;

public class Actividad05APG {

    
    
    public static void main(String[] args) throws IOException {
        
        dibujante.pideTitulo();
        dibujante dibu = new dibujante(34567243,"Alex",1982,"chico");
        
        System.out.println("Nuestro dibujante es; "+ dibu.nombre + dibu.dni + dibu.sexo + dibu.ano_nacimiento 
                + " y a añadido la siguiente cancion: "+ dibu.titulo_dibujo );
    }
    
}

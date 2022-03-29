
package actividad05apg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dibujante extends artista{
    
       int fecha_exposicion;
       String titulo_dibujo;
       int precio_dibujo;


    
    
    public dibujante(int dni, String nombre, int ano_nacimiento, String sexo) throws IOException {
     
        
    super(dni, nombre, ano_nacimiento, sexo);
    fecha_exposicion = 0;
    titulo_dibujo = pideTitulo();
    precio_dibujo = 0;
   
   
    }
    
    public static String pideTitulo() throws IOException{
     //boolean tit = false;   
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ); 
     
   // do{ 
     System.out.println("Introduce el nombre del dibujo: \n");
     String tituloDibujo = br.readLine();
     
    //}while (tit != true);
    
    return tituloDibujo;   
    }
    
}

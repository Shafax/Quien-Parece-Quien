/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MJ
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException { 
        
        // Abrimos el canal creando un nuevo archivo.txt
        try {                                                                                                                           //True final es para añadir al texto cada vez que ejecutemos el codigo.
            FileWriter fw=new FileWriter("G:\\Mi unidad\\Dawn 2022-2023\\Daw2023\\Ficheros\\puntuaciones.txt"); 
            
            // Utilizamos el canal abierto para escribir dentro del fichero
            fw.write("Puntuaciones: \r\n Jugador1: \r\n Jugador2:" ); // \r\n es para hacer un salto de linea dentro del fichero.
            
            //Cerramos el canal abierto.
            fw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //Para leer un fichero tenemos que crear:
        String contenido = ""; //un String contenido que lo proyectaremos al final
        int c=0;                    // Una variable C para que nos cuente en cada punto del fichero.
        try {
            FileReader fr=new FileReader("G:\\Mi unidad\\Dawn 2022-2023\\Daw2023\\Ficheros\\puntuaciones.txt");
            
            c=fr.read();                      //esta funcion nos va a leer ENTEROS como si fueran posiciones de un Array, donde cada posicion, es caracter.
            while (c!=-1){                  //un bucle While para que nos vaya leyendo caractes a caracter el fichero hasta que llegue al final (-1).
                contenido+=(char)c;  //Esto nos ira sumando caracter a caracter cada posicion del entero que tengamos.
                 c=fr.read();               // y lo volvemos a leer para que siga hasta el final
            }
            
           
            
            
            System.out.println("El contenido del fichero es: " +contenido);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

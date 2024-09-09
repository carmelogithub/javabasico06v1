package practica;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirPlano {

/*escribir un mensaje en una archivo txt

 */
    public static void main(String[] args){
        String ruta= "C:\\Users\\Tecnicos\\Desktop\\java\\prueba.txt";
        String texto="\notro texto para ver si sobreescribe el contenido";
        FileWriter fw;


            try {
                fw = new FileWriter(ruta,true);//true significo que NO elimina el contenido original
                fw.write(texto); //escribir el texto en el archivo. caracteres en el texto plano
                fw.write(System.lineSeparator());
                System.out.println("archivo modificado");
                fw.close(); //cerrar el archivo
            } catch (IOException e) {
                throw new RuntimeException(e);
            }//cierra catch

    }//cierra main


}//cierra class

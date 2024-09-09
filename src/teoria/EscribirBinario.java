package teoria;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirBinario {

    public static void main (String[] args){
        /*
        Escribir en un archivo binario como un flujo de caracteres NO es válido.
        flujo de caracters está pensado para gestionar caracteres 'a' y no bytes.
Cargar librería extnerna Apache POI
         */
        try {
            FileWriter fw=new FileWriter("C:\\Users\\Tecnicos\\Desktop\\archivoWord.docx");
            String mensajeparaescribir="texto para escribir en archivo";
            fw.write(mensajeparaescribir);
            fw.write(mensajeparaescribir);
            System.out.println("archivo escrito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }//cierra main

}//cierra base

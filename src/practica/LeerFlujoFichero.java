package practica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerFlujoFichero {
/*
Crea un document de Word con texto y una imagen.
Intenta leerla en Java.
Para leer / escribir un documento de Word es necesario bibliotecas adicionales. Apache POI.
No puedo leer direcdtamente el doc de Word utilizando Stream.
El archivo de Word están en formato binario complejo y no se puede tratar como texto plano.
Si lo hacemos usando Stream... se imprimirá una secuencia de bytes. No me das el contenido legible.
 */

    public static void main(String[] args){
        try {
            FileInputStream fis= new FileInputStream("C:\\Users\\Tecnicos\\Desktop\\java\\archivoWord.docx");
            int byteLeido;
            while((byteLeido=fis.read())!=-1){
                System.out.println(byteLeido);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         finally{
            System.out.println("Se termino de leer el archivo");
        }
    }//cierra main


}//cierra clase

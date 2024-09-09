package teoria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerArchivoBinario {
public static void main(String[] args){
    try {

        /*
        Layendo con un flujo de bytes por esos aparecen código y no texto legible.

         */
        FileInputStream fis= new FileInputStream("C:\\Users\\Tecnicos\\Desktop\\java\\prueba.txt");
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

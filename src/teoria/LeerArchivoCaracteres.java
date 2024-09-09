package teoria;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoCaracteres {

public static void main(String[] args){
    try {
        //es un flujo de caracteres porque NO se usa InputFileStream
        FileReader fr=new FileReader("C:\\Users\\Tecnicos\\Desktop\\java\\archivoWord.docx");
        int caracterLeido;
        while((caracterLeido=fr.read())!=-1){
            System.out.println((char)caracterLeido);
        }
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}//cierra main

}//cierra class

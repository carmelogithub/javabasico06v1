package teoria;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirBufferWriter {
public static void main(String[] args){
    String ruta="C:\\Users\\Tecnicos\\Desktop\\java\\prueba.txt";
    String texto="nuevo texto desde buffer writer";
    //FileWrite es una clase básica y escribe caracteres de manera secuencial y directa en el archivo.
    //puede ser poco eficiente operaciones frecuentes o de gran cantidad.
    //BufferedWriter es una clase de alto nivel que escribe texto en un archivo con un buffer.que engloba FileWirter y ofrece memoria para mejorar la eficiencia de escritura.
    //usa un buffer para almacenar datos antes de escribirlos en el archivo.
    try (BufferedWriter bw=new BufferedWriter(new FileWriter(ruta,true))){
        bw.write(texto);
        bw.newLine();//introduce una salto de línea entre texto y texto
        System.out.println("bw añadido");
    } catch (IOException e) {
        throw new RuntimeException(e);
    }//cierra catch

}//cierra main

}//cierra clase

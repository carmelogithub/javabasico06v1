package practica;

import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EscribirConsolav2 {
public static void main(String[] args) {
//REsumen. Consola. Data Structures . Stream o Caracteres de datos en archivos de texto.
    //por consola pides paises y cada pais se guarda en el archivo paises
//dejas de escribir paises cuando pulsas la tecla q
//los países No se puede repetir
       //al final, muestra las países por consola (que hayas guardado en el archivo) ordenados alfabéticamente

String ruta="C:\\Users\\Tecnicos\\Desktop\\java\\paises.txt";
Scanner sc = new Scanner(System.in);
Set<String> paises= new TreeSet<>();//estructura de datos que asegura no duplicados y muestra ordenados alfabéticamente
    System.out.println("Dime un país. Cuando hayas finalizado, pulsa q");
    while(true){
        String pais=sc.nextLine();

        if(pais.equals("q")){
            break;//salimos del bucle
        }//cierra if
        paises.add(pais);//se encarga de quitar duplicados y ordenar alfabéticamente
    }//cierra while
    //escribir en el archivo
    try(BufferedWriter bw=new BufferedWriter(new FileWriter(ruta,true))){
    for(String pais:paises){//recorre con un for each la estructura de datos. TreeSet
        //cuando write en el archivo, ya están ordenados y sin duplicados
        bw.write(pais);//escribe en el archivo
        bw.newLine();
    }//cierra for
    System.out.println("Países guardados");
}//cierra try
catch (IOException e){
    throw new RuntimeException(e);
}//cierra catch

//leer el arhivo
    try(BufferedReader br=new BufferedReader(new FileReader(ruta))){
        System.out.println("Países guardados");
        String linea;
        while((linea=br.readLine())!=null){
            System.out.println(linea);

       }//cierra while

    }//cierra try
    catch (IOException e){
        throw new RuntimeException(e);
    }//cierra catch

}//cierra main

}//cierra class

package practica;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EscribirConsolav1 {
public static void main(String[] args) {

    //por consola pides ciudades y cada ciudad se guarda en un archivo
//dejas de escribir ciudades cuando pulsas la tecla q
//si la ciudad ya existe en el archivo la vuelves a escribir
    //al final, muestra las ciudades por consola (que hayas guardado en el archivo)

String ruta="C:\\Users\\Tecnicos\\Desktop\\java\\ciudades.txt";
Scanner sc = new Scanner(System.in);
    try (BufferedWriter bw=new BufferedWriter(new FileWriter(ruta,true))){
        //Set<String> ciudades=new HashSet<>();
        System.out.println("Dime una ciudad");
        while(true){
            String ciudad=sc.nextLine();
            if(ciudad.equals("q")){
                break;//salimos del bucle
            }
            bw.write(ciudad);
            bw.newLine();
          //  ciudades.add(ciudad);
        }//cierra while
        System.out.println("Ciudades guardadas");
        //leer archivo
        try(BufferedReader br=new BufferedReader(new FileReader(ruta))){
            String linea;
            while((linea=br.readLine())!=null){//leer cada línea del archivo
                System.out.println(linea);
            }//cierra while
        }//cierra try
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }//cierra el primer try
     catch (IOException e) {
        throw new RuntimeException(e);
    }//cierra catch


}//cierra main

}//cierra class

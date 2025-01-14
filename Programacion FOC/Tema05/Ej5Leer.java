package Tema05;

import java.io.File;

public class Ej5Leer {
    public static void main(String[] args) {
        File archivo = new File("/Users/");
        if (archivo.exists()) {
            File[] archivos = archivo.listFiles();
            for (int i = 0; i < archivos.length; i++) {
                if (archivos[i].isFile()) {
                    System.out.println(archivos[i] + " - Este es un archivo");
                } else if (archivos[i].isDirectory()) {
                    System.out.println(archivos[i] + " - Este es un directorio");
                } else {
                    System.out.println(archivos[i] + " - No es un archivo ni un directorio");
                }
            }
        }
    }
}

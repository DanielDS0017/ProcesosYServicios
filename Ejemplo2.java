import java.io.FileReader;

public class Ejemplo2 {
    
public static void main(String[] args) {
    
String path ="./Ejemplo2.txt";  //Creamos variable de .txt que existe..
String pathEscritura = "./Ejemplo2.txt";


try { // Try-catch para la excepciones.

FileReader lector =  new FileReader(path);
//int data = lector.read(); //Lee el primer caracter del .txt Fichero que existe, este caso Ejemplo2.
int data; //Creamos variable.

//Write escritorFicheros = New File(AQUI VA LA RUTA.);
//escritorFicheros.write()Esto es un ejemplo de escritura.;
//escritorFicheros.close();

while ((data=lector.read()) != -1) { // eL -1 Sirve para recorrer el While.

    System.out.print((char)data);
}

System.out.println((char)data); // Muestra el caracter de la tabla ASCII H = 72 - Si ponemos el char , lee caracter.

lector.close();
System.out.println("\nLectura completada");




    
} catch (Exception e) {
    // TODO: handle exception
}



}


}

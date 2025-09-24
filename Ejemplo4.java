
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.io.File;


public class Ejemplo4 {
    public static void main(String[] args) {
        
try {
   File ficheroOrigen = new File (".\\fichero_de_origen.txt");
ficheroOrigen.createNewFile();

 File ficheroDestino = new File (".\\fichero_de_destino.txt");
ficheroDestino.createNewFile();
if (ficheroOrigen.createNewFile()) {

    System.out.println("Fichero creado" + ficheroOrigen);
    System.out.println("Fichero creado" + ficheroDestino);
    
} else{ 
    System.out.println("Fichero ya existe");

}

} catch (Exception e) {

   try {


    
   } catch (Exception aException) {
   
    
   }
}





    }


}

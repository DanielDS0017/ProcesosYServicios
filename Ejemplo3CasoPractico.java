
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.io.File;


/* */

public class Ejemplo3CasoPractico {
    
    public static void main(String[] args) {
        
String abc ="./datos.txt"; 
String abcEscritura = "./datos.txt";


try {

File fichero = new File (".\\datos.txt");
fichero.createNewFile();
FileReader lecto = new FileReader(abcEscritura);

 

} catch (Exception e) {
    // TODO: handle exception
}

    }
}

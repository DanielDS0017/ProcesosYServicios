import java.io.File;

public class Ejemplo1{

    public static void main(String[] args) {

try {

File fichero = new File (".\\Ejemplo.txt"); //Creamos un fichero
fichero.createNewFile(); //Creamos nuevo fichero.
String nombreCarpeta = "Backup"; //Varable nombre de carpeta "Backup"
File carpeta = new File  (".\\",nombreCarpeta);
//fichero.createNewFile();    // Crear un nuevo fichero.
//fichero.delete();         // Borrar un fichero.
//carpeta.mkdir();           //Crear una carpeta.

File fichero2 = new File (".\\");
fichero.renameTo(fichero2);

} catch (Exception e) {
    
}

    }

}

/*if (carpetaExist) {
sout "la carpeta ya existe"


else{
si no eiste te la crea.
}

*/
//Paquete principal
package BD_MySQL;

//Importacion de librerias SQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

//Clase principal
public class ConexionBD {

    // Librería de MySQL
    public String driver = "com.mysql.jdbc.Driver";

    // Nombre de la base de datos
    public String database = "gimnasio";

    // Host
    //public String hostname = "miguelredes.serveblog.net";
    public String hostname = "192.168.1.3";

    // Puerto
    public String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    // Nombre de usuario
    public String username = "redesmon";

    // Clave de usuario
    public String password = "BDredes";

    //Funcion que conecta la BD con el programa
    public Connection connect() {
        Connection conexionBD = null;

        try {
            Class.forName(driver);
            conexionBD = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conexionBD;
    }
    
    

}

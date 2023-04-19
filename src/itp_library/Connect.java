package itp_library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private static Connection conn;
    String url="jdbc:sqlserver://localhost:1433;"
            +"database=library;"
            +"user=sa;"
            +"password=quispesql;";
         
    public Connect(){
        conn = null;
        try{
            //Class.forName(driver);
            conn = DriverManager.getConnection(url);
            
            // Connect?
            if(conn != null)
                System.out.println("Conexión establecida exitosamente");
        }catch (SQLException ex){
            System.out.println("Conexión Fallida:\n\n"+ex);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class DBApp1 {

    public static void main(String[] args) {
        
        try
        {
            // 1. Create A Database Connection -> java.sql.DriverManager
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","sudeepa");
            System.out.println("Conncted Successfully!");
            // 2. Create A Statement
            Statement statement = con.createStatement();
            // 3. Execute The SQL 
            ResultSet result = statement.executeQuery("Select * from employee");
            while(result.next()){
                String name = result.getString("Name");
                System.out.println(name);
            }
        }
        catch(SQLException expection)
        {
            
            System.out.print("Error"+expection.getMessage());
            
        }
        


        
        
        // 4. Show The Data Inside
    }
    
}
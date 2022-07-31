import java.sql.*;

public class CommonDao {
    
    public static ResultSet get(String sql){

        try
        { 
            // 1. Create A Database Connection -> java.sql.DriverManager

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");

            // 2. Create A Statement
            Statement statement = con.createStatement(1004,1007);
        
            ResultSet result = statement.executeQuery(sql);

            return result;
        
        }
        catch(SQLException expection)
        {
            System.out.println("Error"+expection.getMessage());
        }

        return null;

    }
    
}

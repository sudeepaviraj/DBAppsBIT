import java.sql.*;

public class EmployeeDao {

    public static String [][] getAll(){
        
        String [][] employeearray = null;

        try
        {
            // 1. Create A Database Connection -> java.sql.DriverManager
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","sudeepa");
            // 2. Create A Statement
            Statement statement = con.createStatement(1004,1007);
            // 3. Execute The SQL 
            ResultSet result = statement.executeQuery("Select * from employee");
                result.last();
                int rows = result.getRow();
                employeearray = new String[rows][4];
                result.first();
                do{
                    int rowindex = result.getRow()-1;
                  employeearray[rowindex][0] = result.getString("id");
                  employeearray[rowindex][1] = result.getString("name");
                  employeearray[rowindex][2] = result.getString("nic");
                  employeearray[rowindex][3] = result.getString("gender");

                }
                while(result.next());
        }
        catch(SQLException expection)
        {
            System.out.println("Error"+expection.getMessage());
        }
        return employeearray;
    }

}


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public static List<Employee> getAll(){

        List<Employee> employeeList = new ArrayList<Employee>();

        try
        {
            // 1. Create A Database Connection -> java.sql.DriverManager

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","sudeepa");

            // 2. Create A Statement
            Statement statement = con.createStatement(1004,1007);

            // 3. Execute The SQL
            ResultSet result = statement.executeQuery("Select * from employee");

            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                String nic = result.getString("nic");
                int gender = result.getInt("gender");


                Employee emp =  new Employee();
                emp.setname(name);
                emp.setGender(gender);
                emp.setId(id);
                emp.setNic(nic);

                employeeList.add(emp);

            }
            return employeeList;

        }
        catch(SQLException expection)
        {
            System.out.println("Error"+expection.getMessage());
        }
        return employeeList;
    }

}


import java.sql.*;

public class GenderDao{

    public static Gender getbyId(int gender_id){

    try{


        Connection connection = DriverManager.getConnection("jbdc:mysql://localhost:3306/employee","root","sudeepa");
        Statement  stm = connection.createStatement();
        String sql = "SELECT * FROM gender where id = "+gender_id+";";
        
        ResultSet res = stm.executeQuery(sql);

        res.next();

        int id = res.getInt("id");
        String name =  res.getString("name");

        Gender gender = new Gender();

        gender.setId(id);
        gender.setName(name);

        return gender;
    
    }
        catch (SQLException exception){

            System.out.println(exception.getMessage());

        }
        return null;

    }
    

}
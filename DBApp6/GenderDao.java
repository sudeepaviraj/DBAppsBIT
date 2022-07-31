import java.sql.*;

public class GenderDao{

    public static Gender getbyId(int gender_id){

    try{
        ResultSet res = CommonDao.get("SELECT * FROM gender where id = "+gender_id+";");

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
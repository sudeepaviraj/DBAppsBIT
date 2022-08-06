import java.sql.*;
import java.util.*;
import org.hibernate.*;

public class GenderDao{

    public static List<Gender> getAll(){

        List<Gender> gender =  CommonDao.getall("SELECT * FROM gender", Gender.class);
    
        return gender;

    }
    
}
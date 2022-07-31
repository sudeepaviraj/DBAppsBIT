import java.sql.*;
import java.util.*;
import org.hibernate.*;

public class GenderDao{

    public static List<Gender> getAll(){

        List<Gender> genders =  CommonDao.get("get_all_gender");
        return genders;

    }
    
}
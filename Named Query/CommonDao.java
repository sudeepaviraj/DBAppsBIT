import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;

public class CommonDao {
    
    public static List get(String named_query){

        Session session = HibernateUtil.getSessionFactory().openSession();
        Query qry =session.getNamedQuery(named_query);
        List objList =  qry.list();
    
        return objList;


    }
    
}

import java.sql.*;
import java.util.*;
import org.hibernate.*;

public class GenderDao{

    public static List<Gender> getAll(){
        
        Session session = HibernateUtil.getSessionFactory().openSession();

        Query qry =session.getNamedQuery(named_query);
        
        List objList =  qry.list();
    
        return objList;

    }
    
}
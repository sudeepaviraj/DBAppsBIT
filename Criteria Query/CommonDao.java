import java.util.List;
import org.hibernate.*;

public class CommonDao {
    public static List getall(String query,Class class_name){

    Session session = HibernateUtil.getSessionFactory().openSession();

        Query qry = session.createNativeQuery(query,class_name);
        
        List objList =  qry.list();

        session.close();

        return objList;

    }
}

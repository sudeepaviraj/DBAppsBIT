import java.lang.reflect.GenericArrayType;
import java.util.List;
import org.hibernate.*;

public class CommonDao {
    public static List getall(String hql){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Query qry = session.createQuery(hql);
    
        List obj = qry.list();

        return obj;
 
     }
}

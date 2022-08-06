import java.lang.reflect.GenericArrayType;
import java.util.List;
import org.hibernate.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CommonDao {
    public static <T> List getall(Class<T> class_name){

        Session session = HibernateUtil.getSessionFactory().openSession();

        CriteriaBuilder criteria = session.getCriteriaBuilder();
 
        CriteriaQuery<T> qry = criteria.createQuery(class_name);
 
        Root<T> root = qry.from(class_name);
 
        qry.select(root);
 
        Query<T> q = session.createQuery(qry);
 
        List<T> obj = q.getResultList();
     
        return obj;
 
     }
}

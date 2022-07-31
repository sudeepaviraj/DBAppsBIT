import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;

public class CommonDao {
    
    public static List get(String named_query){

        List object = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = null;

        try{
           trans = session.beginTransaction();
           Query query = session.getNamedQuery(named_query);
           ;

           for (Object element :(List)query.list()){
            object.add(element);
           }

        }
        catch(Exception h){

            System.out.println("Error"+h.getMessage());
            if(trans!=null){
                trans.rollback();
            }

        }
        finally{
            session.close();
        }
        return object;

    }
    
}

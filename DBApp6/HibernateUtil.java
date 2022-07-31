import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

public class HibernateUtil {
    
    private static final SessionFactory session;

    static{
        try{
            new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }
        catch(Throwable exec){
            System.out.println("Failed! "+exec.getMessage());
            throw new ExceptionInInitializerError(exec);
        }
    }

    public static SessionFactory getSessionFactory(){
        return session;
    }

}

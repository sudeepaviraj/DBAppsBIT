import java.sql.*;
import java.util.*;
import org.hibernate.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class GenderDao{

    public static List<Gender> getAll(){

        Session session = HibernateUtil.getSessionFactory().openSession();

       CriteriaBuilder criteria = session.getCriteriaBuilder();

       CriteriaQuery<Gender> qry = criteria.createQuery(Gender.class);

       Root<Gender> root = qry.from(Gender.class);

       qry.select(root);

       Query<Gender> q = session.createQuery(qry);

       List<Gender> gender = q.getResultList();
    
        return gender;

    }
    
}
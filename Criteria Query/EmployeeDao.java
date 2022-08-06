import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.*;


public class EmployeeDao {

    public static List<Employee> getAll(){

       Session session = HibernateUtil.getSessionFactory().openSession();

       CriteriaBuilder criteria = session.getCriteriaBuilder();

       CriteriaQuery<Employee> qry = criteria.createQuery(Employee.class);

       Root<Employee> root = qry.from(Employee.class);

       qry.select(root);

       Query<Employee> q = session.createQuery(qry);

       List<Employee> empList = q.getResultList();
    
        return empList;

    }

}


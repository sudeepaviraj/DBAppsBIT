import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;

public class EmployeeDao {

    public static List<Employee> getAll(){


        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction trans = session.beginTransaction();

        Query qry = session.getNamedQuery("get_all");

        List<Employee> employeeList = qry.list();

        session.close();

        return employeeList;
    }

}


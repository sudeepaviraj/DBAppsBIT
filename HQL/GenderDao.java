import java.sql.*;
import java.util.*;
import org.hibernate.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class GenderDao{

    public static List<Gender> getAll(){

       List<Gender> gender = CommonDao.getall(Gender.class);
    
        return gender;

    }
    
}
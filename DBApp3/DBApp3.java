import java.util.List;

public class DBApp3 {

    public static void main(String[] args) {
        
        List<Employee> empList = EmployeeDao.getAll();

        for(Employee emloyee: empList){

            System.out.print(emloyee.getId()+" ");
            System.out.print(emloyee.getName()+" ");
            System.out.print(emloyee.getNic()+" ");
            System.out.print(emloyee.getGender()+" ");
            System.out.println("");

        }


    }
    
}
import java.util.List;

public class DBApp6 {

    public static void main(String[] args) {
        
        List<Employee> empList = EmployeeDao.getAll();

        for(Employee emloyee: empList){

            System.out.print(emloyee.getId()+" ");
            System.out.print(emloyee.getName()+" ");
            System.out.print(emloyee.getNic()+" ");
            System.out.print(emloyee.getGender().getName() +"\t"+ emloyee.getGender().getid() +" ");
            System.out.println("");

        }

        List<Gender> genders = GenderDao.getAll();

        for(Gender gender:genders){
            System.out.print(gender.getid());
            System.out.print("\t");
            System.out.print(gender.getName());
        }


    }
    
}
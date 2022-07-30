
public class DBApp2 {

    public static void main(String[] args) {
        
        String employeearray [][] = EmployeeDao.getAll();

        for (int i = 0; i<employeearray.length;i++)
        {
            for (int k = 0; k<4;k++)
            {
                System.out.print(employeearray[i][k]+" ");
            }
            System.out.println("");
        }

    }
    
}
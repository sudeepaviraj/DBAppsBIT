public class Employee {

    private int id ;
    private String name;
    private String nic;
    private int gender;

    public Employee(){

    }

    public int getId(){
      return this.id;
    };
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getNic(){
        return this.nic;
    }
    public void setNic(String nic){
        this.nic = nic;
    }
    public void setGender(int gender){
        this.gender = gender;
    }
    public int getGender(){
        return this.gender;
    }
}

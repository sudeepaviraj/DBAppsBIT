import javax.persistence.*;

@Entity
@Table(name="employee")

public class Employee {
    @Id
    @Column(name = "id")
    private int id ;
    @Column(name = "name")
    private String name;
    @Column(name = "nic")
    private String nic;
    @JoinColumn(name = "gender",referencedColumnName = "id")
    @ManyToOne
    private Gender gender;

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
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public Gender getGender(){
        return this.gender;
    }
}

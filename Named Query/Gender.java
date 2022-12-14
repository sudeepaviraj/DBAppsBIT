import javax.persistence.*;

@Entity
@Table(name="gender")
@NamedQueries({
    @NamedQuery(name = "get_all_gender",query = "SELECT g from Gender g")
})
public class Gender {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    public Gender(){

    }

    public void setId(int id){
        this.id = id;
    }
    public int getid(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
}
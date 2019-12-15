import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "group_table")

public class group {

    @Id
    @Column(name = "id_g")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id_group;
    @Column(name = "name_group")
    private  String name_group;


    public String getName_group() {
        return name_group;
    }

    public void setName_group(String name_group) {
        this.name_group = name_group;
    }


    public int getId_group() {
        return id_group;
    }

    public void setId_group(int id_group) {
        this.id_group = id_group;
    }

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private Set students;

    public Set getStudents() {
        return students;
    }

    public void setStudents(Set students) {
        this.students = students;
    }
}

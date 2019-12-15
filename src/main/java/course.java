import javax.persistence.*;
import java.util.HashSet;
import  java.util.Set;

@Entity
@Table(name = "course")
public class course {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_course",unique = true,nullable = false)
    private int id;
    @Column(name = "name_cours",nullable = false)
    private  String name;



    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "cours_student" ,joinColumns = {
            @JoinColumn(name = "id_course",nullable = false,updatable = false)},inverseJoinColumns = {@JoinColumn(name = "id",nullable = false,updatable = false)}

            )


    private  Set<student> students = new HashSet<student>();

    public Set<student> getStudents() {
        return students;
    }

    public void setStudents(Set<student> students) {
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

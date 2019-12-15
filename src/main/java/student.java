import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student_table")
public class student {

    @Id
    @Column(name = "id")

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name="name")
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "students")
    private Set<course> courses = new HashSet<course>();

    public Set<course> getCourses() {
        return courses;
    }

    public void setCourses(Set<course> courses) {
        this.courses = courses;
    }
    @ManyToOne
    @JoinColumn(name = "id_g")
    private group group;

    public group getGroup() {
        return group;
    }

    public void setGroup(group group) {
        this.group = group;
    }
}

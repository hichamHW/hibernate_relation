import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Set;
import java.util.HashSet;
public class test {


    public  static  void  main(String[] args){


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        group g= new group();
        g.setName_group("G_gi");
        student s = new student();
           s.setId(10);
           s.setName("yousef elb");
           s.setGroup(g);
        student s1 = new student();
        s1.setId(10);
        s1.setName("yassine el");

        s1.setGroup(g);

        student s2 = new student();
        s2.setId(10);
        s2.setName("haj el");
        s2.setGroup(g);


        Set<student> groups = new HashSet<student>();
        groups.add(s1);
        groups.add(s);
        groups.add(s2);
        g.setStudents(groups);



        try {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            em.persist(g);
            em.persist(s);
            em.persist(s2);
            em.persist(s1);



            em.getTransaction().commit();

        }catch (Exception e)
        {

        }



        emf.close();
    }
}

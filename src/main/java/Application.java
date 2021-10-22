import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args) {
        System.out.println("-> Library Project ->");
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();



    }
}

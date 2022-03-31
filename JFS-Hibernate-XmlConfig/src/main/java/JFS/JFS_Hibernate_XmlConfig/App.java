package JFS.JFS_Hibernate_XmlConfig;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        Configuration config=new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(
        		config.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory=config.buildSessionFactory(serviceRegistry);
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        System.out.println("***************** DISPLAYING THE ELEMENTS *************");
        Query q=session.createQuery("from Laptop");
        List<Laptop >l=q.list();
        for(Laptop p:l) {
        	System.out.println(p);
        }
        System.out.println("*****************************************************");
        System.out.println("************ SELECTING THE UNIQUE VALUE *************");
        Query q2=session.createQuery("from Laptop where id>8");
        System.out.println("Directly printing from query result:\n"+q2.uniqueResult());
        Laptop p=(Laptop)q2.uniqueResult();
        System.out.println("After assigning to Person variable:\n"+p);
        System.out.println("*****************************************************");
        System.out.println("***************** UPDATING THE VALUE ****************");
        Query q3=session.createQuery("update Laptop set brand='dell' where id=4");
        int valueupdate = q3.executeUpdate();
        System.out.println(valueupdate);
        System.out.println("*****************************************************");
        System.out.println("***************** DELETING THE ELEMENT **************");
        Query q4=session.createQuery("delete from Laptop  where id=4");
        int valuedelete = q4.executeUpdate();
        System.out.println(valuedelete);
        System.out.println("*****************************************************");
        System.out.println("************* DESC ORDER OF PRODUCT ID ***************");
        Query q5=session.createQuery("from Laptop p order by p.id desc");
        List<Laptop> l1=q5.list();
        for (Laptop p1:l1) {
        	System.out.println(p1);
        }
        System.out.println("*****************************************************");
        System.out.println("********************* PERSON NAME *******************");
        Query q6=session.createQuery("select pname from Person ");
        List  l2=q6.list();
        for (Object p2:l2) {
        	System.out.println(p2);
        }
        System.out.println("*****************************************************");
        System.out.println("***************** SUM OF THE LAPTOP PRICE ***********");
        Query q7 = session.createQuery("select sum(price) from Laptop");
        System.out.println("Sum of price value is:"+q7.uniqueResult());
        
        
        
//        Laptop laptop = new Laptop();
//        laptop.setId(9);
//        laptop.setBrand("dell");
//        laptop.setPrice(52200);
//        session.save(laptop);
//        Laptop laptop=new Laptop();
//        laptop.setId(6);
//        laptop.setBrand("ipad");
//        laptop.setPrice(55000);
//        session.save(laptop);
//        
//        Laptop laptop1=new Laptop();
//        laptop1.setId(7);
//        laptop1.setBrand("mac");
//        laptop1.setPrice(125000);
//        session.save(laptop1);
//        
//        Person person=new Person();
//        person.setPid(1);
//        person.setPname("sam");
//        person.getLaptop().add(laptop);
//        session.save(person);
//        
//        Person person1=new Person();
//        person1.setPid(2);
//        person1.setPname("vishal");
//        person1.getLaptop().add(laptop);
//        session.save(person);
//        
     session.getTransaction().commit();
//        
//        
        
    }
}
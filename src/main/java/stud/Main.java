package stud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created with IntelliJ IDEA.
 * User: AJ
 * Date: 14.12.13
 * Time: 13:35
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static String PERSISTENCE_UNIT_NAME="CashM" ;
    public static void  main(String arg[]){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em =factory.createEntityManager();
        Car car=new Car();
        car.setId(3);
        car.setColor("red");
        car.setName("BMV");

        saveCar(em, car);
        Car car2 =  getCarByid(em,3);
        System.out.println(car2.writeString());
    }

    private static void saveCar(EntityManager em, Car car)  {
        em.getTransaction().begin();
        em.persist(car);
        em.getTransaction().commit();
    }

    private static Car getCarByid(EntityManager em, int id)
    {return em.find(Car.class , id);}
   private static void remCar()   {

   }
}

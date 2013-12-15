package stud;
import javax.annotation.*;
import javax.persistence.*;


/**
 * Created with IntelliJ IDEA.
 * User: AJ
 * Date: 14.12.13
 * Time: 14:29
 * To change this template use File | Settings | File Templates.
 */

/**
 * Created with IntelliJ IDEA.
 * User: AJ
 * Date: 14.12.13
 * Time: 14:06
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    int id;
    String name;
    String color;

    public Car() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String writeString(){

        return  this.getName()+" "+this.getColor();
    }
}

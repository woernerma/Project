import ea.*;
import org.omg.CORBA.SystemException;

/**
 * Created by manuel on 18.05.2017.
 */
public class Person extends Bild {
    public Person(int xPos,int yPos) {
        super(xPos,yPos,"src/assets/Hut.png");

    }
    public static void moveForward(){
        System.out.println("Forward");

    }
    public static void moveBack(){
        System.out.println("Back");
    }
    public static void moveLeft(){
        System.out.println("Left");
    }
    public static void moveRight(){
        System.out.println("Right");
    }



}


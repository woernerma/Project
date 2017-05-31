import ea.*;
import org.omg.CORBA.SystemException;

/**
 * Created by manuel on 18.05.2017.
 */
public class Person extends Zone {
    public Person(int xPos,int yPos) {
        super(xPos,yPos,72,71,"src/assets/Hut.png");
        aktivMachen();
        schwerkraftAktivSetzen(false);

    }
      void moveForward(){
          bewegen(0,-1);
        }
      void moveBack(){
          bewegen(0,1);
    }
      void moveLeft() {
          bewegen(-1,0);
    }
      void moveRight(){
          bewegen(1,0);
    }



}


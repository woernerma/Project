import ea.*;

/**
 * Created by manuel on 18.05.2017.
 */
public class ARKADE extends Game{

    public static void main(String[] args) {
        Game arkade = new ARKADE();
    }

    public ARKADE(){
        super(800,600);
        //hintergrundSetzen(new Bild(0,0,));
        wurzel.add(new Schlüssel());
        wurzel.add(new Person(200,300));
    }


    @Override
    public void tasteReagieren(int i) {
        if (i == 22) Person.moveForward();
        else if (i == 0) Person.moveLeft();
        else if (i == 18) Person.moveBack();
        else if (i == 3) Person.moveRight();
    }
}

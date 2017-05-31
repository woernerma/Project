import ea.*;

/**
 * Created by manuel on 18.05.2017.
 */
public class ARKADE extends Game implements Ticker{
    Person figur;
    Schlüssel key1;
    Schlüssel key2;
    public static void main(String[] args) {
        Game arkade = new ARKADE();
    }

    public ARKADE(){
        super(800,600);
        //hintergrundSetzen(new Bild(0,0,));
        manager.anmelden(this,10);
        figur = new Person (200,300);
        key1 = new Schlüssel(750,550,38,16,"src/assets/SchlüsselAusgeschnitten.png");
        key2 = new Schlüssel(650,550,38,16,"src/assets/GoldenerSchlüssel.png");
        key1.erzeugeCollider();
        key2.erzeugeCollider();
        figur.erzeugeCollider();
        wurzel.add(key1);
        wurzel.add(key2);
        wurzel.add(figur);

    }


    @Override
    public void tasteReagieren(int i) {
        if (i == 22) figur.drehenAbsolut( 0  );
        else if (i == 0) figur.drehenAbsolut(270  );
        else if (i == 18) figur.drehenAbsolut(180);
        else if (i == 3) figur.drehenAbsolut(90);
        System.out.println(i);
    }
    @Override
   public void tick(){
        if(tasteGedrueckt(Taste.W)){
            figur.moveForward();
        }
        else if (tasteGedrueckt(Taste.A))
            figur.moveLeft();
        else if (tasteGedrueckt(Taste.S)) figur.moveBack();
        else if (tasteGedrueckt(Taste.D)) figur.moveRight();


   }
}


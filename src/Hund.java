/**
 * Created by spoppe on 03.08.2016.
 */
public class Hund {
    String name;
    public void bellen(){
        System.out.println(name + " sagt WauWau");
    }
    public static void main (String[] args){
        Hund hund1 = new Hund();
        hund1.name="Bert";
        hund1.bellen();


        Hund[] meineHunde = new Hund[3];

        meineHunde[0]= new Hund();
        meineHunde[1]= new Hund();
        meineHunde[2]= new Hund();

        meineHunde[0] = hund1;
        meineHunde[1].name="Karl-Heinz";
        meineHunde[2].name="Benno";

        System.out.print("Der Name des letzten Hundes ist ");
        System.out.println(meineHunde[2].name);

        int x=0;
        while (x<meineHunde.length){
            meineHunde[x].bellen();
            x++;
        }
    }

}

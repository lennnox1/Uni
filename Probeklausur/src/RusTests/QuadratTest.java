package RusTests;
import RusTools.*;
public class QuadratTest {
 public static void main(String[] args){
 Quadrat object = new Quadrat(10.0); // Erstellt ein  Quadrat mit Seitenl�nge 10
 double ergebnis = object.getFlaeche( ); // Greift auf die methode getFlaeche zu
 Rechteck object1 = new Rechteck(10.0,15.0); // Erstellt ein Rechteck L�nge 10 H�he 15
 double ergebnisRecht = object1.getFlaeche(); // Greift auf die methode getFlaeche zu 
 Quadrat1 object2 = new Quadrat1(12);
 double ergebnisQ1 = object2.getFlaeche();
 System.out.println("Die Fl�che des Quadrats betr�gt: " +ergebnis);
 System.out.println("Die Fl�che des Rechtecks betr�gt: " +ergebnisRecht);
 System.out.println("Die Fl�che des Quadrats1 betr�gt: " +ergebnisQ1);
 Rechteck1 object3 = (Rechteck1) object2;
 object3.setHoehe(15);
 double e1 = object3.getFlaeche();
 System.out.println(e1);
 }
}

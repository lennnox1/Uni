package RusTests;
import RusTools.*;
public class QuadratTest {
 public static void main(String[] args){
 Quadrat object = new Quadrat(10.0); // Erstellt ein  Quadrat mit Seitenl�nge 10
 double ergebnis = object.getFlaeche( ); // Greift auf die methode getFlaeche zu
 Rechteck object1 = new Rechteck(10.0,15.0); // Erstellt ein Rechteck L�nge 10 H�he 15
 double ergebnisRecht = object1.getFlaeche(); // Greift auf die methode getFlaeche zu 
 System.out.println("Die Fl�che des Quadrats betr�gt: " +ergebnis);
 System.out.println("Die Fl�che des Rechtecks betr�gt: " +ergebnisRecht);
 }
}

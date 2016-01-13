package RusTests;
import RusTools.*;
public class QuadratTest {
 public static void main(String[] args){
 Quadrat object = new Quadrat(10.0);
 double ergebnis = object.getFlaeche( );
 Rechteck object1 = new Rechteck(10.0,15.0);
 double ergebnisRecht = object1.getFlaeche();
 System.out.println("Die Fläche des Quadrats beträgt: " +ergebnis);
 System.out.println("Die Fläche des Rechtecks beträgt: " +ergebnisRecht);
 }
}

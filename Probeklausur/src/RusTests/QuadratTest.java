package RusTests;
import RusTools.*;
public class QuadratTest {
 public static void main(String[] args){
 Quadrat object = new Quadrat(10.0);
 double ergebnis = object.getFlaeche( );
 System.out.println("Die Fl�che des Quadrats betr�gt: " +ergebnis);
 }
}

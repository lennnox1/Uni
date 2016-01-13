package RusTools;
public class Quadrat {
 private double len; // Seitenlaenge
 public Quadrat(double len){
 this.len = len;
 }
 
 /* Implementierung der Funktion „getFlaeche“ */
 
 public double getFlaeche ( ) {
	 return this.len * this.len; 
	 }

}
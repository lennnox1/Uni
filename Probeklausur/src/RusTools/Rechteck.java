package RusTools;
public class Rechteck extends Quadrat {
	
/* 1) Fields */
	
private double len;
private double hoehe;
	
/* 2) Implementierung des Konstruktors */

public Rechteck(double len, double hoehe) {
	super(len);
	this.len = len;
	this.hoehe = hoehe;
	}

/* 3) Implementierung von getFlaeche( ) */

public double getFlaeche(){
	return this.len * this.hoehe; // Flächeninhalt Seitenlänge * Höhe 
	}
}
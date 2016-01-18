package RusTools;
public class Rechteck extends Quadrat {
	
/* 1) Fields */
	
private double len; // Seitenlaenge
private double hoehe; // Höhe
	
/* 2) Implementierung des Konstruktors */

public Rechteck(double len, double hoehe) {
	super(len);
	this.len = len;
	this.hoehe = hoehe;
	}

/* 3) Implementierung von getFlaeche( ) */

public double getFlaeche(){
	return len * this.hoehe; // Flächeninhalt Seitenlänge * Höhe 
	}
}
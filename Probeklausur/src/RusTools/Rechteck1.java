package RusTools;

public class Rechteck1 {
	private double len; // Seitenlaenge
	private double hoehe;
	public Rechteck1(double len, double hoehe) {
		this.len = len;
		this.hoehe = hoehe;
	}
	public double getFlaeche(){
		return len * this.hoehe; // Fl�cheninhalt Seitenl�nge * H�he 
	}
	public void setHoehe(double hoehe)
	{
		this.hoehe = hoehe;
	}
}

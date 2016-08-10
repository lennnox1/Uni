
public class Fahrzeug {
	int km_stand;
	int km_seit_inspektion;
	String  kennzeichen;
	boolean vermietbar;
	int mietpreis;
	int intervall_inspektion;

	public Fahrzeug(int km_stand_Kon, String kennzeichen_kon) {
		km_stand=km_stand_Kon;
		kennzeichen=kennzeichen_kon;
		km_seit_inspektion=km_stand_Kon;
		vermietbar=true;
	}
	public void vermieten(){
		if(vermietbar==true){
			System.out.println("Kennzeichen: "+ kennzeichen  +" wird vermietet");
			vermietbar=false;
		}else{
			System.out.println("Kennzeichen: "+ kennzeichen  +" ist vermietet");
		}
	}
	public void Return(int Mietdauer,int km_gefahren){
		vermietbar=true;
		km_stand=km_stand+km_gefahren;
		km_seit_inspektion=km_seit_inspektion+km_gefahren;
		System.out.println("Aktueller Km-Stand: " +km_stand+"km");
		Kosten(Mietdauer);
		if(km_seit_inspektion>intervall_inspektion){;
			Inspektion();
		}
		
		
	}
	public void Inspektion(){
		System.out.println("Inspektion ist nötig!");
		km_seit_inspektion=0;
	}
	public int Kosten(int t){
		int Preis=t*mietpreis;
		System.out.println("Mietkosten: "+Preis+ "Euro");
		return Preis;
	}
}

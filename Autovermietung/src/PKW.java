
public class PKW extends Fahrzeug{
	
	static int Fuhrpark=0;	
	
	public PKW(int km_stand_Kon, String kennzeichen_kon){
		super(km_stand_Kon,  kennzeichen_kon);
		mietpreis=30;
		intervall_inspektion=30000;
		Fuhrpark=Fuhrpark+1;
	}
	
	public void Return(int Mietdauer,int km_gefahren){
		super.Return(Mietdauer, km_gefahren);
		Fuhrpark=Fuhrpark+1;
	}
	
	public void vermieten(){
		if(vermietbar==true){
			Fuhrpark=Fuhrpark-1;
		}
		super.vermieten();	
	}
	
	//public class PKW(){
	
	/*int km_stand;
	int km_gefahren;
	String  kennzeichen;
	boolean vermietet;
	int Km_seit_Inspek=0;
	static int Fuhrpark=0;

	public PKW(int km_stand_Kon, String kennzeichen_Kon){
	
		km_stand=km_stand_Kon;
		kennzeichen=kennzeichen_Kon;
		vermietet=true;
		Fuhrpark=Fuhrpark+1;
	}
	public int Return(int dauer, int km_gefahren){
		int akt_Km_stand = km_stand+km_gefahren;
		Km_seit_Inspek=akt_Km_stand;
		int kosten=dauer*30;
		System.out.println("Gefahrenen KM: "+akt_Km_stand+"Km");
		System.out.println("Mietdauer: "+ dauer +"Tage");
		System.out.println("Mietkosten: "+kosten+ "Euro");
		
		if(Km_seit_Inspek>20000){
		System.out.println("Inspektion ist nötig!");
		Km_seit_Inspek=0;	 
		}
		Fuhrpark=Fuhrpark+1;
		System.out.println(Fuhrpark+" PKW können vermietet werden");
		return akt_Km_stand;
	}
	public void vermieten(){
		if(vermietet==true){
			vermietet=false;
			System.out.println("Kennzeichen: "+kennzeichen  +" wird vermietet");
			Fuhrpark=Fuhrpark-1;
			System.out.println(Fuhrpark+" PKW können vermietet werden");
			
		}
			
	}*/

}

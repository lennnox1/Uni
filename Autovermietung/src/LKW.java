
public class LKW extends Fahrzeug {
	int Nutzlast;
	static int Fuhrpark=0;
	public LKW(int km_stand_Kon, String kennzeichen_kon,int Nutzlast_kon) {
		super(km_stand_Kon, kennzeichen_kon);
		intervall_inspektion=20000;
		Nutzlast=Nutzlast_kon;
		
		if(Nutzlast>=1800){
			mietpreis=80;
		}
		else{
			mietpreis=50;
		}
		Fuhrpark=Fuhrpark+1;
	}
	
	public void vermieten(){
		if(vermietbar==true){
			Fuhrpark=Fuhrpark-1;
		}
		super.vermieten();	
	}
	
	public void Return(int Mietdauer,int km_gefahren){
		super.Return(Mietdauer, km_gefahren);
		Fuhrpark=Fuhrpark+1;
		}
	
}
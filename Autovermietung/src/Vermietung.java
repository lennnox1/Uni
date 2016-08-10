
public class Vermietung {

	
	
	public static void main(String[] args){
		PKW PKW1 = new PKW(1000,"BOBV317");
		LKW LKW1 = new LKW(1000,"BOPV2907",1800);
		LKW1.vermieten();
		PKW1.vermieten();
		PKW1.Return(2,29100);
		KFZvorhanden();
	}
	public static void KFZvorhanden(){
		System.out.println("Vorhandene Fahrzeuge im Fuhrpark: "+PKW.Fuhrpark+" PKW und "+LKW.Fuhrpark+"LKW");
		
	}
}


public class Bankkonto {
	int  kontostand;
	String iban;
	String bic;
	String einzahlung;
	String auszahlung;
	String vorz;
	static int gesamtbetrag=0;
	public Bankkonto(String iban_k,String bic_k,int kontostand_k) {
	kontostand=kontostand_k;
	iban=iban_k;
	bic=bic_k;
	gesamtbetrag=gesamtbetrag+kontostand_k;
	}
	
	public String einzahlung(String vor,int cash){
		if(vor=="+"){
			vorz=einzahlung;
		gesamtbetrag=gesamtbetrag+cash;
		}
		if(vor=="-"){
			vorz=auszahlung;
			gesamtbetrag=gesamtbetrag-cash;
		}
		return vorz;	
	}
	public static void finanzstatus(){
		System.out.println(gesamtbetrag);	
		
	}
	
	public static void main(String[] args) {
	Bankkonto K1 = new Bankkonto("asd33", "adadjh11", 1000);
	Bankkonto K2 = new Bankkonto("asd33", "adadjh11", 1000);
	K1.einzahlung("+", 1000);
	Bankkonto.finanzstatus();
	
	}

}

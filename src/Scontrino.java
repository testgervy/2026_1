
public class Scontrino {
private int numMacchina;
private int[] vettPrezzi={4,5,6,1,1,1,1};
private int numCicli;
private String data;


	public Scontrino(int num, int numC, String data) {
	
	numMacchina = num;
	numCicli = numC;
	this.data = data;
}
public boolean isLavatrice() {
	if(vettPrezzi[numMacchina-1]==4)
		return true;
	else if(vettPrezzi[numMacchina-1]==5)
		return true;
	else if(vettPrezzi[numMacchina-1]==6)
		return true;
	else if(vettPrezzi[numMacchina-1]==1)
		return true;
	return false;
}


	public int getPrezzi() {
	 return vettPrezzi[numMacchina-1];
}
public String toString() {
	String s;
	s="tipo di macchina: "+numMacchina;
	s+="\nnumero di cicli: "+numCicli;
	return s;
}
	public static void main(String[] args) {
Scontrino s1=new Scontrino(1,3,"21/10/2089");
System.out.println(s1);
	}

}

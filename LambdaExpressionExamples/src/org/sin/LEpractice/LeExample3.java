package org.sin.LEpractice;


interface stringConcat{
	public String Sconcat(String a,String b);
}
public class LeExample3 {

	public static void main(String[] args) {
	
		stringConcat stc=(a,b)->a+b;
		System.out.println("Result:"+stc.Sconcat("SINDHU.", "NALLANI"));

	}

}

package org.sin.LEpractice;


interface MyFI{
	public String displayHello();
}
public class LeExample2 {

	public static void main(String[] args) {
	
		MyFI myfi=()->{
		return "HELLO";
		
	};
	System.out.println(myfi.displayHello());
	}
}

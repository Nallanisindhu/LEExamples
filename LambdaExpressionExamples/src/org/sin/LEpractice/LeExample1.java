package org.sin.LEpractice;
//import org.sin.LEpractice.Example.Addition;


/**
 * This is FunctionalInterface
 * @author sindu
 *
 */
interface Addition {
	int add(int a,int b) ;
		
	
}
/**
 * This class is used for Adding Integers
 *
 */
public class LeExample1 {
	
	public static void main(String[] args) {
		
		/**
		 * Addition operation with Datatype by using LambdaExpression
		 */ 
		Addition add=(int a,int b)->(a+b);
		
		System.out.println("sum of a nd b with datatype  :"+add.add(20, 30));
		/**
		 * Addition operation without Datatype by using LambdaExpression
		 */ 
		
		Addition  add1=(a,b)->(a+b);
		System.out.println("sum of a and b without datatype:"+add1.add(3,5 ));
	}

}

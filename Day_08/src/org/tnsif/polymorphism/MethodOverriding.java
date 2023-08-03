// Program to demonstrate on method overriding
package org.tnsif.polymorphism;
class CM{
	static void curruption(String str1,float amount) {
		System.out.println(str1+" Coruppted amount of  "+ amount);
	}
	
}
class MLA extends CM{
	
	static void curruption(String str2,float amount2) {
		CM.curruption("Eknath Shinde", 50000000f);
		System.out.println(str2+" Coruppted amount of  "+ amount2);
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		MLA.curruption("Manikrao Kokate", 25000000f);

	}

}

package MavenDemo;

public class HashCodeDemo {
public static void main(String[] args) {
	String str1= new String("Pune");
	String str2 = new String("Pune");
	
	System.out.println("HEAP HC1: " + System.identityHashCode(str1));
	System.out.println("SCP HC1: "+ str1.hashCode());
	
	System.out.println("HEAP HC2: " + System.identityHashCode(str2));
	System.out.println("SCP HC2: "+ str2.hashCode());
	
	String str3 = "Pune";
	System.out.println("HEAP HC3: " + System.identityHashCode(str3));
	System.out.println("SCP HC3: "+ str3.hashCode());
}
}

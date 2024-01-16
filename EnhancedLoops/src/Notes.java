import java.util.Arrays;


public class Notes {
	
	public static void main(String[] args) {
		
	String[] strings = {"Hello", "World"} ;
	for(String str : strings) {
		str += "s";
		
	}
	System.out.println(Arrays.toString(strings));

	
	Integer[] myInts = { new Integer(1), new Integer(2) } ;
	for(Integer temp : myInts) {
		temp++;
	}
	System.out.println(Arrays.toString(myInts));

} 
 
}


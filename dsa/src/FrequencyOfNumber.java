import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfNumber {

	public static void getFreguency( int ary[] ) {
		int count;
		int length = ary.length;
		
		for( int i = 0; i < length; i++ ) {
			count = 1;
			for( int j = i+1; j < length; j++ ) {
				if( ary[i] == ary[j] ) {
					count++;
					ary[j] = '\0';
				}
			}
			if( ary[i] != '\0') {
				System.out.println(ary[i] + " : " + count);
			}
		}
		
	}
	
	public static void getFreq( int ary[] ) {
		Map<Integer, Integer> map = new TreeMap<>();
		
//		serch value -- putiing or increment
		
		for( int i = 0 ; i < ary.length ; i++ ) {
			if(map.containsKey(ary[i])) {
				map.put( ary[i], map.get(ary[i]) + 1 );
			} else {
				map.put(ary[i], 1);
			}
//			System.out.println(map);
		}
		
		// traverse map
		for(Map.Entry<Integer, Integer> entry : map.entrySet() ) {
			System.out.println(entry.getKey()+ " frequency is : " + entry.getValue());
		}
	}
	
	
	
	public static void getStrFrequency( String str) {
		String ary[] = str.split("");
		int counter;
		for( int i=0 ; i<ary.length ; i++) {
			counter=1;
			for(int j=i+1 ; j<ary.length ; j++) {
				if(ary[i].equals(ary[j])) {
					counter++;
					ary[j] = " ";
				}
			}
			if(!ary[i].equals(" ")){
				System.out.println(ary[i] + " occurance is " + counter);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int ary[] = {2,5,5,4,5,6,3,7,3,1,7};
//		FrequencyOfNumber.getFreguency(ary);
		FrequencyOfNumber.getFreq(ary);
		
//		String string = "innogent";
//		FrequencyOfNumber.getStrFrequency(string);
		
	}
	
}

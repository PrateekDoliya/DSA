

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
		
		int ary[] = {2,5,4,8,1,3,4,9,2,3,2};
		FrequencyOfNumber.getFreguency(ary);
		
		String string = "innogent";
		FrequencyOfNumber.getStrFrequency(string);
		
	}
	
}

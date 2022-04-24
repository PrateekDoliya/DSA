
public class ReverseArray {

	public static int[] reverseArray(int ary[]){
		int len = ary.length;
		int temp;
		
		for(int i=0 ; i<len/2 ; i++) {
			temp=ary[i];
			ary[i]=ary[len-1-i];
			ary[len-1-i]=temp;
		}
		return ary;
	}
	
	public static void traverseArray(int ary[]) {
		for(int i=0 ; i<ary.length ; i++){
			System.out.println(ary[i]);
		}
	}
	
	public static void main(String[] args) {
		
		
		int ary[] = {1, 2, 3, 4, 5, 6};
		ReverseArray.traverseArray(ReverseArray.reverseArray(ary));
		

	}

}
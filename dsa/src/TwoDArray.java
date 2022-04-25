
public class TwoDArray {

	public static void main(String[] args) {
		
		int ary [][] = new int[4][3];
		int temp=2;
		
		System.out.println(ary.length);
		System.out.println(ary[0].length);
		
		for(int i=0 ; i<ary.length ; i++) {
			for(int j=0 ; j<ary[i].length ; j++) {
				ary[i][j] = temp;
				temp+=2;
			}
		}
		
		for(int i=0 ; i<ary.length ; i++) {
			for(int j=0 ; j<ary[i].length ; j++) {
				System.out.println("ary["+i+"]["+j+"] is : " + ary[i][j]);
			}
		}

	}

}

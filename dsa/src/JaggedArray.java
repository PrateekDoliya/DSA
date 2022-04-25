
public class JaggedArray {

	public static void main(String[] args) {
		
		int ary[][] = new int[4][];
		int temp =2 ;
		ary[0] = new int [3];
		ary[1] = new int [2];
		ary[2] = new int [4];
		ary[3] = new int [1];
		
		for(int i=0 ; i<ary.length ; i++) {
			for(int j=0 ; j<ary[i].length ; j++) {
				ary[i][j] = temp;
				temp+=2;
			}
		}
		
		for(int i=0 ; i<ary.length ; i++) {
			for(int j=0 ; j<ary[i].length ; j++) {
				System.out.println("ary["+i+"]["+j+"] is : "+ ary[i][j]);
			}
		}

	}

}


public class JaggedArray {

	public static void main(String[] args) {
		int ary[][] = new int[3][];
		ary[0] = new int [3];
		ary[1] = new int [1];
		ary[2] = new int [2];
		int temp=2;
		
		for(int i=0 ; i<ary.length ; i++) {
			for(int j=0 ; j<ary[i].length ; j++) {
				ary[i][j] = temp;
				temp+=2;
			}
		}
		
		for(int i=0 ; i<ary.length ; i++) {
			for(int j=0 ; j<ary[i].length ; j++) {
				System.out.println("ary["+i+"]["+j+"] : "+ ary[i][j]);
			}
		}

	}

}

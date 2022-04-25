
public class BubbleSort {

	public static int[] sortArray(int ary[]) {
		
		for ( int i = 0 ; i < ary.length ; i++ ) {
			for ( int j = 0 ; j < ary.length - 1 - i ; j++) {
				if (ary[j] > ary[j+1] ) {
					int temp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp;
				}
			}
		}
		
		return ary;
	}
	
	public static int[] optimizedSortArray( int ary[] ) {
		
		boolean flag;
		int len = ary.length;
		for ( int i = 0 ; i < len ; i++ ) {
			flag = false;
			for ( int j = 0; j < len - 1 - i; j++ ) {
				if ( ary[j] > ary[j+1] ) {
					int temp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp;
					flag= true;
				}
			}
			
			if (!flag) {
				break;
			}
		}
		
		return ary;
	}
	
	public static void traverseArray(int ary[]) {
		for(int i=0 ; i< ary.length ; i++) {
			System.out.println(ary[i]);
		}
	}
	
	public static void main(String[] args) {
		int ary[] = { 8, 5, 4, 1, 3, 7};
//		int ary1[] =BubbleSort.sortArray(ary);
//		BubbleSort.traverseArray(ary1);
		
		int ary1[] =BubbleSort.optimizedSortArray(ary);
		BubbleSort.traverseArray(ary1);
		
	}
	
}

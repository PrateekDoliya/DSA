package SortingAlgo;

public class SelectionSort {

	public static int[] sortArray ( int ary[] ) {

		int len = ary.length;
		for( int i= 0; i< len-1 ; i++) {
			int min = i;
			for( int j = i+1 ; j < len ; j++ ) {
				if(ary[j] < ary[min]) {
					min = j;
				}
			}
			int temp = ary[min];
			ary[min] = ary[i] ; 
			ary[i] = temp;
		}
		return ary;
	}
	
	public static char[] sortCharArray( char ch[] ) {
		int n = ch.length;
		for( int i=0 ; i< n-1 ; i++) {
			int min=i;
			for(int j=i+1 ; j<n ; j++ ) {
				if(String.valueOf(ch[min]).compareTo(String.valueOf(ch[j])) > 0 ) {
					min = j;
				}
			}
			char temp = ch[min];
			ch[min] = ch[i];
			ch[i] = temp;
		}
		return ch;
	}
	
	public static void printArray( int ary[] ) {
		for( int i = 0; i < ary.length; i++ ) {
			System.out.println( ary[i] );
		}
	}
	
	public static void printCharArray( char ary[] ) {
		for( int i = 0; i < ary.length; i++ ) {
			System.out.println( ary[i] );
		}
	}
	
	public static void main(String[] args) {
		
		int ary[] = {20,12,24,3,5,23};
//		SelectionSort.printArray(SelectionSort.sortArray(ary));
		char ch[] = {'g', 'd', 'e', 'q', 'a'};
		SelectionSort.printCharArray(SelectionSort.sortCharArray(ch));
		
		
	}
	
}

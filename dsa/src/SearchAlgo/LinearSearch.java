package SearchAlgo;

public class LinearSearch {

	public static void searchAnElement( int ary[], int elementToSearch) {
		int flag=0;
		for( int i=0 ; i<ary.length ; i++) {
			if(ary[i] == elementToSearch) {
				System.out.println("Element is present at index: " + i);
				flag=1;
			}
		}
		if( flag == 0 ) {
			System.out.println("Element is not present");
		}
	}
	
	public static void main(String[] args) {
		int ary[] = {2,4,3,5,84,36,1,5};
		LinearSearch.searchAnElement(ary, 99);
		
	}
	
	
}

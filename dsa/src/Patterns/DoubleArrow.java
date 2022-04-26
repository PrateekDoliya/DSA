package Patterns;

/*
           
            
*
 **
  ***
   ****
    *****
     ******
      *******
     ******
    *****
   ****
  ***
 **
*

*/


public class DoubleArrow {

	public static void printArrow(){
		
		// printing upper part
		for(int i=1; i <= 7; i++ ) {
			for(int j = 0; j < i; j++ ) {
			
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// printing lower part
		for( int i = 1; i<= 6; i++ ) {
			for( int j = 6; j >= i; j--) {
				System.out.print(" ");
			}
			for( int k = 6; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		DoubleArrow.printArrow();
		
	}

}

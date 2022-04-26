package Patterns;
 /*
  
//  Star Hour Glass
 
 * * * * * * *
  * * * * * *
   * * * * *
    * * * *
     * * *
      * *
       * 
      * *  
     * * *
    * * * * 
   * * * * *
  * * * * * * 
 * * * * * * *
 
 
 //  Numeric Hour Glass
 
   1 2 3 4 5
    1 2 3 4
     1 2 3
      1 2
       1 
      1 2  
     1 2 3
    1 2 3 4 
   1 2 3 4 5

 
 
 */

public class HourGlass {
	
	public static void starGlass(int n) {
		
		// printing upper part of glass
		for( int i = 1; i <= n; i++ ) {
			for( int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for( int k = n; k >= i; k-- ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// printing lower part of glass
		for( int i = 1; i < n; i++ ) {
			for( int j = n-1; j >= i; j-- ) {
				System.out.print(" ");
			}
			for( int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
	public static void numericGlass(int n) {
		
		int num;
		// printing upper part 
		for( int i = 1; i <= n; i++) {
			for( int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			num=1;
			for( int k = n; k >= i ; k--) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
		// printing upper part 
		for( int i = 1; i <= n ; i++ ) {
			for( int j = n; j >= i; j-- ) {
				System.out.print(" ");
			}
			num=1;
			for( int k = 1; k <= i; k++ ) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
//		HourGlass.starGlass(4);
		HourGlass.numericGlass(5);
	}

}

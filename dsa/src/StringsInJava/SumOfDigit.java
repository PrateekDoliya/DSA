package StringsInJava;

public class SumOfDigit {

	public static int sumOfDigit(String str) {
		char ch[] = str.toCharArray();
		int sum = 0; 
		
		for(int i=0 ; i< ch.length ; i++) {
			if(Character.isDigit(ch[i])) {
				int digit = Integer.parseInt(String.valueOf(ch[i]));
				sum = sum + digit;
			}
		}
		return sum;
	}
	
	public static int sumOfDigit2(String str) {
		
		char ch[] = str.toCharArray();
		String temp;
		int sum=0;
		
		for(int i=0 ; i<ch.length-1 ; i++) {
			if (Character.isDigit(ch[i])) {
				temp=String.valueOf(ch[i]);
				if(Character.isDigit(ch[i+1])){
					temp = temp.concat(String.valueOf(ch[i+1]));
					int digit = Integer.parseInt(temp);
					sum += digit;
				}
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int sum = SumOfDigit.sumOfDigit("pra12ee54k78");
		System.out.println(sum);
		
		int sum1 = SumOfDigit.sumOfDigit2("pra12ee54k78");
		System.out.println(sum1);
		

	}

}

package week1.day2.Assignments1;

public class PrimeNumber {
	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for(int i = 2;i <= input / 2;i++) {
			if(input % i == 0) {
				flag= true;
				break;
			}
		}
		if(!flag) {
			System.out.println("it is prime no");
			
		}
			else {
				System.out.println("not a prime no");
			}
		}
	}



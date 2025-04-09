public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int sumOfDigits(int num){
		if(num < 10 && num > -10){
			return Math.abs(num);
		}
		return Math.abs(num % 10) + sumOfDigits(num / 10);
	}
	public static int factorial(int SKABOOM){
		if(SKABOOM == 0){
			return 1;
		}
		else if(SKABOOM < 0){
			return 0;
		}
		return SKABOOM * factorial(SKABOOM - 1);
	}
	

}

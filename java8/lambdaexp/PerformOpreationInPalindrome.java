package java8.lambdaexp;

interface palindromecheck {
	int checkpalindrome(int palindrome);

	public class PerformOpreationInPalindrome {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			palindromecheck palindrome1 = (int palindrome) -> {
				// Palindrome p1 = (num)-> {
				int rev = 0;
				int temp = palindrome;
				while (temp > 0) {
					int result = temp % 10;
					rev = rev * 10 + result;
					temp = temp / 10;
				}
				return rev;
			};

			int rev1, num1 = 454;
			rev1 = palindrome1.checkpalindrome(num1);
			if (rev1 == num1) {
				System.out.println("The number is palindrome " + num1);
			} else {
				System.out.println("The number is not palindorme " + num1);
			}
		}
	}
}
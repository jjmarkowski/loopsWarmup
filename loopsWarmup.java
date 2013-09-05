public class loopsWarmup {

	public static void main(String[] args) {
		int n = 5;
		int x = 3;
		int answer;

		answer = sum(5);
		System.out.println(answer);

	}

	public static int sum(int n) {
		int sum = 0;
		for (int i=1; i<=n; i++) {
			sum = sum + i;
		}

		return sum;
	}

	
}
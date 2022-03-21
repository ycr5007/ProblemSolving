package programmers.question.lv1.q04;

public class Way2 {
	public static int solution(int n) {
		String str = "";
		for(; n >= 1; n /= 3) {
			str = str + (n % 3);
		}
		// Integer.parseInt("String", number system);
		return Integer.parseInt(str, 3);
	}
	
	public static void main(String[] args) {
		System.out.println(solution(125));
	}
}

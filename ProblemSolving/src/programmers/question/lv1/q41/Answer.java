package programmers.question.lv1.q41;

public class Answer {
	public static int solution(int left, int right) {
		int answer = 0;
		for(int i = left; i <= right; i++) {
			if(i % Math.sqrt(i) == 0) {
				answer -= i; // 제곱수인 경우 약수는 홀수개
			}else {
				answer += i; // 제곱수가 아닌경우 약수는 짝수개
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(13, 17));
	}
}

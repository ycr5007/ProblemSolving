package programmers.question.lv1.q30;

public class Way2 {
	public static boolean solution(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.toString(s.charAt(i)).equalsIgnoreCase("p")) {
				count++;
			}else if(Character.toString(s.charAt(i)).equalsIgnoreCase("y")) {
				count--;
			}
		}
		return count == 0 ? true : false;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
	}
}
/*
	정확성  테스트
		테스트 1 〉	통과 (0.04ms, 67.1MB)
		테스트 2 〉	통과 (0.07ms, 72.4MB)
		테스트 3 〉	통과 (0.05ms, 74.4MB)
		테스트 4 〉	통과 (0.04ms, 75.9MB)
		테스트 5 〉	통과 (0.05ms, 73.8MB)
		테스트 6 〉	통과 (0.21ms, 76.4MB)
		테스트 7 〉	통과 (0.14ms, 84.1MB)
		테스트 8 〉	통과 (0.18ms, 77.4MB)
		테스트 9 〉	통과 (0.22ms, 78.4MB)
		테스트 10 〉	통과 (0.14ms, 74.6MB)
		테스트 11 〉	통과 (0.19ms, 75.4MB)
		테스트 12 〉	통과 (0.22ms, 72.3MB)
		테스트 13 〉	통과 (0.14ms, 77.6MB)
		테스트 14 〉	통과 (0.13ms, 72.4MB)
		테스트 15 〉	통과 (0.13ms, 76.5MB)
		테스트 16 〉	통과 (0.12ms, 79.7MB)
		테스트 17 〉	통과 (0.20ms, 73.1MB)
		테스트 18 〉	통과 (0.18ms, 76.4MB)
		테스트 19 〉	통과 (0.17ms, 73MB)
		테스트 20 〉	통과 (0.15ms, 74MB)
		테스트 21 〉	통과 (0.20ms, 73.9MB)
		테스트 22 〉	통과 (0.26ms, 75.6MB)
		테스트 23 〉	통과 (0.22ms, 79.8MB)
		테스트 24 〉	통과 (0.20ms, 77.8MB)
		테스트 25 〉	통과 (0.19ms, 72.8MB)
		테스트 26 〉	통과 (0.19ms, 80.2MB)
		테스트 27 〉	통과 (0.15ms, 73.3MB)
		테스트 28 〉	통과 (0.17ms, 73.5MB)
		테스트 29 〉	통과 (0.03ms, 75.2MB)
		테스트 30 〉	통과 (0.17ms, 74.4MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
 
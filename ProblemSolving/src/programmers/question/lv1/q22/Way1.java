package programmers.question.lv1.q22;


/*
	이상한 문자 만들기
	
	문제 설명
		문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
		각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
		
	제한 사항
		문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
		첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
	
	입출력 예
		s					return
		"try hello world"	"TrY HeLlO WoRlD"
	
	입출력 예 설명
		"try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다. 각 단어의 짝수번째 문자를 대문자로, 
		홀수번째 문자를 소문자로 바꾸면 "TrY", "HeLlO", "WoRlD"입니다. 따라서 "TrY HeLlO WoRlD" 를 리턴합니다.
*/

public class Way1 {
	
	public static String solution(String s) {
        String answer = "";
        int count = 0;
        String[] str = s.split("", -1);
        for(int i = 0; i < str.length; i++) {
        	if(str[i].equals(" ")) {
        		answer = answer + " ";
        		count = 0;
        	}else {
        		if(count % 2 == 0) {
        			answer = answer + str[i].toUpperCase();
        			count++;
        		}else {
        			answer = answer + str[i].toLowerCase();
        			count++;
        		}
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(" try     hello world "));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (2.67ms, 79.4MB)
		테스트 2 〉	통과 (1.43ms, 78.7MB)
		테스트 3 〉	통과 (2.46ms, 73.5MB)
		테스트 4 〉	통과 (2.40ms, 71.5MB)
		테스트 5 〉	통과 (2.07ms, 82.1MB)
		테스트 6 〉	통과 (1.80ms, 80.4MB)
		테스트 7 〉	통과 (2.45ms, 76.5MB)
		테스트 8 〉	통과 (2.87ms, 75.6MB)
		테스트 9 〉	통과 (2.37ms, 74.6MB)
		테스트 10 〉	통과 (2.54ms, 76.2MB)
		테스트 11 〉	통과 (2.72ms, 74.7MB)
		테스트 12 〉	통과 (3.05ms, 79.9MB)
		테스트 13 〉	통과 (2.22ms, 75.4MB)
		테스트 14 〉	통과 (2.11ms, 80.1MB)
		테스트 15 〉	통과 (1.91ms, 78.7MB)
		테스트 16 〉	통과 (2.45ms, 70MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/

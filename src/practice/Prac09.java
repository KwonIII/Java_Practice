package practice;
//연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//12 ⊕ 3 = 123
//3 ⊕ 12 = 312
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
public class Prac09 {

	public static void main(String[] args) {
		 Solution2 solution = new Solution2();
	        
	        // Test cases
	        int a = 123;
	        int b = 456;
	        int result = solution.solution(a, b);
	        System.out.println("Result: " + result);
	        
	        a = 9876;
	        b = 54321;
	        result = solution.solution(a, b);
	        System.out.println("Result: " + result);
	}

}

class Solution2 {
    public int solution(int a, int b) {
        int answer1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int answer2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        if (answer1 > answer2) {
            return answer1;
        } else if (answer1 == answer2) {
            return answer1;
        } else {
            return answer2;
        }
    }
}
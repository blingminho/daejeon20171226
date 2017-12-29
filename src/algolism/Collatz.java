package algolism;
/**
 * 프로그래머스 레벨2 콜라츠 추측
 * @author SangJun
 *
 */
class Collatz {
	public int collatz(int num) {
		int answer = 0;
		int count = 0;
		
		while(count<500) {
			if(num == 1) {
				break;
			}
			if(num % 2 == 0) {// 짝수인 경우
				num = num / 2;
			}
			else if(num % 2 == 1) {// 홀수인 경우
				num = (num*3) + 1;
			}
			++count;
		}
		if(count < 500) {
			answer = count;
		}
		else {
			answer = -1;
		}
		
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 939497;
		//int ex = 6;
		System.out.println(c.collatz(ex));
	}
}

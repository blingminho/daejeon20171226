package algolism;
/**
 * 프로그래머스 2레벨 정수 내림차순으로 배치하기
 * @author SangJun
 *
 */
public class ReverseInt {
	public int reverseInt(int n){
		int count = 0;
		int tmp = n;
		while( tmp > 0 ) {
			tmp /= 10;
			count++;
		}
		
		int[] iArray = new int[count];
		
		for(int i = 0; i < count; i++) {
			iArray[i] = n%10;
			n /= 10;
		}
		
		int tmp2 = 0;
		for(int i = 0; i < count-1; i++) {
			for(int j = i + 1; j < count; j++) {
				if(iArray[i] < iArray[j]) {
					tmp2 = iArray[i];
					iArray[i] = iArray[j];
					iArray[j] = tmp2;
				}
			}
		}
		
		int result = iArray[0];
		for(int i = 1; i < count; i++) {
			result = result*10 + iArray[i];
		}
		
		
		return result;
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(423));
	}
}
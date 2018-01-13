package algolism_learning;
/**
 * 선택정렬 오름차순 및 내림차순 구현 
 * 최선/최악의 경우 수행시간 : 세타(n^2)
 * 최선/최악의 경우 공간 : 세타(n)
 * input : n개
 * n개 -> n-1번
 * n-1개 -> n-2번
 * ...
 * 2개 -> 1번
 * 그러므로 input이 n개인 경우
 * n-1 + n-2 + ... + 1 = n(n-1)/2
 * 총 n(n-1)/2 번 수행 => 최선 및 최악의 수행시간 O(n^2) : 최선과 최악이 같은 이유는 input갯수에 상관없이 다 일정하게 수행하기 때문이다
 * 공간의 경우 : 배열 하나만 계속 사용하므로 n
 * 빅오표기 O(n^2) : C >= 1/2, n0 >= 2 인 경우 모든 f(n)이 Cg(n)보다 아래에 있다.
 * @author SangJun
 *
 */
public class SelectionSorting {
	public static void main(String[] args) {
		int[] input = { 2, 4, 1, 5, 3};
		int maxTmp = 0;
		int minTmp = 0;
		int minKey = 0;
		int maxKey = 0;
		int count = 0;
		int inputLength = input.length;// 5
		System.out.println("inputLength : "+ inputLength);
		
		//오름차순 (1, 2, 3, 4, 5)
		for(int i = 0; i < inputLength - 1; i++){
			minKey = i;
			for(int j = i + 1; j < inputLength; j++){
				if(input[minKey] >= input[j]){
					minKey = j;
				}
				++count;
			}
			minTmp = input[minKey];
			input[minKey] = input[i];
			input[i] = minTmp;
		}
		for(int i = 0; i < inputLength; i++){
			System.out.println("input["+ i +"] : " + input[i]);
		}
		System.out.println("count : " + count);// 10// 4 + 3 + 2 + 1
		
		
		count = 0;
		//내림차순 (5, 4, 3, 2, 1)
		for(int i = 0; i < inputLength-1; i++){
			maxKey = i;
			for(int j = i + 1; j < inputLength; j++){
				if(input[maxKey] <= input[j]){
					maxKey = j;
				}
				++count;
			}
			maxTmp = input[maxKey];
			input[maxKey] = input[i];
			input[i] = maxTmp;
		}
		for(int i = 0; i < inputLength; i++){
			System.out.println("input["+ i +"] : " + input[i]);
		}
		System.out.println("count : " + count);// 10// 4 + 3 + 2 + 1
	}

}

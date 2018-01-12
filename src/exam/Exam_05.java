package exam;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 자바의 정석 - 5장 풀이완료
 * @author SangJun
 *
 */
public class Exam_05 {
	public static void main(String[] args) {
		/*
		5-1
		a. int[] arr[];
		b. int[] arr = {1,2,3,};
		c. int[] arr = new int[5];
		d. int[] arr = new int[5]{1,2,3,4,5};
		e. int arr[5];
		f. int[] arr[] = new int[3][];
		
		정답 :
		d, e
		풀이 :
		d. int[] arr = new int[5]; 또는 int[] arr = {1,2,3,4,5};
		e. int arr[] 로 선언 가능하나 int arr[5]는 불가하다.
		만약 5개의 방을 가진 int형 배열을 초기화 하려면
		int[] arr = new int[5]; 이다.
		*/
		
		/*
		5-2
		정답 :
		2
		풀이 :
		arr[3].length는 3번행의 길이를 구하는 것이다.(0번행부터 시작)
		*/
		int[][] arra = new int[4][];
		arra[0] = new int[5];
		arra[1] = new int[3];
		arra[2] = new int[4];
		arra[3] = new int[2];
		
		for(int i = 0; i < arra.length; i++){
			for(int j = 0; j < arra[i].length; j++){
				arra[i][j] = 5<<i;
			}
		}
		System.out.println(Arrays.toString(arra[0]));
		System.out.println(Arrays.toString(arra[1]));
		System.out.println(Arrays.toString(arra[2]));
		System.out.println(Arrays.toString(arra[3]));
		/*
		5-3
		정답 :
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		풀이 :
		반복문을 이용하여 각 행을 골라서 sum에 누적시켜서 더한다.
		*/
		
		/*
		5-4
		정답 :
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				total += arr[i][j];
			}
		}
		average = (float)total/count;
		풀이 :
		각 자리의 합을 구하기 위해 행에 들어가 열을 빼올수있도록 2중 for문을 사용한다
		총 몇개의 항목이 있는지 알기 위해 각 항목에 접근할때마다 카운트한다
		평균은 총합/총항목수 이기 때문에 총합을 카운트로 나눈다.
		*/
		int[][] arr = {
			{ 5, 5, 5, 5, 5},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
		};
		int total = 0;
		float average = 0;
		
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				total += arr[i][j];
				count++;
			}
		}
		average = (float)total/count;
		System.out.println("total="+total);
		System.out.println("average="+average);
		
		/*
		5-5
		정답 :
		(1)
		tmp = ballArr[i];
		ballArr[i] = ballArr[j];
		ballArr[j] = tmp;
		
		(2)
		for(int i = 0; i < ball3.length; i++){
			ball3[i] = ballArr[i];
		}
		
		풀이 :
		임의의 정수인 j를 이용하여 i번째의 배열과 바꾼다
		tmp를 이용하여 둘의 값을 바꾼다
		
		출력을 하기위해 ball3의 길이만큼 반복하며 ballArr의 앞의 3가지를
		ball3에 대입한다
		*/
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		for(int i = 0; i < ball3.length; i++){
			ball3[i] = ballArr[i];
		}
		
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
		
		/*
		5-6
		정답 :
		System.out.println(coinUnit[i] + "원: " + money/coinUnit[i]);
		money %= coinUnit[i];
		
		풀이 :
		나눈 몫만큼 출력 후
		money = money % 코인가격;
		*/
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit2 = {500, 100, 50, 10};
		int money2 = 2680;
		System.out.println("money="+money2);
		for(int i=0;i<coinUnit2.length;i++) {
			System.out.println(coinUnit2[i] + "원: " + money2/coinUnit2[i]);
			money2 %= coinUnit2[i];
		}
		
		/*
		5-7
		정답 :
		coinNum = money/coinUnit[i];
		if(coinNum > 5){
			coinNum = 5;
			coin[i] = 0;
		}else{
			coin[i] -= coinNum;				
		}
		money -= coinNum*coinUnit[i];
			
		풀이 :
		코인의 갯수는 돈을 코인유닛의 크기 만큼 나눈 몫이다
		그리고 필요한 코인의 갯수가 5개보다 많은경우
		코인의 갯수는 최대값인 5로 초기화하고
		해당 단위별 동전의 갯수를 0으로 초기화 한다.
		
		만약 필요한 코인의 갯수가 5개 이내일경우
		코인의 갯수는 필요한 코인의 갯수만큼 빼준다.
		
		그리고 가진 돈에서 해당 코인의 갯수 * 해당 코인의 단위를 빼준다.
		*/

		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
			}
		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money = Integer.parseInt(args[0]);
		System.out.println("money="+money);
		int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
		int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
		for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
		/* (1) 아래의 로직에 맞게 코드를 작성하시오.
		1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
		2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
		(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
		3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
		*/
			
			coinNum = money/coinUnit[i];
			if(coinNum > 5){
				coinNum = 5;
				coin[i] = 0;
			}else{
				coin[i] -= coinNum;				
			}
			money -= coinNum*coinUnit[i];
			
			System.out.println(coinUnit[i]+"원: "+coinNum);
		}
		
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
		}
		
		System.out.println("=남은 동전의 개수 =");
		
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원:"+coin[i]);
		}
		
		/*
		5-8
		정답 :
		(1)
		switch(answer[i]){
			case 1 :
				counter[0]++;
				break;
			case 2 :
				counter[1]++;
				break;
			case 3 :
				counter[2]++;
				break;					
			case 4 :
				counter[3]++;
				break;
		}
		
		(2)
		System.out.print(counter[i]);
		for(int j=0; j < counter[i]; j++){
			System.out.print("*");
		}
		
		풀이 :
		answer배열의 각 항목의 숫자를 가져와서 switch문을 이용하여 분류한다
		각 case를 만들고 해당 case의 번호에 맞게 를 counter[번호+1]에 1씩 더해준다
		
		counter배열의 각 방의 수만큼 *을 프린트한다
		
		*/
		
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		for(int i=0; i < answer.length;i++) {
			switch(answer[i]){
				case 1 :
					counter[0]++;
					break;
				case 2 :
					counter[1]++;
					break;
				case 3 :
					counter[2]++;
					break;					
				case 4 :
					counter[3]++;
					break;
			}
		}
		for(int i=0; i < counter.length;i++) {
			System.out.print(counter[i]);
			for(int j=0; j < counter[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		5-9
		정답 :
		result[j][3-i] = star[i][j];
		
		풀이 :
		star	result
		00	03
		01	13
		02	23
		03	33
		04	43
		
		10	02
		11	12
		12	22
		13	32
		14	42
		ij	j?
		? = 3 - i;
		
		
		
		*/
		System.out.println("====5-9=====");
		char[][] star = {
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*','*','*','*'},
			{'*','*','*','*','*'}
		};
		char[][] result = new char[star[0].length][star.length];
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i < star.length;i++) {// 5
			for(int j=0; j < star[i].length;j++) {// 4
				result[j][3-i] = star[i][j];
			}
		}
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
		/*
		5-10
		정답 :
		if('0' <= ch && ch <= '9'){
			result1 += numCode[ch - '0'];
		} else{
			result1 += abcCode[ch - 'a'];
		}
		
		풀이 :
		문자는 숫자인 경우와 알파벳 소문자인 경우 두가지로 나뉜다
		먼저 if문을 통해 두가지로 나눈다
		숫자인 경우 해당 숫자 - '0' 을 해줄경우 0에서 해당 수까지의 거리가 나온다
		그건 곧 numCode의 자리수가 된다
		그래서 numCode[해당 자리수]를 result에 누적하여 더한다.
		*/
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abc123";
		String result1 = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			if('0' <= ch && ch <= '9'){
				result1 += numCode[ch - '0'];
			} else{
				result1 += abcCode[ch - 'a'];
			}
		}
		System.out.println("src:"+src);
		System.out.println("result:"+result1);
		
		/*
		5-11
		정답 :
		result2[i][j] += score[i][j];
		result2[i][score[i].length] += score[i][j];
		result2[score.length][j] += score[i][j];
		result2[score.length][score[i].length] += score[i][j];
		
		풀이 :
		
		
		
		
		*/
		int[][] score = {
			{100, 100, 100}
			, {20, 20, 20}
			, {30, 30, 30}
			, {40, 40, 40}
			, {50, 50, 50}
		};
		int[][] result2 = new int[score.length+1][score[0].length+1];
		for(int i=0; i < score.length;i++) {
			for(int j=0; j < score[i].length;j++) {
				result2[i][j] += score[i][j];
				result2[i][score[i].length] += score[i][j];
				result2[score.length][j] += score[i][j];
				result2[score.length][score[i].length] += score[i][j];
			}
		}
		for(int i=0; i < result2.length;i++) {
			for(int j=0; j < result2[i].length;j++) {
				System.out.printf("%4d",result2[i][j]);
			}
			System.out.println();
		}
		
		/*
		5-13
		정답 :
		
		
		
		
		
		풀이 :
		
		
		
		
		*/
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<words.length;i++) {
			char[] question = words[i].toCharArray(); // String을 char[]로 변환
			for(int j = 0; j<words[i].length(); j++){
				int replaceIndex = (int)(Math.random()*words[i].length());
				char tmp;
				tmp = question[j];
				question[j] = question[replaceIndex];
				question[replaceIndex] = tmp;
			}
			
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));
			String answer2 = scanner.nextLine();
			// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			if(words[i].equals(answer2.trim()))
				System.out.printf("맞았습니다.%n%n");
			else
				System.out.printf("틀렸습니다.%n%n");
		}
	}
}

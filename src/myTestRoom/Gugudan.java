package myTestRoom;
/**
 * 구구단 출력
 * @author SangJun
 *
 */
public class Gugudan {
	public static void main(String[] args) {
		/*
		형태 1)
		2*1=1
		2*2=2
		...
		1*9=9
		
		2*1=2
		2*2=4
		...
		
		9*9=81
		*/
		/*
		for(int i = 2; i < 10; i++){// "i는 앞숫자" 2~9
			for(int j = 1; j < 10; j++){// "j는 뒷숫자" 1~10
				System.out.println(i + "*"+ j +"=" + i*j);
			}
			System.out.println();
		}
		*/

		/*
		형태 2-1)
		1*1=1	2*1=2	3*1=3
		1*2=2	2*2=4	3*2=6
		...
		1*9=9	2*9=18	3*9=27
		
		4*1=2	5*1=5	6*1=6
		4*2=8	5*2=10	6*2=15
		...
		7*9=6	8*9=72	9*9=81
		*/
		// 3중 for문
		/*
		for(int k = 1; k < 10 ; k+=3){
			for(int j = 1; j < 10; j++){
				for(int i = k; i < k+3; i++){
					System.out.print(i + "*" + j + "=" + i*j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		*/
		
		// 2중 for문
		/*
		for(int j = 1, k = 0, count = 0; j < 10; j++){// "j는 뒷숫자", "k는 앞숫자에 더해주는 수", "count는 뭉치 수"
			for(int i = 1 + k; i < 4 + k; i++){// "i는 앞숫자"
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			
			System.out.println();
			if(j == 9){// "뒷숫자(j)가 9"가 되었을때
				k += 3;// 앞숫자에 더해주는 수(k)에 3씩 더해서 1 -> 4 -> 7 단으로 바꾸어준다
				j = 0;// j를 0으로 초기화 하여 제일 바깥반복문을 다시 돌린다
				System.out.println();// 뭉치를 나누기 위해 쓰이는 줄내림
				count++;// 뭉치 수를 증가시켜 세어준다
				
				if(count == 3){// 뭉치가 3개가 되었을때 반복문을 종료시킨다.
					break;
				}
			}
		}
		*/
		
		
		/*
		형태 2-2) 
		2*1=2	3*1=3	4*1=4
		2*2=4	3*2=6	4*2=8
		...
		2*9=18	3*9=27	4*9=36
		
		5*1=5	6*1=6	7*1=7
		5*2=10	6*2=12	7*2=14
		...
		8*9=72	9*9=81
		*/
		// 2중 for문
		for(int j = 1, k = 0, count = 0; j < 10; j++){
			for(int i = 2+k; i < 5+k; i++){
				if(i == 10){// 10단을 출력안함
					break;
				}
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			
			System.out.println();
			if(j == 9){
				k += 3;
				j = 0;
				count++;
				System.out.println();
				
				if(count == 3){
					break;
				}
			}
		}

		
	}
}

package myTestRoom;

public class Console {// 내부가 40 * 40
	public static void main(String[] args) {
		String[] arr = {"1.로그인", "2.회원가입", "3.회원가", "4.악", "5.악아", "6.아이디를  입력하세요"};
		print(arr);
	}
	
	// 배열은 무조건 "1. 문자열" 식으로 입력필요
	static int print(String[] arr){// 배열안에 있는 문자열을 출력// scan은 다음에서하기
		int select = 0;// 선택한 것(반환값)
		int bangNumber = 0;// 배열 방번호
		int rowSize = 8;// 세로칸 수
		int colSize = 40;// 가로칸 수
		int maxStringLength = 0;// 제일 긴 문자열의 길이
		int spacebarCount = 0;// 공백 카운트 하는 변수

		// 제일 긴 문자열의 길이를 받음
		for(int i = 0; i < arr.length; i++){
			if(maxStringLength < arr[i].length()){
				maxStringLength = arr[i].length();
			}	
		}
		
		
		
		
		System.out.println("┌────────────────────────────────────────┐");// 40개 + 1개 + 1개
		for(int i = 0; i < rowSize; i++){// 세로 rowSize줄
			boolean flag = true;// 배열에 있는 모든 String값을 다 쓴 경우 flag는 false가 되어서 가로 반복문을 안함
			String inline = null;// 해당 배열의 String값을 받아주는 변수
			int inlineLength = 0;// inline변수의 길이를 받아주는 변수
			
			
			// bangNumber가 초과되지 않게 함
			if(bangNumber < arr.length){
				inline = arr[bangNumber];
				inlineLength = arr[bangNumber].length();
				
				// 해당 문자에 공백이 있는지 체크 후 있으면 오른쪽 공백 더줌
				for(int index = 0; index < inline.length(); index++){
					char c = inline.charAt(index);
					// 공백인 경우 spacebarCount 1증가
					if( c == ' '){
						spacebarCount++;
					}
				}
			}else{
				// 배열의 모든 요소를 사용하였을경우 flag가 false가 됨
				flag = false;
			}
			
			
			// tmp의 내용을 한 줄씩 출력
			String tmp = "";
			tmp += "│";// 왼쪽 끝
			
			for(int j = 0; j < colSize && flag == true; j++){// 가로 40칸
				// 
				if(j == colSize/2 - 16 && bangNumber < arr.length){// 40칸의 중간인 20칸에서 - 16 칸 만큼 한곳에 문자열 출력
					tmp += inline;
				}else if(j > colSize/2 - 16 + (inlineLength-2)*2 + 1 - spacebarCount){// 오른쪽 공백// +1은 공백이 없는경우, 공백이 있으면 -1씩
					tmp += " ";
				}else if(j < colSize/2 - 16){// 왼쪽 공백 완성
					tmp += " ";
				}
			}
			
			// 방넘버가 길이보다 작을 경우 방넘버를 증가시킴
			if(bangNumber < arr.length){
				bangNumber++;
			}else{// 출력할 문자열이 없는경우 오른쪽에 공백으로 채움
				for(int k = 0; k < colSize; k++){
					tmp += " ";
				}
			}
			tmp += "│";// 오른쪽 끝
			
			System.out.println(tmp);
		}
		System.out.println("└────────────────────────────────────────┘");// 40개 + 1개 + 1개

		return select;
	}
}

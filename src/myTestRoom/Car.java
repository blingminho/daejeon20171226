package myTestRoom;
// 배송취소를 할 수도 있으니 고민해보자..
public class Car {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < 65; i++){
			
			System.out.println("\n\n                              배 ~ 송 ~ 중 ~~\n");
			
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			System.out.println("∞");
			
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			System.out.println(" ∞     __");
			
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			System.out.println("  ∞  ┌┘ □└─┐");
			
			for(int j = 0; j < i; j++){
				System.out.print(" ");
				
			}
			System.out.println("   ∞=└o──o─┘");
			System.out.println("  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println("  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.print("────────────────────────────────────────────────────────────────────────────────");// ─ : 80 개
			Thread.sleep(100);
		}
		
	}
}

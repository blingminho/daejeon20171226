package algolism_learning;
/**
 * 단일 연결 리스트를 테스트 하기 위한 main문
 * ListNode class생성 후 사용
 * @author SangJun
 *
 */
public class ListNode_main {

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);// 머리노드
		ListNode listNode2 = new ListNode(2);// 2번째 노드
		ListNode listNode3 = new ListNode(3);// 3번째 노드
		
		listNode.setNext(listNode2);
		listNode2.setNext(listNode3);
		listNode.getNext();
		
		int tmp = listNode.getData();
		int listLength = ListNode.getListLength(listNode);
		System.out.println("리스트길이 : " + ListNode.getListLength(listNode));
		System.out.println("리스트길이 : " + ListNode.getListLength(listNode2));
		System.out.println("리스트길이 : " + ListNode.getListLength(listNode3));
		
		
		
		System.out.println("해당 리스트 노드의 데이터 : " + tmp);
		
		
	}

}

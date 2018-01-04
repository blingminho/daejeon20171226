package algolism_learning;
/**
 * 단일 연결 리스트 55p
 * 다음 노드를 가리키는 다음 포인터를 가진 노드들의 집합으로 이루어진다
 * 마지막 노드는 null을 가리켜 리스트의 마지막임을 나타낸다.
 * 
 * 
 * public ListNode(int data) 
 * |public void setData(int data) 
 * |public int getData() 
 * |public void setNext(ListNode next) 
 * |public ListNode getNext() 
 * |public static int getListLength(ListNode headNode) 
 * @param int data, ListNode next
 * @author SangJun
 *
 */
public class ListNode {
	private int data;
	private ListNode next;
	/**
	 * 생성자
	 * @param data
	 */
	public ListNode(int data) {// 생성자
		this.data = data;
	}
	/**
	 * 해당 노드의 데이터를 저장해줌
	 * @param int data
	 */
	public void setData(int data) {// set메서드
		this.data = data;
	}
	/**
	 * 해당 노드의 데이터를 받아옴
	 * @return int data
	 */
	public int getData() {// get메서드
		return data;
	}
	/**
	 * 해당 노드의 다음 노드를 정함
	 * @param ListNode next
	 */
	public void setNext(ListNode next) {// set메서드
		this.next = next;
	}
	/**
	 * 해당 노드의 다음 노드를 받아옴
	 * @return ListNode next
	 */
	public ListNode getNext() {// get메서드
		return this.next;
	}
	/**
	 * 해당 헤드노드로 부터 끝 노드까지의 길이를 int형으로 return
	 * @param ListNode headNode
	 * @return int Length
	 */
	public static int getListLength(ListNode headNode) {
		int length = 0;
		ListNode currentNode = headNode;
		while(currentNode != null) {
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
}

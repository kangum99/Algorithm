package algorithm;

public class Leet141_LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * public boolean hasCycle(ListNode head) { if(head == null || head.next ==
	 * null) return false; ListNode sp = head; ListNode fp = head;
	 * 
	 * while(fp != null) { fp = fp.next != null ? fp.next.next : null; sp = sp.next;
	 * if(fp == sp) return true; }
	 * 
	 * return false;
	 */

	// 해쉬set사용
	/*
	 * Set<ListNode> nodesSeen = new HashSet<>(); while (head != null) { if
	 * (nodesSeen.contains(head)) { return true; } else { nodesSeen.add(head); }
	 * head = head.next; } return false;
	 */

}

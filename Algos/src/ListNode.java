
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public static ListNode rotateRight(ListNode head, int k) {
        //Calculate size
        int size = 1;
        ListNode ptr = head;
        if (ptr != null) {
            while (ptr.next != null) {
                size++;
                ptr = ptr.next;
            }
        } else {
            return null;
        }
        if (k==0 || size==1){
            return head;
        }
        k = k % size;
        k = size - k - 1;
        while (k-- >= 0) {
            //remove first
            ListNode x = head;
            head = head.next;
            x.next = null;
            ptr.next = x;
            ptr = x;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode x = new ListNode(1);
        x.next = new ListNode(2);
        x.next.next = new ListNode(3);
        x.next.next.next = new ListNode(4);
        x.next.next.next.next = new ListNode(5);
//        x.next.next.next.next.next = new ListNode(9);
//        x.next.next.next.next.next.next = new ListNode(9);
        System.out.println("Orignal List are : ");
        printList(x);
        x = rotateRight(x, 3);
        printList(x);
    }

    private static void printList(ListNode x) {
        ListNode temp = x;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
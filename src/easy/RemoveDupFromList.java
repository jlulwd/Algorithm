package easy;

/**
 * @Author someone
 * @Classname RemoveDupFromList
 * @Description This Class is for excise
 * @Date 2020/6/2 下午12:22
 * @Created by someone
 * @Version 1.0
 */
public class RemoveDupFromList {

    public static ListNode deleteDuplicates(ListNode head)  {
        if (head == null||head.next==null) {
            return head;
        }
        ListNode curr=head;
        while (curr.next!=null) {
            if (curr.next.val==curr.val) {
                curr.next=curr.next.next;
            } else {
                curr=curr.next;
            }
        }
        return head;
    }
    public static void printListNode(ListNode head)  {
            while(head!=null) {
                System.out.println(head.val);
                head=head.next;
            }
    }
    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(1);
        ListNode node3=new ListNode(2);
        ListNode node4=new ListNode(5);
        ListNode node5=new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        ListNode head1=node1;
        printListNode(head1);
        ListNode head2=deleteDuplicates(head1);
        System.out.println("清理后:");
        printListNode(head2);

    }
}

class ListNode {
    ListNode next;
    int val;
    ListNode(int val) {
        this.val = val;
    }
}
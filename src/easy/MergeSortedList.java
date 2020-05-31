package easy;

/**
 * @Author someone
 * @Classname MergeSortedList
 * @Description This Class is for excise
 * @Date 2020/5/29 下午10:23
 * @Created by someone
 * @Version 1.0
 */
public class MergeSortedList {
    public static Node mergeTwoLists2(Node l1, Node l2) {
        Node head = new Node(0);
        Node temp = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        temp.next = l1 != null ? l1 : l2;
        return head.next;
    }

    public static void main(String[] args) {
        Node temp1=new Node(0);
        Node head1= temp1;
        for (int i = 3; i < 8; i+=2) {
            temp1.next=new Node(i);
            temp1=temp1.next;
        }
        System.out.println("l1:");
        printList(head1);

        Node temp2= new Node(1);
        Node head2= temp2;
        for (int i = 2; i < 8; i+=2) {
            temp2.next=new Node(i);
            temp2=temp2.next;
        }
        System.out.println("l2");
        printList(head2);

        System.out.println("合并排序后：");
        printList(mergeTwoLists2(head1, head2));

    }

    public static void printList(Node head)  {
        while(head!=null) {
            System.out.println(head.val);
            head=head.next;
        }
    }
}

class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
    }

}

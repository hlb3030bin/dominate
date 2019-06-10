package avengers.hulk.data.structure.LinkedList;

/**
 * @description: TODO 单链表
 * @author: huanglb
 * @date 2019/6/10 14:03
 */
public class SingleNode {
    public int data;
    public SingleNode next;

    public SingleNode head = null;

    public SingleNode(int data) {
        this.data = data;
    }

    public void addNode(SingleNode node) {
        SingleNode newNode = new SingleNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        SingleNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }


    public boolean removeNode(int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        if (index == 1) {//删除头结点
            head = head.next;
            return true;
        }
        SingleNode preNode = head;
        SingleNode curNode = preNode.next;
        int i = 1;
        while (curNode != null) {
            if (i == index) {//寻找到待删除结点
                preNode.next = curNode.next;//待删除结点的前结点指向待删除结点的后结点
                return true;
            }
            //当先结点和前结点同时向后移
            preNode = preNode.next;
            curNode = curNode.next;
            i++;
        }
        return true;
    }

    public int length() {
        int length = 0;
        SingleNode curNode = head;
        while (curNode != null) {
            length++;
            curNode = curNode.next;
        }
        return length;
    }

    public  SingleNode reverseList(SingleNode head) {
        if (head == null || head.next == null) return head;
        SingleNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public  void fori(SingleNode head) {
        SingleNode temp =head;
        while (temp.next != null) {
            System.out.println("data:" + temp.data);
            temp = temp.next;
        }
    }
}

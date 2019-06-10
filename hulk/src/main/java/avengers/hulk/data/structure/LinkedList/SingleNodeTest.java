package avengers.hulk.data.structure.LinkedList;

import java.util.LinkedList;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/10 15:01
 */
public class SingleNodeTest {
    public static void main(String[] args) {

        SingleNode dd = new SingleNode(5);
        for (int i = 0; i < 100; i++) {
            dd.addNode(new SingleNode(i));
            System.out.println("length:" + dd.length());
        }

        dd.removeNode(80);
        SingleNode temp = dd;
        System.out.println("沒有反轉");
        temp.fori(temp.head);
        SingleNode temp1 = dd.reverseList(dd.head);
        System.out.println("已經反轉");
        temp1.fori(temp1);
    }


}

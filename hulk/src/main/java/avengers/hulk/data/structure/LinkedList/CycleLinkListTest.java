package avengers.hulk.data.structure.LinkedList;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/10 15:04
 */
public class CycleLinkListTest {
        public static void main(String[] args) throws Exception {
        CycleLinkList list = new CycleLinkList();
        for (int i = 0; i < 10; i++) {
            // 0-99之间的整数
            int temp = (int) (Math.random() * 100);
            list.insert(i, temp);
            System.out.print(temp + " ");
        }

        list.delete(4);
        System.out.println();
        System.out.println("----删除第五个元素之后------");
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}

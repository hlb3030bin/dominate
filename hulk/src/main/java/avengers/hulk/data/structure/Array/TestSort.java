package avengers.hulk.data.structure.Array;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/15 14:22
 */

public class TestSort {
    public static void main(String[] args) {

        int max=10000;
        AbstractArraySort busort=new BubbleSortImpl(max), selection=new SelectionSortImpl(max),insterion=new InsertionSortImpl(max);

        List<IArraySort> listsort= new LinkedList();
        listsort.add(busort);
        listsort.add(selection);
        listsort.add(insterion);

        for (int i = 1; i <=max; i++) {
            Random random=new Random(i);
            int raint=random.nextInt(max);
            for (IArraySort inster : listsort) {
                ((AbstractArraySort)inster).insert(raint);
            }
        }

        for (IArraySort sort : listsort) {
            long startTime = System.currentTimeMillis();    //获取开始时间
            sort.sort();
            long endTime = System.currentTimeMillis();    //获取结束时间

            System.out.println("排序时间>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + (endTime - startTime) + "ms");
            //((AbstractArraySort)sort).display();
            System.out.println(sort.getClass().getName()+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        }
    }
}

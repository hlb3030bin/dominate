package avengers.hulk.data.structure.Array;

/**
 * @description: TODO 插入排序
 * @author: huanglb
 * @date 2019/6/15 15:11
 */
public class InsertionSortImpl extends AbstractArraySort {
    /**
     * @param max
     */
    public InsertionSortImpl(int max) {
        super(max);
    }

    @Override
    public void sort() {

        int in,out;
        for (out=1;out<nElems;out++){
            long temp=a[out];
//            in=out-1;
//            while (in>=0&&a[in]>temp){
//                a[in+1]=a[in];
//                super.addCount();
//                --in;
//            }

            for (in = out - 1; in >= 0 && a[in] > temp; in--) {
                // 将大于temp的往后移动一位
                a[in + 1] = a[in];
                super.addCount();
            }

            a[in+1]=temp;
        }
        super.printCount();
    }
}

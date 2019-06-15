package avengers.hulk.data.structure.Array;

/**
 * @description: TODO  选择排序
 * @author: huanglb
 * @date 2019/6/15 14:03
 */
public class SelectionSortImpl extends AbstractArraySort{
    /**
     * @param max
     */
    public SelectionSortImpl(int max) {
        super(max);
    }

    @Override
    public void sort() {
        int out,in,min;
        for (out=0;out<super.nElems;out++){

            min=out;

            for (in = out+1; in<nElems ; in++) {
                if (a[in]<a[min]){
                    min=in;
                }
                super.addCount();
            }
            super.swap(out,min);

        }
        super.printCount();
    }
}

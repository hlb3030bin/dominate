package avengers.hulk.data.mesort;


/**
 * @description: TODO  冒泡排序
 * @author: huanglb
 * @date 2019/6/15 13:48
 */
public class BubbleSortImpl extends AbstractArraySort {


    /**
     * @param max
     */
    public BubbleSortImpl(int max) {
        super(max);
    }

    @Override
    public void sort() {
        int out,in;
        for (out=super.nElems-1;out>1;out--){
            for (in=0;in<out;in++){
                if(a[in]>a[in+1]){
                    super.swap(in,in+1);
                }
                addCount();
            }
        }
        super.printCount();
    }


}

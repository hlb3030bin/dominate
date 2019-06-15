package avengers.hulk.data.structure.Array;

import javax.sound.midi.Soundbank;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/15 13:41
 */
public abstract class AbstractArraySort implements IArraySort {

    protected long[] a;
    protected int nElems;
    private   long count=0;


    protected void  printCount(){
        System.out.println("排序次数："+count);
    }
    protected void  addCount(){
        count++;
    }
    /**
     *
     * @param max
     */
    public AbstractArraySort(int max){
        a=new long[max];
        nElems=0;
    }

    public void  insert(long value){
        a[nElems]=value;
        nElems++;
    }
    public void display(){
        for (int i = 0; i < nElems ; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }


    protected void swap(int one, int two) {
        long temp=a[one];
        a[one]=a[two];
        a[two]=temp;

    }

}

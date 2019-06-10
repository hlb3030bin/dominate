package avengers.hulk.data.structure.Queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/10 16:51
 */
public class ArrayQueue<T>  {
    private T [] data ;
    private int cnt;//元素个数
    private int size;//队列长度

    @SuppressWarnings("unchecked")
    public ArrayQueue(){
        data =(T[]) new Object [10];
        cnt = 0;
        size = 10;
    }
    @SuppressWarnings("unchecked")
    public ArrayQueue(int size){
        data =(T[]) new Object [size];
        cnt = 0;
        this.size = size;
    }

    public void add(T t){
        if(cnt>=size){
            throw new IllegalStateException();
        }
        data[cnt]=t;
        cnt++;
    }

    public T remove(){
        if(cnt<0){
            throw new NoSuchElementException();
        }
        T t= data[0];
        data = Arrays.copyOfRange(data,0,size);
        cnt--;
        return t;

    }
    public boolean offer(T t){
        if(cnt>=size){
            return false;
        }
        data[cnt]=t;
        cnt++;
        return true;
    }
    public boolean pull(T t){
        if(cnt<0){
            return false;
        }
        data = Arrays.copyOfRange(data,0,size);
        cnt--;
        return true;
    }
    //返回队列头元素
    public T element(){
        return data[0];
    }
    public boolean isEmpty(){
        return cnt==0 ;
    }
    public boolean isFull(){
        return cnt==size;
    }
}
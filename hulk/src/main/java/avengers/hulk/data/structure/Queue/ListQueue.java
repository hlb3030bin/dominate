package avengers.hulk.data.structure.Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/10 16:55
 */
public class ListQueue<T> {
    private List<T> data ;
    private int cnt;//元素个数

    private int size;//队列长度(用链表的话这里可以强行定义)

    public ListQueue(){
        data =new LinkedList<T>();
        cnt = 0;
        size = 10;
    }

    public void add(T t){
        data.add(t);
        cnt++;
    }

    public T remove(){
        if(cnt<0){
            throw new NoSuchElementException();
        }
        T t= data.remove(cnt);
        cnt--;
        return t;

    }

    public boolean offer(T t){
        if(cnt>=size){
            return false;
        }
        data.add(t);
        cnt++;
        return true;
    }

    public boolean pull(T t){
        if(cnt<0){
            return false;
        }
        data.remove(cnt);
        cnt--;
        return true;
    }
    //返回队列头元素
    public T element(){
        return data.get(0);
    }

    public boolean isEmpty(){
        return cnt==0 ;
    }
    public boolean isFull(){
        return cnt==size;
    }
}
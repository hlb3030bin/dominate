package avengers.hulk.data.structure.Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/10 16:48
 */
public class ListStack<T> {
    private List<T> data;
    private int cnt;

    public ListStack(){
        data= new LinkedList<T>();
        cnt = 0;
    }

    public void push(T t){
        data.add(t);
        cnt++;
    }
    public T peek(){
        if (cnt==0) {
            throw new EmptyStackException();
        }
        return data.get(cnt);
    }
    public T pop(){
        if (cnt==0) {
            throw new EmptyStackException();
        }
        T t=data.remove(cnt);
        cnt--;
        return t;
    }
    public int search(T t){
        for(int i=cnt;i>0;i--){
            if(data.get(i)==t)
                return i;
        }
        return -1;
    }
    public boolean isEmpty(){
        return cnt==0;
    }
}
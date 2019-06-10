package avengers.hulk.data.structure.Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/10 16:45
 */
public class ArrayStack<T> {
    private T [] data;
    private int size;
    private int cnt;

    @SuppressWarnings("unchecked")
    public ArrayStack(){
        data= (T[]) new Object [10];
        cnt = 0;
        size =10;
    }

    public void push(T t){
        if(cnt>=size){
            data= Arrays.copyOf(data, data.length*2);
            size*=2;
        }
        data[size] = t;
        cnt++;
    }
    public T peek(){
        if (cnt==0) {
            throw new EmptyStackException();
        }
        return data[cnt];
    }
    public T pop(){
        if (cnt==0) {
            throw new EmptyStackException();
        }
        cnt--;
        return data[cnt];
    }
    public int search(T t){
        for(int i=cnt;i>0;i--){
            if(data[i]==t)
                return i;
        }
        return -1;
    }
    public boolean isEmpty(){
        return cnt==0;
    }
}
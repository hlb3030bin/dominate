package avengers.hulk.data.structure.Queue;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/10 16:51
 */
public class ArrayQueue<T> {
    private T[] data;
    private int cnt;//元素个数
    private int size;//队列长度

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        data = (T[]) new Object[10];
        cnt = 0;
        size = 10;
    }

    @SuppressWarnings("unchecked")
    public ArrayQueue(int size) {
        data = (T[]) new Object[size];
        cnt = 0;
        this.size = size;
    }

    public void add(T t) {
        if (cnt >= size) {
            throw new IllegalStateException();
        }
        data[cnt] = t;
        cnt++;
    }

    public T remove() {
        if (cnt < 0) {
            throw new NoSuchElementException();
        }
        T t = data[0];
        data = Arrays.copyOfRange(data, 1, size);
        cnt--;
        return t;

    }

    public boolean offer(T t) {
        if (cnt >= size) {
            return false;
        }
        data[cnt] = t;
        cnt++;
        return true;
    }

    //返回队列头元素
    public T element() {
        return data[0];
    }

    public boolean isEmpty() {
        return cnt == 0;
    }

    public boolean isFull() {
        return cnt == size;
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue(10);
        queue.add(10);
        queue.offer(100);
        queue.remove();
        Integer dd = queue.element();
        queue.remove();
        dd = queue.element();
    }
}
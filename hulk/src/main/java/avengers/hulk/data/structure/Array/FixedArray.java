package avengers.hulk.data.structure.Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: TODO 实现一个大小固定的有序数组，支持动态增删改操作
 * @author: huanglb
 * @date 2019/6/6 13:43
 */
public class FixedArray {

    private static final int DEFAULT_SIZE = 10;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final Object[] DEFAULT_ELEMENTDATA = new Object[DEFAULT_SIZE];

    transient Object[] elementData;

    private int size;

    public FixedArray() {
        this.elementData = DEFAULT_ELEMENTDATA;
    }

    public FixedArray(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);

        }
    }

    //保证增和删时数组长度和元素长度一致
    private void ensureCapacityInternal(int minCapacity) {
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    public void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    //数组容量最大的情况
    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }

    //去掉删除之后，重新排序的，空的数组
    public void trimToSize() {
        if (size < elementData.length) {
            elementData = (size == 0)
                    ? EMPTY_ELEMENTDATA
                    : Arrays.copyOf(elementData, size);
        }
    }

    //判断数组长度
    public int size() {
        return size;
    }

    //判断数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //排序
    @SuppressWarnings("unchecked")
    private <E> void sort() {
        Arrays.sort((E[]) elementData, 0, size);
    }

    //添加
    public <E> boolean add(E e) {
        ensureCapacityInternal(size + 1);
        elementData[size++] = e;
        sort();
        return true;
    }

    //删除
    public <E> boolean remove(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();

        System.arraycopy(elementData, index + 1, elementData, index,
                size - 1);
        size--;
        trimToSize();
        return true;
    }

    //改
    public <E> boolean set(int index, Object e) {
        elementData[index] = e;
        sort();
        return true;
    }

    //查
    public Object get(int index) {
        return elementData[index];
    }
}
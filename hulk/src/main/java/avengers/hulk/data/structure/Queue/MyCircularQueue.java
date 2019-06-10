package avengers.hulk.data.structure.Queue;

/**
 * @description: TODO 实现一个循环队列
 * @author: huanglb
 * @date 2019/6/10 16:56
 */
public class MyCircularQueue {
    private final int capacity;
    private final int[] array;
    private int head = 0;
    private int tail = 0;
    private int count = 0;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        this.capacity = k;
        this.array = new int[this.capacity];
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        //队列已满
        if (count == capacity) {
            return false;
        }

        //队列为空, 重新设置头部
        if (count == 0) {
            head = (head == capacity) ? 0 : head;
            tail = head;
            array[head] = value;
            count++;
            return true;
        }

        //队列未满 (有空位)
        if (tail == capacity - 1) {
            //tail 达到 maxIndex, 重置为 0
            tail = 0;
        } else {
            //tail 未达到 maxIndex, tail++
            tail++;
        }
        array[tail] = value;
        count++;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (count == 0) {
            //队列为空
            return false;
        }
        count--;
        head++;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (count == 0 ) {
            return -1;
        }
        return array[head];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (count == 0 ) {
            return -1;
        }
        return array[tail];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return count == capacity;
    }
}
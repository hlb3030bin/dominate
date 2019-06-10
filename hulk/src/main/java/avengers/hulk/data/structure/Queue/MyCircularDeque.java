package avengers.hulk.data.structure.Queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/10 16:59
 */
//Design Circular Deque（设计一个双端队列）
class MyCircularDeque {
    public int k;
    public int[] numbers;
    public int head;
    public int tail;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        numbers=new int[k+1];
        head=0;
        tail=0;
        this.k=k;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(isFull())
            return false;
        else{
            head=(head+k)%(k+1);
            numbers[head]=value;
            return true;
        }
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(isFull())
            return false;
        else{
            numbers[tail]=value;
            tail=(tail+1)%(k+1);
            return true;
        }
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(isEmpty())
            return false;
        else{
            head=(head+1)%(k+1);
            return true;
        }
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(isEmpty())
            return false;
        else{
            tail=(tail+k)%(k+1);
            return true;
        }
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(isEmpty())
            return -1;
        return numbers[head];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(isEmpty())
            return -1;
        return numbers[(tail+k)%(k+1)];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return tail==head;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return (tail+1)%(k+1)==head;
    }
}
//Sliding Window Maximum（滑动窗口最大值）
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==0){
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();//存放窗口内的数字
        int max = Integer.MIN_VALUE;//窗口内的最大数字
        for(int i = 0; i<k;i++){
            if(max<nums[i]){
                max = nums[i];
            }
            list.add(nums[i]);
        }
        int[] res = new int[nums.length - k + 1];//要返回的结果数据
        res[0] = max;
        for(int i = k; i < nums.length;i++){
            int z =list.remove(0);//移走第一位数并插入新的一位数
            list.add(nums[i]);
            if(z!=max){//移走的数不是max，只需判断max与新插入的数哪个大
                if(nums[i]> max){
                    max = nums[i];
                }
                res[i-k+1] = max;
            }else{//移走的数是max，重新判断列表中哪个数是最大的
                if(!list.contains(max)){
                    max = Integer.MIN_VALUE;
                    for(Integer num : list){
                        if(max<num){
                            max = num;
                        }
                    }
                }else{
                    if(nums[i]> max){
                        max = nums[i];
                    }
                }
            }
            res[i-k+1] = max;
        }
        return res;
    }
}
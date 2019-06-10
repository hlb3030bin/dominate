package avengers.hulk.data.structure.Graph;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/10 17:14
 */
//栈
public class StackX {
    private final int SIZE = 20;
    private int [] st;
    private int top;

    public StackX(){
        st = new int[SIZE];
        top=-1;
    }
    public void push(int j){
        st[++top] = j;
    }
    public int pop(){
        return st[top--];
    }
    public int peek(){
        return st[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
}

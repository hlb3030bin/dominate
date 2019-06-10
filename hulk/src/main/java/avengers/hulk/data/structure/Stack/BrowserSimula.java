package avengers.hulk.data.structure.Stack;

import java.util.Stack;

/**
 * @description: TODO  编程模拟实现一个浏览器的前进后退功能
 * @author: huanglb
 * @date 2019/6/10 16:50
 */
public class BrowserSimula {
    public static void main(String[] args) {
        Browser b1=new Browser();
        b1.open();
        b1.open();
        b1.open();
        b1.open();
        System.out.println(b1.backward());
        System.out.println(b1.backward());
        System.out.println(b1.forward());
        System.out.println(b1.forward());
    }
}

class Browser{
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    int cnt;

    Browser(){
        s1=new Stack<Integer>();
        s2=new Stack<Integer>();
        cnt=0;
    }
    /**
     * 点开一个新的链接
     */
    public void open(){
        cnt++;
        s1.push(cnt);
    }
    //后退
    public Integer backward(){
        if(cnt==0)
            throw new ArrayIndexOutOfBoundsException(cnt);
        Integer a =s1.pop();
        s2.push(a);
        return s1.peek();
    }
    //前进
    public Integer forward(){
        if(s2.isEmpty())
            throw new ArrayIndexOutOfBoundsException(cnt);
        Integer a =s2.pop();
        s1.push(a);
        return a;
    }

}
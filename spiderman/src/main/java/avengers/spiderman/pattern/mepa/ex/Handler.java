package avengers.spiderman.pattern.mepa.ex;

import avengers.spiderman.pattern.mepa.Request;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2020/3/20 14:18
 */
//定义一个抽象的handle
public abstract class Handler {
    private Handler nextHandler;  //指向下一个处理者
    private int level;  //处理者能够处理的级别

    public Handler(int level) {
        this.level = level;
    }

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    // 处理请求传递，注意final，子类不可重写
    public final void handleMessage(Request request) {
        if (level == request.getRequstLevel()) {
            this.echo(request);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleMessage(request);
            } else {
                System.out.println("已经到最尽头了");
            }
        }
    }

    // 抽象方法，子类实现
    public abstract void echo(Request request);
}

// 定义一个具体的handleA
class HandleRuleA extends Handler {
    public HandleRuleA(int level) {
        super(level);
    }

    @Override
    public void echo(Request request) {
        System.out.println("我是处理者1,我正在处理A规则");
    }
}

//定义一个具体的handleB
class HandleRuleB extends Handler {
    public HandleRuleB(int level) {
        super(level);
    }

    @Override
    public void echo(Request request) {

    }
}  //...

//客户端实现
class Client {
    public static void main(String[] args) {
        HandleRuleA handleRuleA = new HandleRuleA(1);
        HandleRuleB handleRuleB = new HandleRuleB(2);
        handleRuleA.setNextHandler(handleRuleB);  //这是重点，将handleA和handleB串起来
        handleRuleA.echo(new Request());
    }
}

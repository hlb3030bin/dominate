package avengers.spiderman.pattern.mepa.ex;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2020/3/20 13:51
 */
//定义一个抽象的状态类
public abstract class State {
    StateContext context;
    public void setContext(StateContext context) {
        this.context = context;
    }
    public abstract void handle1();
    public abstract void handle2();
}
//定义状态A
class ConcreteStateA extends State {
    @Override
    public void handle1() {}  //本状态下必须要处理的事情

    @Override
    public void handle2() {
        super.context.setCurrentState(StateContext.contreteStateB);  //切换到状态B
        super.context.handle2();  //执行状态B的任务
    }
}
//定义状态B
class ConcreteStateB extends State {
    @Override
    public void handle2() {}  //本状态下必须要处理的事情，...

    @Override
    public void handle1() {
        super.context.setCurrentState(StateContext.contreteStateA);  //切换到状态A
        super.context.handle1();  //执行状态A的任务
    }
}
//定义一个上下文管理环境
class StateContext {
    public final static ConcreteStateA contreteStateA = new ConcreteStateA();
    public final static ConcreteStateB contreteStateB = new ConcreteStateB();

    private State CurrentState;
    public State getCurrentState() {return CurrentState;}

    public void setCurrentState(State currentState) {
        this.CurrentState = currentState;
        this.CurrentState.setContext(this);
    }

    public void handle1() {this.CurrentState.handle1();}
    public void handle2() {this.CurrentState.handle2();}
}
//定义client执行
class client {
    public static void main(String[] args) {
        StateContext context = new StateContext();
        context.setCurrentState(new ConcreteStateA());
        context.handle1();
        context.handle2();
    }
}

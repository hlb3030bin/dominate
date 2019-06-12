package avengers.spiderman.proxy;


import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/6 17:18
 */
/**
 * CGlib动态代理类
 */
public class CGLibProxy implements MethodInterceptor {

    // CGlib需要代理的目标对象
    private Object targetObject;

    public Object createProxyObject(Object obj) {
        this.targetObject = obj;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        Object proxyObj = enhancer.create();
        return proxyObj;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object obj = null;
        // 过滤方法
        if ("addUser".equals(method.getName())) {
            // 检查权限
            checkPopedom();
        }
        obj = method.invoke(targetObject, args);
        return obj;
    }

    private void checkPopedom() {
        System.out.println("检查权限：checkPopedom()!");
    }
}

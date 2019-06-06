package avengers.spiderman.Proxy;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/6 17:26
 */
public class ProxyTest {
    public static void main(String[] args) {
        UserManager userManager = (UserManager) new CGLibProxy().createProxyObject(new UserManagerImpl());
        System.out.println("CGLibProxy：");
        userManager.addUser("tom", "root");


        System.out.println("JDKProxy：");
        JDKProxy jdkProxy = new JDKProxy();
        UserManager userManagerJDK = (UserManager) jdkProxy.newProxy(new UserManagerImpl());
        userManagerJDK.addUser("tom", "root");
    }
}


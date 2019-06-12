package avengers.spiderman.proxy;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/6 17:13
 */
/**
 * 接口实现类
 */
public class UserManagerImpl implements UserManager {

    @Override
    public void addUser(String id, String password) {
        System.out.println("调用了UserManagerImpl.addUser()方法！");
    }

    @Override
    public void delUser(String id) {
        System.out.println("调用了UserManagerImpl.delUser()方法！");
    }
}

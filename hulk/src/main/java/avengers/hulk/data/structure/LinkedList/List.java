package avengers.hulk.data.structure.LinkedList;

/**
 * 本项目主要是通过几个类来组合实现
 * 1、List的线性表的接口
 * 2、Node节点类的具体方法
 * 3、单项链表类的具体实现
 */


/**
 * 线性表接口
 */
public interface List {

    // 获得线性表的长度
    public int size();

    // 判断是否为空
    public boolean isEmpty();

    // 插入操作，需要抛出异常
    public void insert(int index, Object obj) throws Exception;

    // 删除元素
    public void delete(int index) throws Exception;

    // 获取指定位置元素
    public Object get(int index) throws Exception;

}
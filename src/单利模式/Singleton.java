package 单利模式;

/**
 * 懒汉模式
 * Created by zhanghuan on 2016/3/7.
 */
public class Singleton {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton instance = null;

    // 私有构造方法，防止被实例化
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    // 优点：延迟加载（需要的时候才去加载）
    // 缺点： 线程不安全，在多线程中很容易出现不同步的情况，如在数据库对象进行的频繁读写操作时



    // 改进的方案 双重检验锁 此方法在
    public static Singleton getInstance2() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

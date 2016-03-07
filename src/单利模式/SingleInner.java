package 单利模式;

/**
 * 内部内的方式
 * Created by zhanghuan on 2016/3/7.
 */
public class SingleInner {

    // 延迟加载，减少内存开销
    private static class SingleHelper{
        private static SingleInner instance = new SingleInner();
    }

    private SingleInner() {}

    public static SingleInner getinstance() {
        return SingleHelper.instance;
    }

    // 优点：延迟加载，线程安全（java中class加载时互斥的），也减少了内存消耗
}


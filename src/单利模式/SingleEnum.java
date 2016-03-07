package 单利模式;

/**
 *
 * Created by zhanghuan on 2016/3/7.
 */
public enum  SingleEnum {
    /**
     * 1. 从Java1.5开始支持
     * 2. 无偿提供序列化机制
     * 3. 绝对防止多次实例化，即使在面对复杂的序列化或者反射攻击的时候
     */

    instance;

    private String others;

    SingleEnum() {}

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }
}

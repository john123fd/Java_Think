package 单利模式;

/**
 * 恶汉模式
 * Created by zhanghuan on 2016/3/7.
 */
public class SingleBad {
    private SingleBad instance = new SingleBad();

    private SingleBad() {}

    public SingleBad getInstance() {
        return instance;
    }
}

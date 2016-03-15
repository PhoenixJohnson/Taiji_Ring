package InfinityNet.TaijiRing.Mind.Nerves;

import InfinityNet.TaijiRing.Nature.RuleLevel;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yunjiang on 2016/1/28.
 */
public abstract class BaseRule<T extends BaseRule> {

    protected Map<RuleLevel,T> cache;

    public Map<RuleLevel, T> getCache() {
        return cache;
    }

    /**
     * 通用archive方法
     */
    public void archive(){
        /*
         保存所有缓存中的有价值的rule，一般来说，继承baseRule的所有规则会降级成baseRule进行保存。
         */
    }

    /**
     * 修正一种类型的rule然后存到缓存中
     * @param rule
     * @return
     */

    public abstract T amend(T rule);
}

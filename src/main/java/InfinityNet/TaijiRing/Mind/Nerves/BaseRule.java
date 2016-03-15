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
     * ͨ��archive����
     */
    public void archive(){
        /*
         �������л����е��м�ֵ��rule��һ����˵���̳�baseRule�����й���ή����baseRule���б��档
         */
    }

    /**
     * ����һ�����͵�ruleȻ��浽������
     * @param rule
     * @return
     */

    public abstract T amend(T rule);
}

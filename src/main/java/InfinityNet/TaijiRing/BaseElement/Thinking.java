package InfinityNet.TaijiRing.BaseElement;

import InfinityNet.TaijiRing.Mind.Nerves.Nerves;
import InfinityNet.TaijiRing.Mind.Rules.ThinkingRule;
import InfinityNet.TaijiRing.Mind.Stabilize;

/**
 * Created by yunjiang on 2016/1/26.
 */
public abstract class Thinking extends ThinkingRule implements Nerves,Stabilize {
    /*
    ����Ըû���ģ�͵�ϰ�̶߳�
 */
    private long deepLevel;

    public long getDeepLevel() {
        return deepLevel;
    }

    public void setDeepLevel(long deepLevel) {
        this.deepLevel = deepLevel;
    }

    public Thinking(long deepLevel) {
        this.deepLevel = deepLevel;
    }
}

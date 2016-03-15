package InfinityNet.TaijiRing.BaseElement;

import InfinityNet.TaijiRing.Mind.Nerves.Nerves;
import InfinityNet.TaijiRing.Mind.Rules.ConsciousnessRule;
import InfinityNet.TaijiRing.Mind.Stabilize;

/**
 * Created by yunjiang on 2016/1/26.
 */
public abstract class Consciousness extends ConsciousnessRule implements Nerves,Stabilize {
    /*
    个体对该基本模型的习惯程度
 */
    private long deepLevel;

    public long getDeepLevel() {
        return deepLevel;
    }

    public void setDeepLevel(long deepLevel) {
        this.deepLevel = deepLevel;
    }

    public Consciousness(long deepLevel) {
        this.deepLevel = deepLevel;
    }
}

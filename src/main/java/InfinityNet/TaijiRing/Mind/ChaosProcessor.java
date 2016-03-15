package InfinityNet.TaijiRing.Mind;

import InfinityNet.TaijiRing.BaseElement.Action;
import InfinityNet.TaijiRing.BaseElement.Consciousness;
import InfinityNet.TaijiRing.BaseElement.Thinking;
import InfinityNet.TaijiRing.Category.ChaosType;
import InfinityNet.TaijiRing.Particle.*;

import java.util.List;
import java.util.Map;

/**
 * Created by yunjiang on 2016/1/26.
 */
public class ChaosProcessor extends Chaos {


    private ChaosType chaosType;


    public ChaosType getChaosType() {
        return chaosType;
    }

    public void setChaosType(ChaosType chaosType) {
        this.chaosType = chaosType;
    }


    @Override
    List<? extends Action> mergeAction(Map<Map<? extends Action, ? extends ParticleYang>, Map<? extends Action, ? extends ParticleYin>> chaosInput) {
        return null;
    }

    @Override
    List<? extends Thinking> mergeThinking(Map<Map<? extends Thinking, ? extends ParticleYang>, Map<? extends Thinking, ? extends ParticleYin>> chaosInput) {
        return null;
    }

    @Override
    List<? extends Consciousness> mergeConsciousness(Map<Map<? extends Consciousness, ? extends ParticleYang>, Map<? extends Consciousness, ? extends ParticleYin>> chaosInput) {
        return null;
    }

    @Override
    Map<ChaosType, ? extends ParticleYin> categoryYin(List<? extends ParticleYin> inputYin) {
        return null;
    }

    @Override
    Map<ChaosType, ? extends ParticleYang> categoryYang(List<? extends ParticleYang> inputYang) {
        return null;
    }


}

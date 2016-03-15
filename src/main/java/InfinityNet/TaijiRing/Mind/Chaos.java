package InfinityNet.TaijiRing.Mind;


import InfinityNet.TaijiRing.BaseElement.Action;
import InfinityNet.TaijiRing.BaseElement.Consciousness;
import InfinityNet.TaijiRing.BaseElement.Thinking;
import InfinityNet.TaijiRing.Category.ChaosType;
import InfinityNet.TaijiRing.Particle.ParticleYang;
import InfinityNet.TaijiRing.Particle.ParticleYin;

import java.util.List;
import java.util.Map;

/**
 * 所有类型粒子的集结地，可以设计一些核心计算，关键公式--merge，利用神经网络算法让计算机自行学习各个原始粒子对形意神的量化
 * <p>
 * Created by yunjiang on 2016/1/22.
 */
public abstract class Chaos {

    private int threshold;
    private Map<Stabilize, ? extends ParticleYang> stabilizerYangMap;
    private Map<Stabilize, ? extends ParticleYin> stabilizerYinMap;


    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    protected void clear() {
        stabilizerYangMap.clear();
        stabilizerYinMap.clear();
    }

    abstract List<? extends Action> mergeAction(Map<Map<? extends Action, ? extends ParticleYang>, Map<? extends Action, ? extends ParticleYin>> chaosInput);


    abstract List<? extends Thinking> mergeThinking(Map<Map<? extends Thinking, ? extends ParticleYang>, Map<? extends Thinking, ? extends ParticleYin>> chaosInput);


    abstract List<? extends Consciousness> mergeConsciousness(Map<Map<? extends Consciousness, ? extends ParticleYang>, Map<? extends Consciousness, ? extends ParticleYin>> chaosInput);


    abstract Map<ChaosType, ? extends ParticleYin> categoryYin(List<? extends ParticleYin> inputYin);

    abstract Map<ChaosType, ? extends ParticleYang> categoryYang(List<? extends ParticleYang> inputYang);

}

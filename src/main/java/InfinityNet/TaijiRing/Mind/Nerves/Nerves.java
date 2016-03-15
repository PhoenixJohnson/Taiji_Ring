package InfinityNet.TaijiRing.Mind.Nerves;

import InfinityNet.TaijiRing.BaseElement.*;
import InfinityNet.TaijiRing.Nature.ElementLevel;
import InfinityNet.TaijiRing.Nature.EmotionLevel;
import InfinityNet.TaijiRing.Nature.Rules.EnvironmentRule;
import InfinityNet.TaijiRing.Mind.Chaos;
import InfinityNet.TaijiRing.Mind.Rules.MindRule;
import InfinityNet.TaijiRing.Particle.Particle;

import java.util.List;
import java.util.Map;

/**
 * Created by yunjiang on 2016/1/22.
 */
public interface Nerves {




    /**
     * 事件分解器，思维本身会进行对原始事件的一个过滤和分析过程，初步过滤形成一个相对比较模糊的事件降解机制
     * @param chaos
     * @param stabilizer
     * @return
     */

    List<? extends Particle> extractParticle(Chaos chaos,Map<? extends EmotionLevel,? extends MindRule> stabilizer);



       /*
        逆向分解使用方法，分析行为本质使用
     */


    /**
     *  将行为模型分解成基本分析粒子yin和yang，以备后续分析使用
     * @param setOfActions
     * @param am
     * @return
     */

    Map<? extends Thinking, ?extends Consciousness> extract(List<? extends Action> setOfActions,ActionManager am);

    /**
     *  将行为模型分解成基本分析粒子yin和yang，以备后续分析使用
     * @param setOfThinking
     * @param tm
     * @return
     */

    Map<? extends Action, ?extends Consciousness> extract(List<? extends Thinking> setOfThinking, ThinkingManager tm);


    /**
     * 将行为模型分解成基本分析粒子yin和yang，以备后续分析使用
     * @param setOfConsciousness
     * @return
     */
    Map<? extends Action, ?extends Thinking> extract(List<? extends Consciousness> setOfConsciousness);


    /*
        正向聚合基本元素，得出行为、思绪、潜意识（本能）
     */


    /**
     * 由基准粒子聚合分析成行为可能性集合
     * @param particles
     * @return
     */
    Map<ElementLevel,? extends Action> aggregateAction(List<? extends Particle> particles,MindRule mindRule,EnvironmentRule environmentRule);


    /**
     * 通过基本粒子的分析进而得出思想可能性集合
     * @param particles
     * @return
     */
    Map<ElementLevel,? extends Thinking> aggregateThink(List<? extends Particle> particles,MindRule mindRule,EnvironmentRule environmentRule);


    /**
     *  通过输入思想和行为的可能性集合计算出个体的潜意识（本能）集合
     * @param actions
     * @param thinking
     * @return
     */
    Map<ElementLevel,? extends Consciousness> aggregateConsciousness(Map<ElementLevel,? extends Action> actions,Map<ElementLevel,? extends Thinking> thinking,MindRule mindRule,EnvironmentRule environmentRule);




}

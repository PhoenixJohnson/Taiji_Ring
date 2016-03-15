package InfinityNet.TaijiRing.Experience;

import InfinityNet.TaijiRing.BaseElement.*;
import InfinityNet.TaijiRing.Category.ChaosType;
import InfinityNet.TaijiRing.Nature.ElementLevel;
import InfinityNet.TaijiRing.Mind.Rules.*;

import java.util.Map;

/**
 * 从Chaos processor进行整合学习以后，会将所有学习以后的新规则增加到 baseRule的archive 库中进行学习封装。并且在所有*map中存贮当时整理时的所有原始整合粒子
 * 变成一个reference。现行用唯一识别符号作为规则索引，用作之后原始粒子merge时候的参照
 *
 * Created by yunjiang on 2016/1/26.
 */
public abstract class ExperienceBay {

    abstract MindRule extractMindRule(Map<ElementLevel,? extends MindRule> mindRule, Map<ElementLevel, ? extends Consciousness> consciousnessMap);

    abstract ConsciousnessRule extractConsciousnessRule(Map<ElementLevel,? extends ConsciousnessRule> mindRule, Map<ElementLevel, ? extends Consciousness> consciousnessMap);

    abstract ThinkingRule extractThinkingRule(Map<ElementLevel,? extends ThinkingRule> mindRule, Map<ElementLevel, ? extends Thinking> thinkingMap);

    abstract ActionRule extractActionRule(Map<ElementLevel,? extends ActionRule> mindRule, Map<ElementLevel, ? extends Action> actionMap);

    abstract MevolutionRule extractMevolutionRule(Map<ElementLevel,? extends MevolutionRule> mindRule, Map<ElementLevel, ? extends MindRule> mindRuleMap);

    abstract ChaosType mindRuleFilter(Object rule);





}

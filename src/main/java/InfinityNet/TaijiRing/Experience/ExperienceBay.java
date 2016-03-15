package InfinityNet.TaijiRing.Experience;

import InfinityNet.TaijiRing.BaseElement.*;
import InfinityNet.TaijiRing.Category.ChaosType;
import InfinityNet.TaijiRing.Nature.ElementLevel;
import InfinityNet.TaijiRing.Mind.Rules.*;

import java.util.Map;

/**
 * ��Chaos processor��������ѧϰ�Ժ󣬻Ὣ����ѧϰ�Ժ���¹������ӵ� baseRule��archive ���н���ѧϰ��װ������������*map�д�����ʱ����ʱ������ԭʼ��������
 * ���һ��reference��������Ψһʶ�������Ϊ��������������֮��ԭʼ����mergeʱ��Ĳ���
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

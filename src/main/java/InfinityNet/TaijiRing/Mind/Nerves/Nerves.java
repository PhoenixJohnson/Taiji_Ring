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
     * �¼��ֽ�����˼ά�������ж�ԭʼ�¼���һ�����˺ͷ������̣����������γ�һ����ԱȽ�ģ�����¼��������
     * @param chaos
     * @param stabilizer
     * @return
     */

    List<? extends Particle> extractParticle(Chaos chaos,Map<? extends EmotionLevel,? extends MindRule> stabilizer);



       /*
        ����ֽ�ʹ�÷�����������Ϊ����ʹ��
     */


    /**
     *  ����Ϊģ�ͷֽ�ɻ�����������yin��yang���Ա���������ʹ��
     * @param setOfActions
     * @param am
     * @return
     */

    Map<? extends Thinking, ?extends Consciousness> extract(List<? extends Action> setOfActions,ActionManager am);

    /**
     *  ����Ϊģ�ͷֽ�ɻ�����������yin��yang���Ա���������ʹ��
     * @param setOfThinking
     * @param tm
     * @return
     */

    Map<? extends Action, ?extends Consciousness> extract(List<? extends Thinking> setOfThinking, ThinkingManager tm);


    /**
     * ����Ϊģ�ͷֽ�ɻ�����������yin��yang���Ա���������ʹ��
     * @param setOfConsciousness
     * @return
     */
    Map<? extends Action, ?extends Thinking> extract(List<? extends Consciousness> setOfConsciousness);


    /*
        ����ۺϻ���Ԫ�أ��ó���Ϊ��˼����Ǳ��ʶ�����ܣ�
     */


    /**
     * �ɻ�׼���ӾۺϷ�������Ϊ�����Լ���
     * @param particles
     * @return
     */
    Map<ElementLevel,? extends Action> aggregateAction(List<? extends Particle> particles,MindRule mindRule,EnvironmentRule environmentRule);


    /**
     * ͨ���������ӵķ��������ó�˼������Լ���
     * @param particles
     * @return
     */
    Map<ElementLevel,? extends Thinking> aggregateThink(List<? extends Particle> particles,MindRule mindRule,EnvironmentRule environmentRule);


    /**
     *  ͨ������˼�����Ϊ�Ŀ����Լ��ϼ���������Ǳ��ʶ�����ܣ�����
     * @param actions
     * @param thinking
     * @return
     */
    Map<ElementLevel,? extends Consciousness> aggregateConsciousness(Map<ElementLevel,? extends Action> actions,Map<ElementLevel,? extends Thinking> thinking,MindRule mindRule,EnvironmentRule environmentRule);




}

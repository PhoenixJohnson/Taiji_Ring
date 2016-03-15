package InfinityNet.TaijiRing.Mind.Rules;

import InfinityNet.TaijiRing.Mind.Nerves.BaseRule;

/**
 * Created by yunjiang on 2016/1/28.
 */
public class ThinkingRule extends BaseRule<ThinkingRule> {

    @Override
    public ThinkingRule amend(ThinkingRule rule) {
        System.out.println(super.cache.toString());
        return null;
    }

}

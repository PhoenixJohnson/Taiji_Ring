package InfinityNet.TaijiRing.BaseElement;

/**
 * We are using manager to store single base Model element to storage if we set some trigger when initializing it.
 *
 * Created by yunjiang on 2016/1/26.
 */
public class ActionManager<T extends Action> {

    private boolean toggle;

    public ActionManager() {

    }

    public Boolean getToggle() {
        return toggle;
    }

    public void setToggle(boolean toggle) {
        this.toggle = toggle;
    }

    public ActionManager(boolean toggle) {
        this.toggle = toggle;
    }
}

package InfinityNet.TaijiRing;


import InfinityNet.TaijiRing.BaseElement.Action;
import InfinityNet.TaijiRing.BaseElement.ActionManager;
import InfinityNet.TaijiRing.Mind.Rules.ThinkingRule;
import org.encog.ml.MLClassification;
import org.encog.ml.MLCluster;
import org.encog.ml.MLRegression;
import org.encog.ml.data.MLData;
import org.encog.ml.data.MLDataSet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yunjiang on 2016/1/22.
 */
public class Main {


    class MyEncog implements MLRegression{

        public MLData compute(MLData input) {
            return null;
        }

        public int getInputCount() {
            return 0;
        }

        public int getOutputCount() {
            return 0;
        }
    }

    class MyEncogClassic implements MLClassification{

        public int classify(MLData input) {
            return 0;
        }

        public int getInputCount() {
            return 0;
        }

        public int getOutputCount() {
            return 0;
        }
    }


    class myEncogCluster implements MLCluster{

        public void add(MLData pair) {

        }

        public MLDataSet createDataSet() {
            return null;
        }

        public MLData get(int pos) {
            return null;
        }

        public List<MLData> getData() {
            return null;
        }

        public void remove(MLData data) {

        }

        public int size() {
            return 0;
        }
    }

    public static void main(String[] args) {


        ActionManager<Action> aa = new ActionManager();
        aa.setToggle(true);
        System.out.println(aa.toString());

    }

}

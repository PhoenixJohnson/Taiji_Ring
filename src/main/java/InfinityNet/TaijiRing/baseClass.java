package InfinityNet.TaijiRing;

import org.encog.ml.MLClassification;
import org.encog.ml.MLMethod;
import org.encog.ml.data.MLData;

/**
 * Created by yunjiang on 2016/2/15.
 */
public class baseClass implements MLClassification{
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

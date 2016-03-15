package InfinityNet.TaijiRing.Mind;

import InfinityNet.TaijiRing.Particle.Particle;
import InfinityNet.TaijiRing.Particle.ParticleYang;
import InfinityNet.TaijiRing.Particle.ParticleYin;

import java.util.List;

/**
 * Created by yunjiang on 2016/1/22.
 */
public interface ParticleMerging {

    /**
     * Merge Yin particle or Yang Particle
     */

    Chaos merge(List<? extends Particle> mergeA,List<? extends Particle> mergeB);
}

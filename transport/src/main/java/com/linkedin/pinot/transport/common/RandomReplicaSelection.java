package com.linkedin.pinot.transport.common;

import java.util.List;
import java.util.Random;

public class RandomReplicaSelection extends ReplicaSelection {

  private final Random _rand;

  public RandomReplicaSelection(long seed)
  {
    _rand = new Random(seed);
  }

  @Override
  public void reset(Partition p) {
    // Nothing to be done here
  }

  @Override
  public void reset(PartitionGroup p) {
    // Nothing to be done here
  }

  @Override
  public ServerInstance selectServer(Partition p, List<ServerInstance> orderedServers,  Object bucketKey) {

    int size = orderedServers.size();

    if ( size <= 0) {
      return null;
    }

    return orderedServers.get(Math.abs(_rand.nextInt())%size);
  }

}

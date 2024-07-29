package com.coen6731_assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RabbitMQConsumer {
    
    public static void main(String[] argv) throws Exception {
      
      Map<String, String> queueBinding = new HashMap<>();
      queueBinding.put("myQueue1", "Cost.*.*.*.*");
      queueBinding.put("myQueue2", "Top5-Expensive.*.*.*");
      queueBinding.put("myQueue3", "Top5-Economical.*.*.*");
      queueBinding.put("myQueue4", "Top5-HighestGrow.*.*.*");
      queueBinding.put("myQueue5", "AverageExpense.*.*.*");

      // Iterate through keys using entrySet()
      for (Entry<String, String> entry : queueBinding.entrySet()) {
          //consumer to consume the published messages.
          Consumer consumer = new Consumer();
          consumer.consume(entry.getKey(), entry.getValue());
          System.out.println("");
      }
    }
    
}

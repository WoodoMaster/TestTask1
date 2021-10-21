package com.goods;

public class Filter extends Product{
   private final int performance;

   public Filter(int performance) {
      this.performance = performance;
   }

   public int getPerformance() {
      return performance;
   }
}

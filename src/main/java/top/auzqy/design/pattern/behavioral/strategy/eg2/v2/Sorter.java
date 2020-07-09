package top.auzqy.design.pattern.behavioral.strategy.eg2.v2;

import java.io.File;

public class Sorter {
  private static final long GB = 1000 * 1000 * 1000;

  public void sortFile(String filePath) {
    // 省略校验逻辑
    File file = new File(filePath);
    long fileSize = file.length();
    ISortAlg sortAlg;
    // [0, 6GB)
    if (fileSize < 6 * GB) {
      sortAlg = new QuickSort();
    }
    // [6GB, 10GB)
    else if (fileSize < 10 * GB) {
      sortAlg = new ExternalSort();
    }
    // [10GB, 100GB)
    else if (fileSize < 100 * GB) {
      sortAlg = new ConcurrentExternalSort();
    }
    // [100GB, ~)
    else {
      sortAlg = new MapReduceSort();
    }
    sortAlg.sort(filePath);
  }
}

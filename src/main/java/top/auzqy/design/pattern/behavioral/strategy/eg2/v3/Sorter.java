package top.auzqy.design.pattern.behavioral.strategy.eg2.v3;

import top.auzqy.design.pattern.behavioral.strategy.eg2.v2.ISortAlg;

import java.io.File;

/**
 * description:  每种排序类都是无状态的，我们没必要在每次使用的时候，都重新创建一个新的对象。
 *       所以，我们可以使用工厂模式对对象的创建进行封装。
 *       我们通过策略模式将策略的定义、创建、使用解耦，让每一部分都不至于太复杂
 * createTime: 2020/7/9 20:06
 * @author au
 */
public class Sorter {
  private static final long GB = 1000 * 1000 * 1000;

  public void sortFile(String filePath) {
    // 省略校验逻辑
    File file = new File(filePath);
    long fileSize = file.length();
    ISortAlg sortAlg;
    if (fileSize < 6 * GB) { // [0, 6GB)
      sortAlg = SortAlgFactory.getSortAlg("QuickSort");
    } else if (fileSize < 10 * GB) { // [6GB, 10GB)
      sortAlg = SortAlgFactory.getSortAlg("ExternalSort");
    } else if (fileSize < 100 * GB) { // [10GB, 100GB)
      sortAlg = SortAlgFactory.getSortAlg("ConcurrentExternalSort");
    } else { // [100GB, ~)
      sortAlg = SortAlgFactory.getSortAlg("MapReduceSort");
    }
    sortAlg.sort(filePath);
  }
}

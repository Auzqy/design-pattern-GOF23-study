package top.auzqy.design.pattern.behavioral.strategy.eg2.v1;

import java.io.File;

/**
 * description:  用最简单直接的方式将它实现出来
 * createTime: 2020/7/9 19:55
 * @author au
 */
public class Sorter {
  private static final long GB = 1000 * 1000 * 1000;

  public void sortFile(String filePath) {
    // 省略校验逻辑
    File file = new File(filePath);
    long fileSize = file.length();
    // [0, 6GB)
    if (fileSize < 6 * GB) {
      quickSort(filePath);
    }
    // [6GB, 10GB)
    else if (fileSize < 10 * GB) {
      externalSort(filePath);
    }
    // [10GB, 100GB)
    else if (fileSize < 100 * GB) {
      concurrentExternalSort(filePath);
    }
    // [100GB, ~)
    else {
      mapreduceSort(filePath);
    }
  }

  private void quickSort(String filePath) {
    // 快速排序
    System.out.println("快速排序");
  }

  private void externalSort(String filePath) {
    // 外部排序
    System.out.println("外部排序");
  }

  private void concurrentExternalSort(String filePath) {
    // 多线程外部排序
    System.out.println("多线程外部排序");
  }

  private void mapreduceSort(String filePath) {
    // 利用MapReduce多机排序
    System.out.println("利用MapReduce多机排序");
  }
}


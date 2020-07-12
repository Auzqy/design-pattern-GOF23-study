package top.auzqy.design.pattern.behavioral.visitor.example1.eg1_1;

import java.util.ArrayList;
import java.util.List;


/**
 * 命令行的方式
 *    javac xxx/ToolApplication.java
 *    java xxx/ToolApplication "${resourceDirectory}"
 *
 * 运行结果是：
 * Extract PDF.
 * Extract WORD.
 * Extract PPT.
 */
public class ToolApplication {
  public static void main(String[] args) {
    List<ResourceFile> resourceFiles = listAllResourceFiles(args[0]);
    for (ResourceFile resourceFile : resourceFiles) {
      resourceFile.extract2txt();
    }
  }

  private static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
    List<ResourceFile> resourceFiles = new ArrayList<>();
    //...根据后缀(pdf/ppt/word)由工厂方法创建不同的类对象(PdfFile/PPTFile/WordFile)
    resourceFiles.add(new PdfFile("a.pdf"));
    resourceFiles.add(new WordFile("b.word"));
    resourceFiles.add(new PPTFile("c.ppt"));
    return resourceFiles;
  }
}

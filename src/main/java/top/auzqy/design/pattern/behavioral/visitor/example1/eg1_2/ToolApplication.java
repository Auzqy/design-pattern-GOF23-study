package top.auzqy.design.pattern.behavioral.visitor.example1.eg1_2;

import java.util.ArrayList;
import java.util.List;

public class ToolApplication {
  public static void main(String[] args) {
    Extractor extractor = new Extractor();
//    List<ResourceFile> resourceFiles = listAllResourceFiles(args[0]);
    // 由于这里的代码逻辑不是真的实现，所以这里有个参数就行，模拟一下即可
    List<ResourceFile> resourceFiles = listAllResourceFiles("resourceDirectory");
    for (ResourceFile resourceFile : resourceFiles) {
//      extractor.extract2txt(resourceFile);
      resourceFile.accept(extractor);
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
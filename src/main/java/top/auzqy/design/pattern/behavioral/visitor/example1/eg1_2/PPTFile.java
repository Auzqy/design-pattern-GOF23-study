package top.auzqy.design.pattern.behavioral.visitor.example1.eg1_2;

public class PPTFile extends ResourceFile {
  public PPTFile(String filePath) {
    super(filePath);
  }
  @Override
  public void accept(Extractor extractor) {
    extractor.extract2txt(this);
  }
  //...
}

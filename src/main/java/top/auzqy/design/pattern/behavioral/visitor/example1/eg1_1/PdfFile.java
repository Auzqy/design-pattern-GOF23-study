package top.auzqy.design.pattern.behavioral.visitor.example1.eg1_1;

public class PdfFile extends ResourceFile {
  public PdfFile(String filePath) {
    super(filePath);
  }

  @Override
  public void extract2txt() {
    //...
    System.out.println("Extract PDF.");
  }
}

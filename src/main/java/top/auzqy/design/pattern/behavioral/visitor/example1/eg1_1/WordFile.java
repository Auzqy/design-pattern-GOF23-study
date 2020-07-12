package top.auzqy.design.pattern.behavioral.visitor.example1.eg1_1;

public class WordFile extends ResourceFile {
  public WordFile(String filePath) {
    super(filePath);
  }

  @Override
  public void extract2txt() {
    //...
    System.out.println("Extract WORD.");
  }
}

package top.auzqy.design.pattern.behavioral.visitor.example1.eg1_4;

public abstract class ResourceFile {
  protected String filePath;
  public ResourceFile(String filePath) {
    this.filePath = filePath;
  }
  abstract public void accept(Visitor vistor);
}





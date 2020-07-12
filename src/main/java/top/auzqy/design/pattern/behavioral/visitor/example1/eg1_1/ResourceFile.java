package top.auzqy.design.pattern.behavioral.visitor.example1.eg1_1;

import java.util.ArrayList;
import java.util.List;

public abstract class ResourceFile {
  protected String filePath;

  public ResourceFile(String filePath) {
    this.filePath = filePath;
  }

  public abstract void extract2txt();
}


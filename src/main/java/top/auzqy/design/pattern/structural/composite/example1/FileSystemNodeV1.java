package top.auzqy.design.pattern.structural.composite.example1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSystemNodeV1 {
  private String path;
  private boolean isFile;
  private List<FileSystemNodeV1> subNodes = new ArrayList<>();

  public FileSystemNodeV1(String path, boolean isFile) {
    this.path = path;
    this.isFile = isFile;
  }

//  public int countNumOfFiles() {
//    // TODO:...
//    return 1;
//  }
//
//  public long countSizeOfFiles() {
//    // TODO:...
//    return 1;
//  }


  public int countNumOfFiles() {
    if (isFile) {
      return 1;
    }
    int numOfFiles = 0;
    for (FileSystemNodeV1 fileOrDir : subNodes) {
      numOfFiles += fileOrDir.countNumOfFiles();
    }
    return numOfFiles;
  }

  public long countSizeOfFiles() {
    if (isFile) {
      File file = new File(path);
      if (!file.exists()) {
        return 0;
      }
      return file.length();
    }
    long sizeofFiles = 0;
    for (FileSystemNodeV1 fileOrDir : subNodes) {
      sizeofFiles += fileOrDir.countSizeOfFiles();
    }
    return sizeofFiles;
  }

  public String getPath() {
    return path;
  }

  public void addSubNode(FileSystemNodeV1 fileOrDir) {
    subNodes.add(fileOrDir);
  }

  public void removeSubNode(FileSystemNodeV1 fileOrDir) {
    int size = subNodes.size();
    int i = 0;
    for (; i < size; ++i) {
      if (subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
        break;
      }
    }
    if (i < size) {
      subNodes.remove(i);
    }
  }
}
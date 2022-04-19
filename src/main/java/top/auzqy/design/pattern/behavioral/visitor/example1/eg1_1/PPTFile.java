package top.auzqy.design.pattern.behavioral.visitor.example1.eg1_1;

/**
 * description:
 * createTime: 2022/4/19 14:38
 * @author au
 */
public class PPTFile extends ResourceFile {
  public PPTFile(String filePath) {
    super(filePath);
  }

  @Override
  public void extract2txt() {
    //...省略一大坨从PPT中抽取文本的代码...
    //...将抽取出来的文本保存在跟filePath同名的.txt文件中...
    System.out.println("Extract PPT.");
  }
}

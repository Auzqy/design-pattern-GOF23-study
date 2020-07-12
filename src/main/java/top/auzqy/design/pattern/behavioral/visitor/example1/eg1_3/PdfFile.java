package top.auzqy.design.pattern.behavioral.visitor.example1.eg1_3;



public class PdfFile extends ResourceFile {
  public PdfFile(String filePath) {
    super(filePath);
  }

  @Override
  public void accept(Extractor extractor) {
    extractor.extract2txt(this);
  }

  @Override
  public void accept(Compressor compressor) {
    compressor.compress(this);
  }

  //...
}
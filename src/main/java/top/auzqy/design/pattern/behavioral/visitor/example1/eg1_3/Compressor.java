package top.auzqy.design.pattern.behavioral.visitor.example1.eg1_3;



public class Compressor {
  public void compress(PPTFile pptFile) {
    //...
    System.out.println("Compressor PPT.");
  }

  public void compress(PdfFile pdfFile) {
    //...
    System.out.println("Compressor PDF.");
  }

  public void compress(WordFile wordFile) {
    //...
    System.out.println("Compressor WORD.");
  }
}

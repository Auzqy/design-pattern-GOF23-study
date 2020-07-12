package top.auzqy.design.pattern.behavioral.visitor.example1.eg1_4;

public interface Visitor {
  void visit(PdfFile pdfFile);
  void visit(PPTFile pdfFile);
  void visit(WordFile pdfFile);
}
package top.auzqy.design.pattern.structural.adapter.example2;

public class Test {
    public static void main(String[] args) {
        // 没有翻译官时，姚明的懵逼
        AbstractPlayer ymNoEnglish = new CenterPlayer("姚明");

        ymNoEnglish.attack();
        ymNoEnglish.defense();


        System.out.println(" ================ ");

        // 有了翻译官时，姚明的清晰
        AbstractPlayer ymHasTranslator = new TranslatorAdapter("姚明");

        ymHasTranslator.attack();
        ymHasTranslator.defense();

    }
}

package top.auzqy.design.pattern.behavioral.mediator.example2;

public class Test {
    public static void main(String[] args) {
        UnitedNations securityCouncil = new SecurityCouncil();

        Country usa = new USA(securityCouncil);
        Country iraq = new Iraq(securityCouncil);

        usa.declare("不准研制核武器，否则老子收拾你");
        iraq.declare("老子想干啥就干啥，用你管");
    }
}

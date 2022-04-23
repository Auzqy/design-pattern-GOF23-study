package top.auzqy.design.exercise.factory;
public class SendSmsFactory implements Provider{
@Override
public Sender produce() {
return new SmsSender();
}
}
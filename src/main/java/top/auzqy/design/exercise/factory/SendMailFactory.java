package top.auzqy.design.exercise.factory;
public class SendMailFactory implements Provider {
@Override
public Sender produce(){
return new MailSender();
}
}

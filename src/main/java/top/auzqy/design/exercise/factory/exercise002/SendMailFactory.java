package top.auzqy.design.exercise.factory.exercise002;

public class SendMailFactory implements Provider {
	@Override
	public Sender produce() {
		return new MailSender();
	}
}

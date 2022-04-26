package top.auzqy.design.exercise.factory.exercise002;

public class MailSender implements Sender {
	@Override
	public void Send() {
		System.out.println("this is mailsender!");
	}
}

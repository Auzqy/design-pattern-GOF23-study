package top.auzqy.design.exercise.factory.exercise002;

public class SmsSender implements Sender {
	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}
}
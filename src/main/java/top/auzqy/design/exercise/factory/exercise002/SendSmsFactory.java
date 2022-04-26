package top.auzqy.design.exercise.factory.exercise002;

public class SendSmsFactory implements Provider {
	@Override
	public Sender produce() {
		return new SmsSender();
	}
}
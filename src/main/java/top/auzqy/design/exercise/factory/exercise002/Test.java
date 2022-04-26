package top.auzqy.design.exercise.factory.exercise002;

public class Test {
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}
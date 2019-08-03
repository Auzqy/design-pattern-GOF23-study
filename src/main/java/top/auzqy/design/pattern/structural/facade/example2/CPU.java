package top.auzqy.design.pattern.structural.facade.example2;

/**
 * description:  子系统：CPU
 * createTime: 2019-08-03 11:07
 * @author zqy
 */
public class CPU {

	public void startup() {
		System.out.println("cpu startup!");
	}

	public void shutdown() {
		System.out.println("cpu shutdown!");
	}

}
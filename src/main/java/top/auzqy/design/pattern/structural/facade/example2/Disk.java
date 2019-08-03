package top.auzqy.design.pattern.structural.facade.example2;

/**
 * description:  子系统：硬盘
 * createTime: 2019-08-03 11:07
 * @author zqy
 */
public class Disk {

	public void startup() {
		System.out.println("disk startup!");
	}

	public void shutdown() {
		System.out.println("disk shutdown!");
	}

}
package test;

import java.awt.Label;

import test.gongxaing.windows.IndexFrame;

public class Test extends IndexFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label label;

	public Test(String str) {
		super(str);

	}

	public void newInit() {
		init();
		label = new Label("new windows");
		label.setBounds(10, 10, 100, 200);
		this.add(this.label);
	}

	public static void main(String[] args) {
		Test test = new Test("new windows");
		test.newInit();
	}

}

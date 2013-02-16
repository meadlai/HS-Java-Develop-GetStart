package com.hundsun.fund.java7.inner_class;

public class StaticInner {

	//静态内类
	static class Nest {
		void go(String msg) {
			System.out.println("hi,"+msg);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StaticInner.Nest n = new StaticInner.Nest();   // both class names
	    n.go("你好!");
	    Nest b2 = new Nest();     // access the enclosed class
	    b2.go("新年好!");
	}

}
package com.hundsun.fund.java0.helloworld;
/**
 * 类的注释说明
 * @author laiqinyi
 * @version 1.0
 *
 */
public class HelloWorld {
	//成员变量
	private int prop1 = 0;
	private static int prop2 = 2;
	/**
	 * 主程序入口,相当于C的main
	 * @param args
	 */
	public static void main(String[] args) {
		//注释:打印HelloWorld字符串.
		System.out.println("HelloWorld!");
	}
	
	//成员方法1
	public static void method1(int i){
		System.out.println("静态方法: "+i);
	}
	
	//成员方法2
	public void method2(int i){
		System.out.println("实例方法: "+i);
	}

}

/**
 * 
 */
package cn.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.demo.bean.TextEditor;

/**
 * @author da0ke
 *
 *         日期:2018/03/31
 */
public class MainApp {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor obj = (TextEditor) context.getBean("textEditor");
		obj.spellCheck();
	}
}

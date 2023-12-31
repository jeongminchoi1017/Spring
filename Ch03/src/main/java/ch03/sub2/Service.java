package ch03.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service1")
public class Service {
	
	@Autowired
	private LogAdvice advice;
	
	public void insert() {
		advice.beforeLog();
		System.out.println("Core concern - insert...");
		advice.afterLog();
	}
	
	
	public void select() {
		System.out.println("Core concern - select...");
	}
	
	
	public void update(int no) {
		System.out.println("Core concern - update...");
	}
	public void delete(int no, String name) {
		System.out.println("Core concern - delete...");
	}
}

package demo.service;

import java.util.ArrayList;
import java.util.List;

import demo.model.User;


public class UserService {
	public List<User> getAllStudents() {
		User s1 = new User(1,"Hoang Tuan", "0912345678");
		User s2 = new User(2,"Phuong Linh", "0986868686");
		List<User> list = new ArrayList<User>();
		list.add(s1);
		list.add(s2);
		return list;
	}
}

package demo.service;

import java.util.ArrayList;
import java.util.List;

import demo.model.Shirt;


public class ShirtService {
	public List<Shirt> getAllShirts() {
		Shirt s1 = new Shirt(1, "Ao co tim vang", "170000");
		Shirt s2 = new Shirt(2,"Ao over-size ke soc", "200000");
		List<Shirt> list = new ArrayList<Shirt>();
		list.add(s1);
		list.add(s2);
		return list;
	}
}

package demo.service;

import java.util.ArrayList;
import java.util.List;

import demo.model.Dress;


public class DressService {
	public List<Dress> getAllDresses() {
		Dress s1 = new Dress(1, "Vay hoa nhi vang", "170000");
		Dress s2 = new Dress(2,"Vay xoe cong chua", "200000");
		List<Dress> list = new ArrayList<Dress>();
		list.add(s1);
		list.add(s2);
		return list;
	}
}

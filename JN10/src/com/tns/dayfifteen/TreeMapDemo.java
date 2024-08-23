package com.tns.dayfifteen;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;

import com.tns.dayfourteen.Employee;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,Employee> empData=new TreeMap<Integer, Employee>();
		Employee e=new Employee(101, "Dhruv", 88000, "IT");
		empData.put(e.getId(), e);
		
		e=new Employee(105, "Aniket", 81000, "IT");
		empData.put(e.getId(), e);
		
		e=new Employee(107, "Palash", 48000, "HR");
		empData.put(e.getId(), e);
		
		e=new Employee(103, "Pruthvi", 83000, "Quality");
		empData.put(e.getId(), e);
		
		e=new Employee(102, "Meet", 58000, "IT");
		empData.put(e.getId(), e);
		empData.put(100, null); //null values allowed
		//empData.put(null, e); //null keys not allowed throws NullPointerException
		System.out.println(empData);
		
		System.out.println(empData.containsKey(101));
		System.out.println(empData.containsValue(e));
		System.out.println(empData.get(103));
		System.out.println("---------------");
		
		Set<Integer> ids=empData.keySet();
		System.out.println(ids);
		System.out.println("---------------");
		ids.forEach(System.out::println);
		System.out.println("---------------");
		for(Integer id:ids)
		{
			System.out.println(id+" : "+empData.get(id));
		}
		System.out.println("---------------");
		
		Collection<Employee> emps=empData.values();
		System.out.println(emps);

		System.out.println("---------------");
		
		Set<Entry<Integer,Employee>> empEntries=empData.entrySet();
		for(Entry<Integer,Employee> entry:empEntries)
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}

package org.encap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Execution {
	public static void main(String [] args) {
		EncapLearnPOJO e0=new EncapLearnPOJO();
		e0.setCustomerId(123);
		e0.setPassword("Ravi@123");
		EncapLearnPOJO e1=new EncapLearnPOJO();
		e1.setCustomerId(321);
		e1.setPassword("Ram@123");
		EncapLearnPOJO e2=new EncapLearnPOJO();
		e2.setCustomerId(456);
		e2.setPassword("Babu@123");
//		int customerId = e.getCustomerId();
//		System.out.println(customerId);
//		String password = e.getPassword();
//		System.out.println(password);
		List<EncapLearnPOJO> li=new LinkedList();
		li.add(e0);
		li.add(e1);
		li.add(e2);
		for(int i=0;i<li.size();i++) {
		 EncapLearnPOJO o = li.get(i);
		System.out.println(o.getCustomerId());
		 System.out.println(o.getPassword());
		}
		
		System.out.println("===SET======");
		
		Set<EncapLearnPOJO> si=new LinkedHashSet();
		si.addAll(li);
		for(EncapLearnPOJO s:si) {
			System.out.println(s.getCustomerId());
			 System.out.println(s.getPassword());
			 System.out.println("Suba");
		}
		
		System.out.println("----Map------"); 
		
		Map<Integer,EncapLearnPOJO> m=new LinkedHashMap();
		m.put(10,e0);
		m.put(20,e1);
		m.put(3098,e2);
		Collection<EncapLearnPOJO> values = m.values();
		for(EncapLearnPOJO mi:values) {
			System.out.println(mi.getCustomerId());
			System.out.println(mi.getPassword());
		}
		
		
		
	}
  
}
  
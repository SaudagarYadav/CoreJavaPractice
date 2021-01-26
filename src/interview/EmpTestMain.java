package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpTestMain {

	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(4, "Amit", 23, 100000));
		list.add(new Emp(5, "Amir", 33, 14000));
		list.add(new Emp(6, "Mahesh", 33, 200000));
		list.add(new Emp(9, "Ram", 23, 600000));
		list.add(new Emp(1, "Sandesh", 32, 900000));
		Collections.sort(list, (e1, e2) -> {
			if (e1.getAge() < e2.getAge()) {
				return -1;
			} else if (e1.getAge() > e2.getAge()) {
				return 1;
			} else {
				if (e1.getSalary() < e2.getSalary()) {
					return -1;
				} else if (e1.getSalary() > e2.getSalary()) {
					return 1;
				} else {
					return 0;
				}
			}
		});

		System.out.println("After sorting by salary");
		list.forEach(System.out::println);
		
	}

}

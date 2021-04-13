package interview.accolite.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(final String[] args) {
		final Map<Student, String> map = new HashMap<Student, String>();
		final Student s1 = new Student(1);
		final Student s2 = new Student(1);
		map.put(s1, "s1");
		map.put(s2, "s2");

		System.out.println(map);
	}
}

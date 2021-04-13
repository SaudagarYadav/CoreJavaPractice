package interview.deloitte;

public interface InterfaceB {

	default void test() {
		System.out.println("Interface B");
	}
	
	static void testStatic() {
		System.out.println("Interface B Static");
	}
	
	void testMth();
}

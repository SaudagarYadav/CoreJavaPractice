package interview.deloitte;

public interface InterfaceA {

	default void test() {
		System.out.println("Interface A");
	}
	
	static void testStatic() {
		System.out.println("Interface A Static");
	}
	
	void testMth();
}

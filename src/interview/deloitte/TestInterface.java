package interview.deloitte;

public class TestInterface implements InterfaceA, InterfaceB{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		InterfaceA.super.test();
	}
	
	public static void main(final String[] args) {
		new TestInterface().test();
		new TestInterface().testMth();
		
	}

	@Override
	public void testMth() {
		// TODO Auto-generated method stub
		
	}


}

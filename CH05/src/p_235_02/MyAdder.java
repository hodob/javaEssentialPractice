package p_235_02;

public class MyAdder implements AdderInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int add(int n) {
		// TODO Auto-generated method stub
		return 55;
	}

}

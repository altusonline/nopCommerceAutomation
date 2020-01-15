package test;

public class TestPrint {
	public static void main(String[] args) {
		String myDir = System.getProperty("user.dir");
		System.out.println(myDir);
		
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
	}

}

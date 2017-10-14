import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		MyProperties m = new MyProperties("config.properties");
		Properties p = m.load();
		System.out.println(p.get("b"));
		System.out.println(p.getProperty("c"));
	}

}

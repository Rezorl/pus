import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MyProperties {

	FileInputStream fin;
	FileInputStream fin2;
	Properties properties;
	
	public MyProperties(String name){
		properties = new Properties();
		try {
			fin = new FileInputStream(System.getProperty("user.home")+"/"+name);
			fin2 = new FileInputStream("./"+name);
			properties.load(fin);
			properties.load(fin2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Properties load(){
		return this.properties;
	}
}

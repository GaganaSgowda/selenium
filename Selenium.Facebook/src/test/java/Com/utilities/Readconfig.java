package Com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
Properties pro;
public Readconfig(){
	File src= new File("./Configuration/config.Properties");
	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}catch (Exception e) {
		System.out.println("Exception is" + e.getMessage());
	}
	
}
public String getApplicationURL() {
	String url=pro.getProperty("BaseURL");
	return url;
}
public String getUseremail() {
	String useremail=pro.getProperty("email");
	return useremail;
}
public String getPassword() {
	String password=pro.getProperty("password");
	return password;
}

}

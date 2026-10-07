package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPageData {

    public static String url;
    public static String name;
    public static String email;
    public static String password;

    static {
        try {
            FileInputStream fis = new FileInputStream(
                "./src/test/resources/DataDrivenTesting/Register.properties"
            );

            Properties prop = new Properties();
            prop.load(fis);

            url = prop.getProperty("url");
            name = prop.getProperty("name");
            email = prop.getProperty("email");
            password = prop.getProperty("password");

            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
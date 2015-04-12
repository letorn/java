package util;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {

	private Properties config = new Properties();

	public Config(String filename) {
		try {
			config.load(new FileInputStream(filename));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getString(String key) {
		return config.getProperty(key);
	}

	public int getInt(String key) {
		return Integer.parseInt(config.getProperty(key));
	}

	public double getDouble(String key) {
		return Double.parseDouble(config.getProperty(key));
	}
}

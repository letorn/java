package util;

public class Factory {

	public static Object getInstance(String type) {
		Object obj = null;
		Config config = new Config("config.properties");
		String className = config.getString(type);
		try {
			obj = Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}

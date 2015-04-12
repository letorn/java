package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

/*
 * 加密工具类
 */
public class MD5 {
	/**
	 * 采用md5加密
	 * 
	 * @param origin
	 * @return
	 */
	public static String encode(String origin) {
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			byte[] buf = md.digest(origin.getBytes());
			BASE64Encoder encoder = new BASE64Encoder();
			return encoder.encode(buf);
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
	}

}

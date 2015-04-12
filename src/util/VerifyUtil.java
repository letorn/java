package util;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.Test;

/*
 * 验证工具类
 */
public class VerifyUtil {

	public static String createEmailVerifyCode() {
		return UUID.randomUUID().toString();
	}

	public static Map<String, Object> decodeVerifyCode(String verifyCode) {
		Map<String, Object> decoder = new HashMap<String, Object>();
		decoder.put("emailVerifyCode", verifyCode.substring(0, verifyCode.lastIndexOf("-")));
		decoder.put("id", verifyCode.substring(verifyCode.lastIndexOf("-") + 1));
		return decoder;
	}

	@Test
	public void codeTest() {
		String emailVerifyCode = createEmailVerifyCode();
		String verifyCode = emailVerifyCode + "-" + "4";
		Map<String, Object> decoder = decodeVerifyCode(verifyCode);
		System.out.println(emailVerifyCode);
		System.out.println(verifyCode);
		System.out.println("id:" + decoder.get("id") + ", emailVerifyCode:" + decoder.get("emailVerifyCode"));
	}

}

package db.encryption;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Optional;
import java.util.function.Predicate;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Encryption {
	private static final Charset ENCODING_TYPE = StandardCharsets.UTF_8;
	private static final String INSTANCE_TYPE = "AES/CBC/PKCS5Padding";
	private SecretKeySpec secretKeySpec;
	private Cipher cipher;
	private IvParameterSpec ivParameterSpec;
	
	public Encryption(final String key) {
		validation(key);
		try {
			byte[] keyBytes = key.getBytes(ENCODING_TYPE);
			secretKeySpec = new SecretKeySpec(keyBytes, "AES");
			cipher = Cipher.getInstance(INSTANCE_TYPE);
			ivParameterSpec = new IvParameterSpec(keyBytes);
		} catch(NoSuchPaddingException | NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
	
	public String encrypt(final String str) throws Exception{
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
		byte[] encrypted = cipher.doFinal(str.getBytes(ENCODING_TYPE));
		return new String(Base64.getEncoder().encode(encrypted), ENCODING_TYPE);
	}
	
	public String decrypt(final String str) throws Exception{
		cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
		byte[] decoded = Base64.getDecoder().decode(str.getBytes(ENCODING_TYPE));
		return new String(cipher.doFinal(decoded), ENCODING_TYPE);
	}
	
	private void validation(final String key) {
		Optional.ofNullable(key)
		.filter(Predicate.not(String::isBlank))
		.filter(Predicate.not(s -> s.length() != 16))
		.orElseThrow(IllegalArgumentException::new);
	}
	
	public String Enc(String password) throws Exception {
		return encrypt(password);
	}
	
	public String Dec(String password) throws Exception {
		return decrypt(password);
	}
}

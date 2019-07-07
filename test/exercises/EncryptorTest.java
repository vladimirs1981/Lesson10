package exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EncryptorTest {

	@Test
	void testEncryptOneCharacter() {
		assertEquals("c", Encryptor.encrypt("a"));
	}

	@Test
	void testEncryptWord() throws Exception {
		assertEquals("ccc", Encryptor.encrypt("aaa"));
		assertEquals("Lcxc", Encryptor.encrypt("Java"));
	}
	@Test
	void testDecryptWord() throws Exception{
		assertEquals("Live long and prosper!", Encryptor.decrypt("Nkxg\"nqpi\"cpf\"rtqurgt#"));
	}
	
	
	
}

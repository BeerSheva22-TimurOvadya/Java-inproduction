import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ObectTests {

	@Test
	@Disabled
	void wrapperTest() {

		Integer a = 11;
		Integer b = 11;
		assertEquals(a, b);
		Integer c = 201;
		Integer d = 201;
		assertEquals(c, d);
		assertTrue(a == b);
		assertFalse(c == d);
		assertTrue(c.equals(d));
	}

	@Test
	@Disabled
	void stringTest() {
		String hello = "hello";
		char[] helloAr = hello.toCharArray();
		assertEquals('h', helloAr[0]);
		System.out.println((byte) helloAr[0]);
		assertEquals(5, hello.length());

	}

	@Test
	void isAnagramtTest() {
		String word = "Hello World© 123";
		assertTrue(Strings.isAnagram(word, "Hello World© 123"));
		assertTrue(Strings.isAnagram(word, "321 ©dlroW olleH"));
		assertTrue(Strings.isAnagram(word, "World olelH© 231"));
		assertTrue(Strings.isAnagram(word, "2 drlllWoo©He1 3"));

		assertFalse(Strings.isAnagram(word, ""));
		assertFalse(Strings.isAnagram(word, "1Hello World© 123"));
		assertFalse(Strings.isAnagram(word, "Hello World 123"));
		assertFalse(Strings.isAnagram(word, "hello world© 123"));
		assertFalse(Strings.isAnagram(word, "HELLO WORLD© 123"));
		assertFalse(Strings.isAnagram(word, "HelloWorld©123"));
		assertFalse(Strings.isAnagram(word, "Qwert Yqwert 123"));
		assertFalse(Strings.isAnagram(word, "HellWor23"));
		assertFalse(Strings.isAnagram(word, "HHHeeellllllooo    WWWooorrrlllddd©©©   111222333"));
		assertFalse(Strings.isAnagram(word, "Hello World© 123 Hello World© 123 Hello World© 123"));
	}

	

	@Test
	void sortStringNumbersTest() {
		String[] array0 = { "0", "0", "0", "0", "0", "0", "0", "0" };
		Strings.sortStringNumbers(array0);
		assertArrayEquals(new String[] { "0", "0", "0", "0", "0", "0", "0", "0" }, array0);

		String[] array1 = { "127", "126", "88", "1", "0", "-1", "-128", "-127" };
		Strings.sortStringNumbers(array1);
		assertArrayEquals(new String[] { "-128", "-127", "-1", "0", "1", "88", "126", "127" }, array1);

		String[] array2 = { "127", "-128", "127", "-128", "127", "-128", "127", "-128" };
		Strings.sortStringNumbers(array2);
		assertArrayEquals(new String[] { "-128", "-128", "-128", "-128", "127", "127", "127", "127" }, array2);

		String[] array3 = { "120", "127", "10", "0", "-1", "111", "125", "100" };
		Strings.sortStringNumbers(array3);
		assertArrayEquals(new String[] { "-1", "0", "10", "100", "111", "120", "125", "127" }, array3);

		String[] array4 = { "0", "-111", "1", "-10", "-128", "-1", "-127", "-100" };
		Strings.sortStringNumbers(array4);
		assertArrayEquals(new String[] { "-128", "-127", "-111", "-100", "-10", "-1", "0", "1" }, array4);
	}
	

}

package demo0;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalMaxSubTest {

	@Test
	public void Cal0() {
		int a0[] = new int[] { 1, 1, 1, 1, 1, 1 };// 全正数
		assertEquals(6, new CalMaxSub().Cal(a0));
	}

	@Test
	public void Cal1() {
		int a1[] = new int[] { -1, -1, -1, -1, -1, -1 };// 全负数
		assertEquals(0, new CalMaxSub().Cal(a1));
	}

	@Test
	public void Cal2() {
		int a2[] = new int[] { 1, -1, -1, -1, -1, -1 };// 部分整数
		assertEquals(1, new CalMaxSub().Cal(a2));
	}

	@Test
	public void Cal3() {
		int a3[] = new int[] { -2, 11, -4, 13, -5, -2 };// 标准用例
		assertEquals(20, new CalMaxSub().Cal(a3));
	}
}

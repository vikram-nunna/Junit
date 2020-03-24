package klu.junittest;
import junit.framework.TestCase;
public class TestClass extends TestCase{
	JunitTest obj=new JunitTest();
	public void test1()
	{
		assertEquals("",obj.BringIt(""));
	}
	public void test2()
	{
		assertEquals("",obj.BringIt("A"));
	}
	public void test3()
	{
		assertEquals("BC",obj.BringIt("ABC"));
	}
	public void test4()
	{
		assertEquals("DCE",obj.BringIt("DACE"));
	}
	public void test5()
	{
		assertEquals("B",obj.BringIt("B"));
	}
	public void test6()
	{
		assertEquals("DEFR",obj.BringIt("DEFR"));
	}
}

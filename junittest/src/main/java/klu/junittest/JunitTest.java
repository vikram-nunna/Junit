package klu.junittest;
public class JunitTest {
	public String BringIt(String s)
	{
		if(s=="")
		{
			return s;
		}
		else if(s.length()==1)
		{
			if(s.charAt(0)=='A')
			{
				return "";
			}
			return s;
		}
		else if(s.charAt(0)=='A'&&s.charAt(1)=='A')
		{
			return s.substring(2,s.length());
		}
		else if(s.charAt(0)=='A')
		{
			return s.substring(1,s.length());
		}
		else if(s.charAt(1)=='A')
		{
			return s.substring(0,1)+s.substring(2,s.length());
		} 
			return s;
	}

}

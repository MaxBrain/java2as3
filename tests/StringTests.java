class StringTests
{
	static public boolean compare(String s1, String s2)
	{
		return s1.equals(s2);
	}

	static public boolean compareIgnoreCase(String s1, String s2)
	{
		return s1.equalsIgnoreCase(s2);
	}

	static void append(StringBuffer sb, String s)
	{
		sb.append(s);
	}

	static void append(StringBuilder sb, String s)
	{
		sb.append(s);
	}

	static String SBtoString(StringBuffer sb) 
	{
		return sb.toString();
	}

	static String SBtoString(StringBuilder sb) 
	{
		return sb.toString();
	}

	static StringBuffer newStringBuffer()
	{
		return new StringBuffer();
	}

	static StringBuilder newStringBuilder()
	{
		return new StringBuilder();
	}

	static String integer(int i) {
		return String.valueOf(i);
	}
}

class ExceptionTest
{
	public static void main(String args[])
	{
		String s=null;
		try
		{
			if(s==null)
			{
				throw new Exception("U entered a null string");
			}
			else
			{
				System.out.println("The entered string is"+s);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("The program ios executed successfully");
		}
	}
}		
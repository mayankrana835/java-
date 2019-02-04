class Pack
{
	public void display()
	{
		System.out.println("Test is displayed");
	}}
	class PackDemo
	{
		public static void main(String args[])
		{
			Pack p=null;
			try
			{
				p.display();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}	
			
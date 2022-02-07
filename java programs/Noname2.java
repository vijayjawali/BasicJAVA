class Trimstring 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string to trim");
		String s=scan.nextLine();
		String temp="";
		for(int i=0;i<s.length();i++)
		{
            if(s.charAt(i)!=' ')
			{
				temp+=s.charAt(i);
			}

		}
		System.out.println(s);
	}
}

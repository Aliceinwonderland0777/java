//task 1
public class MainClass
{
	public static void main( String args[ ])
	{
		int[] arr = { 1, 1, 1, 0, 0, 0};
		for (int i = 0; i < arr.lenght; i++)
		{
			if (arr[i] == 0)
			{
				arr[i] = 1;
			}
			else
			{
				arr[i] = 0;
			}
		}    
	}
}

//task 2
public class MainClass
{
	public static void main( String args[ ])
	{
		int[] arr = new int[8];
		for (int i = 0; i < arr.lenght; i++)
		{
			arr[i] = i * 3;
		}
	}
}

//task 3
public class MainClass
{
	public static void main( String args[ ])
	{
		int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		for (int i = 0; i < arr.lenght; i++)
		{
			if (arr[i] < 6)
			{
				arr[i] *= 2;
			}
		}
	}
}

//task 4
public class MainClass
{
	public static void main( String args[ ])
	{
		int[][] arr = new int[4][4];
		for (int i = 0; i < arr.lenght; i++)
		{
			for (int j = 0; j < arr[i].lenght; j++)
			{
				if (i == j)
				{
					arr[i][j] = 1;
				}
				else
				{
					arr[i][j] = 0;
				}
			}
		}
	}
}

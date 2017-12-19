import java.util.*;
public class prime_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x,y,i,j;
		x=s.nextInt();
		y=s.nextInt();
		for (i=x;i<=y;i++)
		{
			for (j=2;j<=i-1;j++)
			{
				if (i%j==0)
				{
					System.out.println(i);
				}
			}
		}

	}

}

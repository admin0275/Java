/**
 *All pattern programs here
 *
 * @author Manivannan
 *
 * First Execute the Program then only u will get the idea about the particular pattern
 * Each Pattern is sepeated 
 */


import java.util.*;
class right
{
	static int n=10;
	public static void rightpattern()
	{
	    int i,k;
	    System.out.println("\t"+"Right Pattern");
	    for(i=0;i<n;i++) /*for process*/
	    {
               for(k=0;k<i+1;k++)
               {
               	System.out.print("*");
               }
               System.out.println();
	    }
	     System.out.println();
	}
	
}
class left
{
	static int n=10;
	public static void leftpattern()
	{
	    int i,j,k;
	    System.out.println("\t"+"Left Pattern");
	    for(i=0;i<n;i++) /*for process*/
	    {
	    	 for(j=(n-1);j>i;j--)
               {
               	System.out.print(" ");
               }
               for(k=0;k<i+1;k++)
               {
               	System.out.print("*");
               }
               System.out.println();
	    }
	    System.out.println();
	}

}
class praymid
{
    static int n=10;
	public static void praymidpattern()
	{
	    int i,j,k;
	    System.out.println("\t"+"praymid Pattern");
	    for(i=0;i<n;i++) /*for process*/
	    {
	    	 for(j=(n-1);j>i;j--)
               {
               	System.out.print(" ");
               }
               for(k=0;k<(2*i+1);k++)
               {
               	System.out.print("*");
               }
               System.out.println();
	    }
	    System.out.println();
	}
}
class diamond
{
	static int n=10;
	public static void diamondpattern()
	{
	    int i,j,k;
	    System.out.println("\t"+"Diamond Pattern");
	    for(i=0;i<n;i++) /*for process*/
	    {
	    	 for(j=(n-1);j>i;j--)
               {
               	System.out.print(" ");
               }
               for(k=0;k<(2*i+1);k++)
               {
               	System.out.print("*");
               }
               System.out.println();
	    }
	    for(i=n-2;i>=0;i--) /*for process*/
	    {
	    	 for(j=n-1;j>i;j--)
               {
               	System.out.print(" ");
               }
               for(k=0;k<(2*i+1);k++)
               {
               	System.out.print("*");
               }
               System.out.println();
	    }
	    System.out.println();
	}
	
}
class between_A
{
	static int n=10;
	public static void between_A_pattern()
	{
		 System.out.println("\t"+"between_A Pattern");
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<((2*i)+1);k++)
			{
                if((k%2)==0)
                {
                	System.out.print("*");
                }
                else if((k%2)!=0)
                {
                	System.out.print("A");
                }
			}
			System.out.println();
		}
	}
}
class pascal
{
	public static void pascal_pattern()
	{
		int n=10;
		int num=1;
		int i,j;
		 System.out.println("\n\t"+"pascal Pattern");
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				if((i==0) | (j==0))
				{
					num=1;
				}
				else 
				{
					num=num*(i-j+1)/j;
				}
				System.out.print(num+"  ");
			}
			System.out.println();
		}
	}

}
class floyids
{
	static int n=10;
	public static void floyids_pattern()
	{
		 System.out.println("\n\t"+"floyids Pattern");
		int i,j,num=1;
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
class floyids_new
{
	static int n=10;
	public static void floyids_new_pattern()
	{
		System.out.println("\n\t"+"floyids New Pattern");
		int i,j,r;
		for(i=0;i<n;i++)
		{
			r=i%2;
			for(j=0;j<=i;j++)
			{
				 r=(r==0) ? 1:0;
				 System.out.print(r+"\t");

			}
			System.out.println();
		}
	}
}
class Number_Bw_Star
{
	public static void Number_Bw_Star_Pattern()
	{
		System.out.println("\n\t"+"Number_Bw_Star_Pattern");
		int i,j,n=10;
		for(i=0;i<n;i++)
		{
			for(j=1;j<=(2*i)+1;j++)
			{
				if((j%2)!=0)
				{
					System.out.print(i+1);
				}
				else if((j%2)==0)
                {
                    System.out.print("*");
                }
			}
			System.out.println();
		}
	}

}
class Floyds_New2
{
	public static void Floyds_New2_Pattern()
	{
		System.out.println("\n\t"+"Floyds_New2_Pattern");
		int n=7,i,j;
		int count=1;
		for(i=1;i<=n;i++)
		{
		    if((i%2)!=0)
		    {
			for(j=1;j<=7;j++)
			{
				if((j>=1) & (j<=6))
				{
					System.out.print(count+" ");
				}
				else if(j==7)
				{
					count+=1;
					System.out.print(count);
					System.out.println();
				}

			}
		    }
		    if((i%2)==0)
		    {
			for(j=1;j<=7;j++)
			{
				if(j==1)
				{
					count+=1;
					System.out.print(count+" ");
					count-=1;
				}
				else if((j>=2) & (j<=7))
				{
					System.out.print(count+" ");
					if(j==7)
					{
						count+=1;
						System.out.println();
					}
				}

			}
		    }
		}
	}
}
class Pattern
{
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        left l=new left();
        right r=new right();
        praymid p=new praymid();
        diamond d=new diamond();
        between_A b=new between_A();
        pascal pp=new pascal();
        floyids f=new floyids();
        floyids_new ff=new floyids_new();
        Number_Bw_Star n=new Number_Bw_Star();
        Floyds_New2 f1=new Floyds_New2();
		l.leftpattern();
		r.rightpattern();
		p.praymidpattern();
		d.diamondpattern();
		b.between_A_pattern();
		pp.pascal_pattern();
		f.floyids_pattern();
		ff.floyids_new_pattern();
		n.Number_Bw_Star_Pattern();
		f1. Floyds_New2_Pattern();

	}
}

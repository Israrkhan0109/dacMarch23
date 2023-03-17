


                       	

/*    patterns

12345
1234
123
12
1
1
12
123
1234
12345


class Patterns
	{
		public static void main(String args[])
		{
			for(int i=5;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				System.out.print(j);
			    System.out.println();
				
			}
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				System.out.print(j);
			    System.out.println();
				
			}
			
			
		}
	}	
	*/	

             //pattern3
 /*
    *
   **
  ***
 ****
*****
*****
 ****
  ***
   **
    *

class Patterns
	{
		public static void main(String args[])
		{
			for(int i=1;i<=5;i++)//row
			{
				for(int j=i;j<5;j++)//space
				{
					System.out.print(" ");
				}	
					for(int k=1;k<=i;k++)//coloumn
					{
					    System.out.print("*");
			    
					}System.out.println();
					
			}
			for(int i=5;i>=1;i--)//row
			{
				for(int j=i;j<5;j++)//space
				{
					System.out.print(" ");
				}	
					for(int k=1;k<=i;k++)//coloumn
					{
					    System.out.print("*");
			    
					}System.out.println();
					
			}
			
			
			
		}
	}*/	
	
	
	
	//ass p1
	
/*class patterns
	{
		public static void main(String args[])
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				 System.out.print(j+" ");
			     System.out.println();
				
			}
		}
	}*/
	
         //ass p2
	
/*class patterns
	{
		public static void main(String args[])
		{
			int alpha=64;
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				 System.out.print((char)(alpha+j)+" ");
			     System.out.println();
				
			}
		}
	}*/
	  
	  
	  //ass p3
	
/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				 System.out.print("* ");
			     System.out.println();
				
			}
		}
	}*/
	
	//ass p4
	
/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				 System.out.print(i+" ");
			     System.out.println();
				
			}
		}
	}*/
	
	         //ass p5
	
/*class patterns
	{
		public static void main(String args[])
		{
			int alpha=64;
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				 System.out.print((char)(alpha+i)+" ");
			     System.out.println();
				
			}
		}
	}*/
	         //ass p6
	
/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=1;i<=5;i++)
			{
				for(int j=4;j>=i;j--)
				 System.out.print("  ");
			    for(int k=1;k<=i;k++)
				 System.out.print(" *");
			     System.out.println();
				
			}
		}
	}*/
	
	//ass p7
	
/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=1;i<=5;i++)
			{
				for(int k=4;k>=i;k--)
				    System.out.print(" ");
			     for(int j=1;j<=i;j++)
				    System.out.print(j+" ");
			        System.out.println();
				
			}
		}
	}*/
	
	//ass p8
	
	                   /*  5
						4 5
					   3 4 5
					  2 3 4 5
					 1 2 3 4 5*/
	
/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=1;i<=5;i++)
			{
				int n=6;
				for(int k=4;k>=i;k--)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
					System.out.print((n-i)+" ");
				    System.out.println();
				
			}
		}
	} */
	
	//vipul sir pattern no.8
	 
	 /*class patterns{
		 public static void main(String[] args){
			 for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= 5; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
			 
		 }
	 }*/
	  
	  //ass p9
	/*  class patterns
	{
		public static void main(String args[])
		{
			int alpha=64;
			for(int i=1;i<=5;i++)
			{
				for(int k=4;k>=i;k--)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
				 System.out.print((char)(alpha+j)+" ");
			     System.out.println();
				
			}
		}
	}*/
	
	//ass p10
	/*  class patterns
	{
		public static void main(String args[])
		{
			int alpha=64;
			for(int i=5;i>=1;i--)
			{
				for(int k=1;k<=i;k++)
					System.out.print(" ");
				for(int j=i;j<=5;j++)
				 System.out.print((char)(alpha+j)+" ");
			     System.out.println();
				
			}
		}
	}*/
	
	//ass p11
	/*class patterns
	{
		public static void main(String args[])
		{
			for(int i=1;i<=5;i++)//row
			{
				for(int j=5;j>i;j--)//space
				{
					System.out.print(" ");
				}	
					for(int k=1;k<=2*i-1;k++)//coloumn
					{
					    System.out.print("*");
			    
					}System.out.print("\n");
					
			}
		}
	}*/
	// ass p12
	/*class patterns
	{
		public static void main(String args[])
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=4;j>=i;j--)
					System.out.print(" ");
				for(int k=1;k<=i;k++)
					System.out.print(i+" ");
				System.out.println();
			}
		}
	}*/
	
	//ass p13
	/*class patterns
	{
		public static void main(String args[])
		{
			int alpha=64;
			for(int i=1;i<=5;i++)
			{
				for(int j=4;j>=i;j--)
					System.out.print(" ");
				for(int k=1;k<=i;k++)
					System.out.print((char)(alpha+i)+" ");
				System.out.println();
			}
		}
	}*/
	
	//ass p14
	/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=5;i>=1;i--)
			{
				for(int k=1;k<=i;k++)
					System.out.print(k+" ");
				System.out.println();
			}
		}
	}*/

//ass p15
/*class patterns
	{
		public static void main(String args[])
		{
			int n=6;
			for(int i=5;i>=1;i--)
			{
				for(int k=1;k<=i;k++)
					System.out.print((n-k)+" ");
				System.out.println();
			}
		}
	}*/
	
	//ass 16
	
	/*class patterns
	{
		public static void main(String args[])
		{
			int n=6;
			for(int i=1;i<=5;i++)
			{
				for(int k=1;k<=i;k++)
					System.out.print((n-k)+" ");
				System.out.println();
			}
		}
	}*/
	
	
	//ass 17
	
	/*class patterns
	{
		public static void main(String args[])
		{
	         int a=1;
			for(int i=1;i<=5;i++)
			{
				for(int k=1;k<=i;k++)
					System.out.print((a++)+" ");
				     
				System.out.println();
			}
		}
	}*/
	//ass 18
	
	/*class patterns
	{
		public static void main(String args[])
		{
			int alpha=64;
			for(int i=5;i>=1;i--)
			{
				for(int k=1;k<=i;k++)
					System.out.print((char)(alpha+k)+" ");
				System.out.println();
			}
		}
	}*/
	
	//ass star p1
	/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=1;i<=5;i++)
			{
				for(int k=1;k<=i;k++)
					System.out.print("*");
				System.out.println();
			}
		}
	}*/
	
	//ass star p2
	/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=1;i<=5;i++)
			{
				
				for (int j=4;j>=i;j--)
					System.out.print(" ");
				for(int k=1;k<=i;k++)
					System.out.print("*");
				System.out.println();
			}
		}
	}*/
	
	//ass star p3
	/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=5;i>=1;i--)
			{
				for(int k=1;k<=i;k++)
					System.out.print("*");
				System.out.println();
			}
		}
	}*/
	
	//ass star p4
	/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=5;i>=1;i--)
			{
				for (int j=5;j>i;j--)
					System.out.print(" ");
				for(int k=1;k<=i;k++)
					System.out.print("*");
				System.out.println();
			}
		}
	}*/
	
	//ass star p5
	/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=1;i<=5;i++)
			{
				for (int j=4;j>=i;j--)
					System.out.print(" ");
				for(int k=1;k<=2*i-1;k++)
					System.out.print("*");
				System.out.println();
			}
		}
	}*/
	
	//ass star p6
	/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=5;i>=1;i--)
			{
				for (int j=4;j>=i;j--)
					System.out.print(" ");
				for(int k=1;k<=2*i-1;k++)
					System.out.print("*");
				System.out.println();
			}
		}
	}*/
	
	// ass star p7
	
	/*class patterns
	{
		public static void main(String args[])
		{
			for(int i=1;i<=4;i++)//row
			{
				for(int j=5;j>i;j--)//space
				{
					System.out.print(" ");
				}	
					for(int k=1;k<=2*i-1;k++)//coloumn
					{
					    System.out.print("*");
			    
					}System.out.print("\n");
					
			}
			for(int i=5;i>=1;i--)//row
			{
				for(int j=i;j<5;j++)//space
				{
					System.out.print(" ");
				}	
					for(int k=1;k<=2*i-1;k++)//coloumn
					{
					    System.out.print("*");
			    
					}System.out.println();
					
			}
			
			
			
		}
	}*/
	
	// ass star p8
	
	/*class patterns
	{
		public static void main(String args[])
		{
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=i;j++)
				System.out.print("*");
			    System.out.println();
				
			}
			for(int i=5;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				System.out.print("*");
			    System.out.println();
				
			}
			
			
		}
	}*/
	
	//ass star p9

	
	
	
	/*class patterns
	{
		public static void main(String args[])
		{
			for(int i=1;i<=4;i++)
			{
				for(int k=i;k<5;k++)//space
				{
					System.out.print(" ");
				}	
				for(int j=1;j<=i;j++)
				System.out.print("*");
			    System.out.println();
				
			}
			for(int i=5;i>=1;i--)
			{
				
				for(int k=i;k<5;k++)//space
				{
					System.out.print(" ");
				}	
				for(int j=1;j<=i;j++)
				System.out.print("*");
			    System.out.println();
				
			}
			
			
		}
	}*/
	
	//ass star 10
	/*class patterns
	{
		public static void main(String args[])
		{
			for(int i=1;i<=5;i++)
			{
				for(int k=4;k>=i;k--)
					System.out.print(" ");
				for(int j=1;j<=5;j++)
					System.out.print("*");
				System.out.println();
			}
		}
	}*/
	
	//ass star 11
	/*class patterns
	{
		public static void main(String args[])
		{
			for(int i=1;i<=5;i++)
			{
				for(int k=1;k<i;k++)
					System.out.print(" ");
				for(int j=1;j<=5;j++)
					System.out.print("*");
				System.out.println();
			}
		}
	}*/
	
	//ass star p12
	/*class patterns
	{
		public static void main(String args[])
		{
			for(int i=5;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				System.out.print("*");
			    System.out.println();
				
			}
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				System.out.print("*");
			    System.out.println();
				
			}
			
			
		}
	}*/
	
	//ass star p13
	
	/*class patterns
	{
		public static void main(String args[])
		{
			for(int i=5;i>=1;i--)
			{
				for(int k=4;k>=i;k--)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
				System.out.print("*");
			    System.out.println();
				
			}
			for(int i=1;i<=5;i++)
			{
				for(int k=4;k>=i;k--)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
				System.out.print("*");
			    System.out.println();
				
			}
			
			
		}
	}*/
	
	
	
	
	  
	 //ass star p14
	
	/*class patterns
	{
		public static void main(String args[])
		{
			for(int i=5;i>=1;i--)
			{
				for(int k=4;k>=i;k--)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
				System.out.print("* ");
			    System.out.println();
				
			}
			for(int i=1;i<=5;i++)
			{
				for(int k=4;k>=i;k--)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
				System.out.print("* ");
			    System.out.println();
				
			}
			
			
		}
	}*/
	
	// ass star p15
	
	/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=1;i<=5;i++)
			{
				for(int k=1;k<=i;k++)
					
				{
					if (i==1 || k==1|| i==k || i==5 || k==5 )
			       System.out.print("*");
				   else
					System.out.print(" ");
				}
				  System.out.println();
			}
		}
	}*/
	
	// ass star p16
	
	/*class patterns
	{
		public static void main(String args[])
		{
			
			for(int i=1;i<=5;i++)
			{
				for(int j=4;j>=i;j--)
					System.out.print(" ");
					
				for(int k=1;k<=i;k++)
					
				{
					if (i==1 || k==1|| i==k || i==5 || k==5 )
			       System.out.print("*");
				   else
					System.out.print(" ");
				}
				  System.out.println();
			}
		}
	}*/
	
	//pyramid pattern1
	
	/*class patterns
	{
		public static void main(String args[])
		{
			for(int i=1;i<=9;i++)
			{
				for(int j=9;j>=i;j--)
					System.out.print(" ");
				for (int k=1;k<=i;k++)
					System.out.print(i+" ");
				System.out.println();
				
			}
		}
	}*/
	
	
	//pyramid pattern 2
	
	/*class patterns
	{
		public static void main(String args[])
		{
			//int n
			for(int i=1;i<=9;i++)
			{
				for(int j=9;j>=i;j--)
					System.out.print(" ");
				for (int k=1;k<=i;k++)
					System.out.print(k+" ");
				System.out.println();
				
			}
		}
	}*/
	
	//pyramid pattern3
	
	/*class patterns
	{
		public static void main(String args[])
		{
			for(int i=1;i<=9;i++)
			{
				for(int j=9;j>=i;j--)
					System.out.print(" ");
				for (int k=1;k<=i;k++)
					System.out.print("* ");
				System.out.println();
				
			}
		}
	}*/
	
	// pyramid pattern 4
	/*class patterns
	{
		public static void main(String args[])
		{
			
			for (int i=1;i<=9;i++)
			{
				for(int j=9;j>=i;j--)
				{
					System.out.print("  ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(k+" ");
				}
				for(int k=i-1;k>=1;k--)
				{
					System.out.print(k+" ");
				}
			System.out.println();
			}
		}
	}*/
	
	// pyramid pattern 5 
	class patterns
	{
		public static void main(String args[])
		{
			int num=10;
			for (int i=1;i<=9;i++)
			{
				for(int j=9;j>=i;j--)
				{
					System.out.print(" ");
				}
				for (int k=9;k>=i;k--)
				{
					System.out.print(k);
				}
				System.out.println();
				
				
				
			}
		}		
	}
	
	
	
	
	
	
	

	
        
	                   
						       
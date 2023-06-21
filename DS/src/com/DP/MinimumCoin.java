package com.DP;


public class MinimumCoin {

		 static int minCoins(int coins[], int m, int w)
		    {
		       
		       if (w == 0) return 0;
		      
		     
		       int resp = Integer.MAX_VALUE;
		      
		     
		       for (int i=0; i<m; i++)
		       {
		         if (coins[i] <= w)
		         {
		             int sub_res = minCoins(coins, m, w-coins[i]);
		      
		           
		             if (sub_res != Integer.MAX_VALUE && sub_res + 1 < resp)
		            	 resp = sub_res + 1;
		         }
		       }
		       return resp;
		    }
		    public static void main(String args[])
		    {
		       int coins[] =  {1,5,6,9};
		       int m = coins.length;
		       int w = 11;
		       System.out.println("Minimum coins  "+ minCoins(coins, m, w) );
		    }
		}	        



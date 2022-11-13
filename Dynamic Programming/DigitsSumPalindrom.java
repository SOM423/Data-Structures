static int isDigitSumPalindrome(int N) {
	        // code here
	        int sum =sum(N);
	        int ans = reverse(sum);
	        if(ans==sum)
	        {
	          return 1;  
	        }
	        return 0;
	    
	    }
	    
	    static int sum(int N)
	    {
	    	if(N==0)
	            return 0;
	        return  (N % 10 + sum(N / 10));
	    }
	    
	    static int reverse(int num)
	    {
	        int reverse=0;
	        while(num!=0)
	        {
	            int rem = num % 10;
	            reverse=reverse*10 +rem;
	            num=num/10;
	        }
	        return reverse;
	    }
	}

class Equilibrium
{
           public static int findEquilibrium(int arr[], int n)
              {
               |add code here.
                int totalSum = 0;
                int leftSum ;
                int rightSum ;
                
                for(int i=0;i<n;i++)
                {
                
                    totalSum += arr[i];|Total sum finding
                    leftSum = 0;
                    
               for(int j=0;j<i;j++)
               
                    leftSum += arr[j];
                    
                    rightSum=0;
                    
                for(int j=i+1;j<n;j++)
                    
                    rightSum += arr[j];
                    
                if(leftSum == rightSum)
                
                return i;
                    
               
              }
              
              return -1;
}

}

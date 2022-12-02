//https://practice.geeksforgeeks.org/problems/check-if-it-is-possible-to-convert-one-string-into-another-with-given-constraints4116/1
class Solution {
    int isItPossible(String S, String T, int N, int M) {
        // code here
        
        //Base case 1
        if(M != N)
        {
            return 0;
        }
        
        int count1=0;
        int count2=0;
        
        for(int i=0;i<N;i++)
        {
            if(S.charAt(i)=='#')
            count1++;             //Counting number of # in first String
        }
        
        for(int i=0;i<M;i++)
        {
            if(T.charAt(i)=='#')
            count2++;             //Counting number of # in Second String
        }
        
        //Base case 2
        
        if(count1 != count2)
        {
            return 0;
        }
        
        //logic Part
        
        int i=0;
        int j=0;
        
        while(i<N && j<M)
        {
            while(i<N && S.charAt(i) =='#')
            i++;
            
            while(j<M && T.charAt(j) =='#')
            j++;
            
            if(i<N && j<M)
            {
                if(S.charAt(i) != T.charAt(j))
                return 0;
                
                else
                {
                    if(S.charAt(i)=='A' && i<j)
                    return 0;
                    if(S.charAt(i)=='B' && i>j)
                    return 0;
                }
            
            }
            i++;
            j++;
        }
        return 1;
    }
};

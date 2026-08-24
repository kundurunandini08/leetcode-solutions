class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0, product=1;
        int p=n;
        while(n>0)
        {
            int r = n%10;
            sum = sum+r;
            product = product*r;
            n=n/10;
        }
        int m = sum+product;
        if(p%m!=0)
            return false;
        return true;
    }
}
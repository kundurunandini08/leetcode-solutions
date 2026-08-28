class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=0;i<32;i++){
            int m = 1<<i;
            if((n&m)!=0)
                count++;
        }
        return count;
    }
}
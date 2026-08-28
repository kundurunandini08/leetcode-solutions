class Solution {
    public int hammingDistance(int x, int y) {
        int m = x^y;
        int count = 0;
        while(m>0)
        {
            m = m&(m-1);
            count++;
        }
        return count;
    }
}
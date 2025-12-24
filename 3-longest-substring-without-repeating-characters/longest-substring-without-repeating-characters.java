class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ma=0;
        for(int i=0;i<s.length();i++){
            int[] h=new int[256];
            for(int j=i;j<s.length();j++){
                if(h[s.charAt(j)]!=0) break;
                h[s.charAt(j)]=1;
                int le=j-i+1;
                ma=Math.max(le,ma);
            }

        }
        return ma;
    }
}
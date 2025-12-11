class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int max=0;
        while(left<right){
            int l=right-left; //width
            int h=Math.min(height[left],height[right]); ///hrigt
            int area=l*h; //area
            if(area>max) max=area;
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }

        }
      return max;  
    }
}
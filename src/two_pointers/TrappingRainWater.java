package src.two_pointers;

public class TrappingRainWater {
    public int trap(int[] height) {
        int res=0;
        int left = 0,right = height.length-1,lm=height[left],rm=height[right],diff;
        while (right>left){
            if(lm<=rm){
                diff = lm-height[left];
                res+=diff;
                lm = lm>height[++left]?lm:height[left];
            }else {
                diff = rm-height[right];
                res+=diff;
                rm = rm>height[--right]?rm:height[right];
            }
        }
        return res;
    }
}

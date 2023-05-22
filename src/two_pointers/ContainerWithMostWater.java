package src.two_pointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0,right = height.length-1,max=0,min,currArea;
        while (right>left){
            min = (height[left]>height[right])?height[right]:height[left];
            currArea=(right-left)*min;
            max = currArea>max?currArea:max;
            while (height[left]<=min&&left<right)left++;
            while (height[right]<=min&&left<right)right--;
        }
        return max;
    }
}

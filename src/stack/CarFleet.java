package src.stack;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position.length<=1)return position.length;
        float[] timeArr = new float[target];
        for (int i = 0; i < position.length; i++) timeArr[position[i]] = (float) (target - position[i]) /speed[i];
        int res = 0;
        float previousTime = 0;
        for (int i = target-1; i >=0 ; i--) {
            float currentTime = timeArr[i];
            if (currentTime > previousTime){
                previousTime = currentTime;
                res++;
            }
        }
        return res;
    }
}

import java.util.Arrays;
public class TestDemo {
	
	  public static int maxArea(int[] height) {
		  
		int l = 0;
		int r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            }
            else {
                --r;
            }
        }
        return ans;



        // int max = 0;
        // int ret = 0;
        // for(int i=0;i<height.length-1;i++) {

            // for(int j=i+1;j<height.length;j++) {

                // if(height[j]>=height[i]) {

                    // ret = height[i];
                // } else {

                    // ret = height[j];
                // }

                // if(ret*(j-i)>max) {

                    // max = ret*(j-i);
                // }
            // }
        // }
        // return max;

    }
	
	public static void main(String[] args) {
		
		int[] arr = {4,3,2,1,4};
		int ret = maxArea(arr);
		System.out.println(ret);
		
	}
}
import java.util.Arrays;
public class TestDemo {
	
	//两数之和
	
	  public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++) {

            for(int j=i+1;j<nums.length;j++) {

                if(target==(nums[i]+nums[j])) {

                    arr[0] = i;
                    arr[1] = j; 
					return arr;
                }
            }
        }
        return arr;

     }
	 
	 // 寻找两个正序数组的中位数
	
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length+nums2.length];

        for(int i=0;i<arr.length;i++) {

            if(i<nums1.length) {

                arr[i] = nums1[i];
            } else {

                arr[i] = nums2[i-nums1.length];
            }
        }
		//排一下序
        Arrays.sort(arr);

        if(arr.length%2==0) {

        return (arr[(arr.length)/2]+arr[(arr.length)/2-1])/2.0;
        }
        return  arr[(arr.length)/2]/1.0;

    }
	
	public static void main(String[] args) {
		
		
		// int[] arr0 = {9,8,7,6,5,4,3,2,1};
		// Arrays.sort(arr0);
	    // System.out.println(Arrays.toString(arr0));
	}
}
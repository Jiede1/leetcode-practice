package src_Jiede1;

public class MedianTwoArray {
	private static final double INT_MIN = Double.NEGATIVE_INFINITY;
	private static final double INT_MAX = Double.POSITIVE_INFINITY;
	/*
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if(nums1.length == 0) return medianR(nums2);
		if(nums2.length == 0) return medianR(nums1);
		return (medianR(nums1)+medianR(nums2))/2.0;
    }
	public double medianR(int[] nums1) {
		if(nums1.length == 0) return 0.0;
		double median=0.0;
		int len=nums1.length-1;
        if(nums1.length%2==0) {
        	median=(nums1[len/2]+nums1[len/2+1])/2.0;
        }
        else {
        	median=nums1[(len+1)/2];
        }
        return median;
	}
	*/
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);
		int L1 = 0,L2 = 0,R1 = 0,R2 = 0,c1=0,c2=0,lo = 0, hi = 2*nums1.length;
		while(lo<=hi) {
			c1 = (lo+hi)/2; 
			System.out.println("c1:"+c1);
            c2 = nums1.length+nums2.length - c1;
			L1=(int) ((c1 == 0)?INT_MIN:nums1[(c1-1)/2]);
			R1 = (int) ((c1 == 2*nums1.length)?INT_MAX:nums1[c1/2]);
            L2 = (int) ((c2 == 0)?INT_MIN:nums2[(c2-1)/2]);
            R2 = (int) ((c2 == 2*nums2.length)?INT_MAX:nums2[c2/2]);
            
            if(L1 > R2)
                hi = c1-1;
            else if(L2 > R1)
                lo = c1+1;
            else
                break;

		}
		System.out.println(L1);
		System.out.println(L2);
		System.out.println(R1);
		System.out.println(R2);
		System.out.println(c1);
		System.out.println(c2);
		return (Math.max(L1,L2)+ Math.min(R1,R2))/2.0;
		
	}
	public static void main(String[] args) {
		int[] nums1= {100,200,300};
		int[] nums2= {1,2,3,50};
		MedianTwoArray a = new MedianTwoArray();
		double median=a.findMedianSortedArrays(nums1,nums2);
		System.out.println(median);
	}
	
}

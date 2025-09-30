class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1 + n2];
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while( i < n1 && j < n2){
            if(nums1[i] >= nums2[j]){
                arr[k++] = nums2[j++] ;
            }else{
                arr[k++] = nums1[i++];
            }
        }

        while(i < n1){
            arr[k++] = nums1[i++] ;
        }

        while(j < n2){
            arr[k++] = nums2[j++] ;
        }

        if(arr.length % 2 == 1) {
            return (double)(arr[arr.length / 2]);
        }
        else{
            //System.out.println(arr[arr.length / 2]+" "+ (arr[arr.length / 2 - 1]));
            double z = (double)(arr[arr.length / 2] + (arr[arr.length / 2 - 1])) / 2 ;
            return z;
        } 
        
    }
}
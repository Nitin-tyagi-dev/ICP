package DAY_2;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = nums1.length;
        for(int i = m - 1; i >= 0; i--){
            nums1[n + i] = nums1[i];
        }

        int j = n , k = 0 , l = 0 ;
        
        while(j  < p && k < n ){
            if(nums1[j] <= nums2[k]){
                nums1[l++] = nums1[j++];
            }
            else{
                nums1[l++] = nums2[k++];
            }
        }

        while(j < p){
            nums1[l++] = nums1[j++];
        }

        while(k < n ){
            nums1[l++] = nums2[k++];
        }
        
    }
    public static void main(String[] args) {
        MergeSortedArrays obj = new MergeSortedArrays();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;
        obj.merge(nums1, m, nums2, n);
        for(int num : nums1){
            System.out.print(num + " ");
        }
    }
}

package DAY_2;

import java.util.PriorityQueue;

public class kthLargestElementArray {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for (int num : nums) {
            minHeap.add(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
 
        return minHeap.peek();
    }
    public static void main(String[] args) {
        kthLargestElementArray obj = new kthLargestElementArray();
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int result = obj.findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}

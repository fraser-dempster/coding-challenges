package leetcodeproblems;

class Solution {
  public static int search(int[] nums, int target) {

    // compare x with the middle element
    // if x matches with the middle element, we retunr the mid index.
    // else if x is greate that the mid element, then x can only lie in the right
    // half subarray after the mid element. So we recur for the right half.
    // else (x is smaller) recur for the left half.

    int leftIndex = 0;
    int rightIndex = nums.length - 1;

    // edge case
    if (nums.length == 0 || nums == null) {
      return -1;
    }

    while (leftIndex <= rightIndex) {
      int middleIndex = leftIndex + ((rightIndex - leftIndex) / 2);

      if (nums[middleIndex] == target)
        return middleIndex;
      else if (target > nums[middleIndex]) {
        leftIndex = middleIndex + 1;
      } else if (target < nums[middleIndex]) {
        rightIndex = middleIndex - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] nums = new int[] { -1, 0, 3, 5, 9, 12 };
    search(nums, 9);
  }
}

//
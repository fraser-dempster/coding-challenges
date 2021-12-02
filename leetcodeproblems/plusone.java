package leetcodeproblems;

class Solution {
  public int[] plusOne(int[] digits) {

    // reverse for loop
    // add 1 to end of array
    // if 9 then go back one and increment one there
    //

    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;

    }

    int[] newArray = new int[digits.length + 1];
    newArray[0] = 1;

    return newArray;
  }
}
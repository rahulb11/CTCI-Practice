//problem
//check if a string is permutation of another

//examples
//input0: perftesting, testperfing
//output0: true
//input1: perftesting, qatesting
//output1: false

//strategy
//take one string, go over each element, and build a count array
//take another string, go over each element, and decrement the count array
//now, go over the count array, if any of the element is non-zero, return false
//else in the end, return true

public class IsPermutation {
	boolean isPermutation(String str1, String str2) {
		int[] count_arr = new int[128];
		
		for(int i = 0; i < str1.length(); i++) {
			count_arr[str1.charAt(i)]++;
		}
		
		for(int i = 0; i < str2.length(); i++) {
			count_arr[str2.charAt(i)]--;
		}
		
		for(int x : count_arr) {
			if(x != 0) {
				return false;
			}
		}
		return true;
	}
}

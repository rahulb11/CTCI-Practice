
public class AllUnique {
	boolean isAllUnique(String str) {
		int[] arr = new int[128];
		
		for(int i = 0; i < str.length(); i++) {
			if(arr[str.charAt(i)] > 0) {
				return false;
			}
			arr[str.charAt(i)]++;
		}
		
		return true;
	}
}

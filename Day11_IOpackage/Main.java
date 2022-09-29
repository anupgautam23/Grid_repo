package Day11_IOpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	
	public static String rMax(String[] str) {
		 HashMap<Integer, ArrayList<String>> words_length = new HashMap<Integer, ArrayList<String>>();
	        for (String word : str) {
	            int length = word.length();
	            if (words_length.containsKey(length)) {
	                words_length.get(length).add(word);
	            } else {
	                ArrayList<String> temp = new ArrayList<String>();
	                temp.add(word);
	                words_length.put(length, temp);
	            }
	        }
	        Object keys[] = words_length.keySet().toArray();
	        Integer sorted[] = new Integer[words_length.size()];
	        for (int x = 0; x < keys.length; x++) {
	            sorted[x] = (Integer)keys[x];
	        }
	        Arrays.sort(sorted);
	        ArrayList<String> results = new ArrayList<String>();
	        for (int x = sorted.length - 1; x >= 0; x--) {
	            ArrayList<String> temp = words_length.get(sorted[x]);
	            for (String word : temp) {
	                results.add(word);
	            }
	        }
	        return results.get(0);
		
		
	}
	
	public static boolean rPallindrome(String str) {
		 int left = 0, right = str.length() - 1;
	        
	        while(left < right)
	        {
	            if(str.charAt(left) != str.charAt(right))
	            {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
		}
	public static int rSorted(int[] arr,int n) {
		 if (n == 1 || n == 0)
	            return 1;
	 
	        
	        if (arr[n - 1] < arr[n - 2])
	            return 0;
	 
	        
	        return rSorted(arr, n - 1);
	}

	public static void main(String[] args) {
	
		String[] strings = {"Ram","Shyam","Arjun"};
		
		String  maxStr = rMax(strings);
		System.out.println(maxStr);
/*----------------------------------------------------------*/		
		boolean result = rPallindrome("naman");
		System.out.println(result);
/*----------------------------------------------------------*/
		 int arr[] = { 76, 19, 23, 44, 98, 100 };
	        int n = arr.length;
	        if (rSorted(arr,n) != 0)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
		
	}

	

}

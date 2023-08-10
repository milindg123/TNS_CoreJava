package org.tnsif.singledimensionalarray;

public class ArrayOfObjectExecutor {

	public static void main(String[] args) {
		Student arr[] = new Student[3];
		arr[0] = new Student(101, "Milind Ghegadmal",50000.0);
		arr[1] = new Student(103, "Mayur Dehade",60000.0);
		arr[2] = new Student(104, "Dipak Bhide",90000.0);
		
		// Printing the values by using -->  getters method
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getsId()+ " " +arr[i].getName() + " "+arr[i].getSalary());
		}

	}

}


//class Solution {
//    public boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()){
//            return false;
//        }
//        
//        int[] freq = new int [26];
//        for(int i = 0; i<s.length(); i++){
//            freq[s.charAt(i) - 'a']++;
//            freq[t.charAt(i) - 'a']--;
//        }
//        
//        for(int i = 0; i<freq.length; i++){
//            if (freq[i] != 0){
//                return false;
//            }
//        }
//        return true;
//   
// }
//}
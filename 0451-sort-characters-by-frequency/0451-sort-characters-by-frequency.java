class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())  //putting all characters with their frequency
            map.put(c, map.getOrDefault(c, 0) + 1);
						
        List<Character> [] bucket = new List[s.length() + 1]; // formed an array of type arraylist
        for (char key : map.keySet()) { //traversing map to get frquency.
            int frequency = map.get(key);  //getting freq. of char
            if (bucket[frequency] == null) bucket[frequency] = new ArrayList<>(); //in place of freq.  in bucket initializing arraylist
            bucket[frequency].add(key); // and adding char at freq. position
        }
				
        StringBuilder sb = new StringBuilder(); 
        for (int pos = bucket.length - 1; pos >= 0; pos--) //cause we have to print higher freq. char 1st
            if (bucket[pos] != null) //index where char exist
                for (char c : bucket[pos])  //accesing the char
                    for (int i = 0; i < pos; i++)  // accesing char freq. times
                        sb.append(c); // storing them in sb

        return sb.toString(); 
    }
}
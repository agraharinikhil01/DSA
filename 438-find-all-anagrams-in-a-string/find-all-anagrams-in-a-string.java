class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> r = new ArrayList<>();
        if(p.length() > s.length())
         return r;
         int[] countP = new int[26];
         int[] countS = new int[26];
         for (int i = 0; i < p.length(); i++){
            countP[p.charAt(i) - 'a']++;
            countS[s.charAt(i) - 'a']++;

         }
         if (Arrays.equals(countP, countS))
         r.add(0);
         for(int i = p.length(); i < s.length(); i++){
            countS[s.charAt(i) - 'a']++;
            countS[s.charAt(i - p.length()) - 'a']--;
            if (Arrays.equals(countP, countS))
            r.add(i - p.length() + 1);
         }
         return r;


           
    }
}
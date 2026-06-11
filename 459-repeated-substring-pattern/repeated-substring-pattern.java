class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int l = 1; l <= n / 2; l++){
            if (n % l == 0){
                String sub = s.substring(0, l);
                String str = "";
                for (int i = 0; i < n / l; i++){
                    str += sub;
                }
                if(str.equals(s))
                return true;
            }

           
        }
        return false;
    }
}
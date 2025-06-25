class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j< s.length() ; j++){
                String sub = s.substring(i , j+1);
                if(isPalindrome(sub)){
                    if(sub.length() > longest.length()){
                        longest = sub;
                    }
                }
            }
        }
        return longest ; 
    }
    public boolean isPalindrome(String sub){
        int left = 0 ;
        int right = sub.length() - 1 ;
        while(left < right){
            if(sub.charAt(left) != sub.charAt(right)){
                return false ; 
            }
            left++ ;
            right-- ;
        }
        return true;
    }
}

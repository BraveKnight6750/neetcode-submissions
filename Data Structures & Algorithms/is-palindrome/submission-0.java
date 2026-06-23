class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char orig[] = s.toCharArray();
        ArrayList<Character> ar = new ArrayList<>();
        for (char c : orig){
            if ((""+c).matches("^[a-zA-Z0-9]+$")){
                ar.add(c);
            }
        }


        for (int i =0 ; i < ar.size() / 2; i++){
            if (ar.get(i) != ar.get(ar.size()-i-1)){
                return false;
            }
        }
        return true;
    }
}

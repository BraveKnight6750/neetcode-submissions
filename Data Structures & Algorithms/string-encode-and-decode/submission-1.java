class Solution {

    public String encode(List<String> strs) {
        String s = "";
        for (int i = 0; i < strs.size(); i++){
            
            s += strs.get(i).length() + ":" + strs.get(i);
        } 
        return s;
    }

    public List<String> decode(String str) {
        List<String> s = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int dot = str.indexOf(':', i);
            int n = Integer.parseInt(str.substring(i, dot));
            i = dot + 1;
            String builder = str.substring(i, i + n);
            s.add(builder);
            i += n;
        }
        return s;
    }
}

class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z') sb.append(ch);
            if(ch == '*'){
                if(sb.length() != 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            if(ch == '#') sb.append(sb);
            if(ch == '%') sb.reverse();
        }
        return sb.toString();
    }
}
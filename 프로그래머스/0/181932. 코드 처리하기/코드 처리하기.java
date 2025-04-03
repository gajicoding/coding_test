class Solution {
    public String solution(String code) {
        String ret = "";
        
        boolean mode = false;
        for(int i=0; i<code.length(); i++){
            char c = code.charAt(i);
            if(c == '1') {
                mode = !mode;
                continue;
            }
            
            if(!mode && i%2==0){
                ret += c;
            } else if(mode && i%2==1){
                ret += c;
            }
        }
        
        if(ret.isEmpty()){
            return "EMPTY";
        } else {
            return ret;
        }
    }
}
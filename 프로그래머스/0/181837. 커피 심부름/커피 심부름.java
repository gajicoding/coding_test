class Solution {
    public int solution(String[] order) {
        int total = 0;
        
        for (String o : order) {
            total += (o.contains("americano") || o.equals("anything")) ? 4500 : 5000;
        }
        
        return total;
    }
}
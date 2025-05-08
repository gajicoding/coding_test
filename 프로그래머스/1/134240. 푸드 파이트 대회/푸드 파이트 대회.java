class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for(int i=0; i<food.length; i++){
            if(food[i]/2 > 0){
                answer.append(String.valueOf(i).repeat(food[i]/2));
            }
        }
        
        return answer + "0" + new StringBuilder(answer).reverse();
    }
}
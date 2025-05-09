import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        
        for (int i=0; i<score.length; i++) {
            maxHeap.offer(score[i]);
            
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
            
            answer[i] = maxHeap.peek();
        }
        
        return answer;
    }
}
class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            heap.add(arr[i]);
        }
        int max1;
        int max2;
        while(heap.size()>1){
            max1=heap.poll();
            max2=heap.poll();
            if(max1!=max2){
                heap.add(max1-max2);
            }
        }
            if(heap.size()==0) return 0;
            else return heap.poll();
    }
}
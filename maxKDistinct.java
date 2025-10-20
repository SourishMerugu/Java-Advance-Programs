class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int[] dup = nums; 
        Set<Integer> unq = new HashSet<>();
        for (int num : dup) {
            unq.add(num);
        }
        List<Integer> list = new ArrayList<>(unq);
        Collections.sort(list, Collections.reverseOrder());
        int limit = Math.min(k, list.size());
        int[] result = new int[limit];
        for (int i = 0; i < limit; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

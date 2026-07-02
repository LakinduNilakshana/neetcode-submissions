class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashTable = new HashSet<>();

        for (int num : nums) {
            if (hashTable.contains(num)) {
                return true;
            }
            hashTable.add(num);
        }

        return false;
    }

}
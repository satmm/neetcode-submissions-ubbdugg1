class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;
            List<String> group = new ArrayList<>();

            for (int j = i; j < strs.length; j++) {

                if (visited[j]) continue;

                char[] a = strs[i].toCharArray();
                char[] b = strs[j].toCharArray();

                Arrays.sort(a);
                Arrays.sort(b);

                if (Arrays.equals(a, b)) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            result.add(group);
        }

        return result;
    }
}
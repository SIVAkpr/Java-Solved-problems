import java.util.*;

class leetSolution {
    public void main(String[] args) {
        String[] a = { "IEO", "Sgizfdfrims", "QTASHKQ", "Vk", "RPJOFYZUBFSIYp", "EPCFFt", "VOYGWWNCf", "WSpmqvb" };
        int[] b = { 17233, 32521, 14087, 42738, 46669, 65662, 43204, 8224 };
        sortPeople(a, b);
    }

    public void sortPeople(String[] names, int[] heights) {
        String[] n = names;
        int[] h = heights;
        int l = n.length;
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < l; i++) {
            map.put(h[i], n[i]);
        }
        Arrays.sort(h);
        String[] ans = new String[l];
        for (int i = 0; i < l; i++) {
            ans[i] = map.get(h[l - i - 1]);
        }
        System.out.println(ans);
    }
}
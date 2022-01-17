package javaExD;

// List
// Map
// HashMap
class Solution {
    public void solution(String[] id_list, String[] report, int k) {
        int[] cnt = new int[id_list.length];
        int[] result = new int[id_list.length];
        String[] tmp = new String[report.length];
        String[] comTmp = new String[report.length];
        String[] str = new String[2];

        for(int i = 0; i < report.length; i++) {
            str = report[i].split(" ");
            tmp[i] = str[0];
            comTmp[i] = str[1];
        }

        for(int i = 0; i < report.length; i++) {
            for(int j = 0; j < id_list.length; j++){
                if(id_list[j].equals(comTmp[i])) {
                    cnt[j]++;
                }
            }
        }

        for(int i = 0; i < report.length; i++) {
            System.out.println(tmp[i]);
        }

        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] >= k) {

            }
        }

//        int[] answer = {};
//        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo","muzi neo", "apeach muzi"};
        int k = 2;
        Solution s = new Solution();
        s.solution(id_list, report, k);
    }
}
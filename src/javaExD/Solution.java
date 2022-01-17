package javaExD;

import java.util.Arrays;

class Solution {
    public void solution(String[] id_list, String[] report, int k) {
        int[] cnt = new int[id_list.length];
        int[] result = new int[id_list.length];
        String[] str = {};

        for(int i = 0; i < report.length; i++) {
            str = report[i].split(" ");

            for(int j = 0; j < id_list.length; j++) {
                if(id_list[j].equals(str[1])) {
                    cnt[j]++;
                }
            }

//            for(int j = 0; j < str.length; j++) {
//                System.out.println("split[" + j + "] : " + str[j]);
//            }
        }

        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] >= k) {

            }
            System.out.println(cnt[i]);
        }

//        int[] answer = {};
//        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo","muzi neo", "apeach muzi"};
        String[] str = report[0].split(" ");
        System.out.println(str[1]);
        System.out.println("report 시작 : " + report[0]);
        int k = 2;
        Solution s = new Solution();
        s.solution(id_list, report, k);
    }
}
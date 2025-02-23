package com.algorithm.inflearn.y2021.m9.d21;

import java.util.Scanner;

public class Main1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String c = sc.next();
        System.out.println(solution(str, c));
    }

    public static int solution(String str, String c) {
        int answer = 0;
        int idx = -1;
        str = str.toLowerCase();
        c = c.toLowerCase();
        while(str.indexOf(c, idx + 1) != -1) {
            answer++;
            idx = str.indexOf(c, idx + 1);
        }

        return answer;
    }
}

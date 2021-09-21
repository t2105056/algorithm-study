package com.algorithm.day22;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i = 0 ; i < n; i++) {
            words[i] = sc.next();
        }
        solution(words);
    }

    public static String solution(String[] words) {
        String answer = null;
        for(String word : words) {
            StringBuffer sb = new StringBuffer(word);
            System.out.println(sb.reverse().toString());
        }
        return answer;
    }
}



//package com.kys.study01.mathexam;
//
////public class Main {
////    public static void main(String[] args) {
////        String str = """
////        special characters
////        [\\n,\\",\\\\] is very important.
////        """;
////
////        System.out.println(str);
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int x = sc.nextInt();
////        System.out.println(String.format("%o", x));
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int x = sc.nextInt();
////        System.out.println(String.format("%x", x));
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int x = sc.nextInt();
////        System.out.println(String.format("%X", x));
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        String a = sc.nextLine();
////        int x = Integer.valueOf(a, 8);
////        sc.close();
////        System.out.println(String.format("%d", x));
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        String a = sc.nextLine();
////        int x = Integer.valueOf(a, 16);
////        sc.close();
////        System.out.println(String.format("%o", x));
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        char x = sc.next().charAt(0);
////        System.out.println((int)x);
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int x = sc.nextInt();
////        System.out.println((char)x);
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        long x = sc.nextInt();
////        long y = sc.nextInt();
////        System.out.println(x + y);
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        String date[] = sc.next().split("\\.");
////        int y = Integer.parseInt(date[0]);
////        int m = Integer.parseInt(date[1]);
////        int d = Integer.parseInt(date[2]);
////        System.out.println(String.format("%04d.%02d.%02d", y, m, d));
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        String word = sc.next();
////        for(int i = 0; i < word.length(); i++)
////        {
////            System.out.println("'" + word.charAt(i) + "'");
////        }
////    }
////}
////
////
////public class Main {
////    public static void main(String[] args) {
////        int lengthTop = 5;
////        int lengthBottom = 10;
////        int height = 7;
////
////        System.out.println((lengthTop + lengthBottom) * height * 2.0);
////        System.out.println((lengthTop + lengthBottom) * height * 1.0 / 2);
////        System.out.println((double) (lengthTop + lengthBottom) * height / 2);
////        System.out.println((double) ((lengthTop + lengthBottom) * height / 2));
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////
////        System.out.println(a+b);
////        System.out.println(a-b);
////        System.out.println(a*b);
////        System.out.println(a/b);
////        System.out.println(a%b);
////        System.out.println(String.format("%.2f", Math.round(((double) a/b) * 100) / 100.0));
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////        int c = sc.nextInt();
////
////        System.out.println(a+b+c);
////        System.out.println(String.format("%.1f", Math.round((((double) a+b+c)/3) * 100) / 100.0));
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////
////        if ((a == 0) && (b == 0)){
////            System.out.println(1);
////        }
////        else
////            System.out.println(0);
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        double h = sc.nextInt();
////        double b = sc.nextInt();
////        double c = sc.nextInt();
////        double s = sc.nextInt();
////
////        double rs = (h * b * c * s)/8/1024/1024;
////
////        System.out.println(String.format("%.1f MB", Math.round(rs * 100) / 100.0));
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int a;
////        int b;
////
////        a = sc.nextInt();
////        b = sc.nextInt();
////
////        long result = 1;
////
////        for (int i=0;i<b;i++) {
////            result *= a;
////        }
////        System.out.println(result);
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////
////        if ( a % 400 == 0 || (a % 4 == 0 && a % 100 != 0) ) {
////            System.out.println("Leap");
////        } else {
////            System.out.println("Normal");
////        }
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////
////        if (a < 90) {
////            while (a < 90) {
////                b++;
////                a += 5;
////            }
////        }
////        System.out.println(b);
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) throws Exception {
////        Scanner sc = new Scanner(System.in);
////        int hour = sc.nextInt(); //시
////        int min = sc.nextInt(); //분
////
////        if (hour < 0 || hour >= 24) {
////            throw new Exception(String.format("시간은 0~23", hour));
////        } else if (min < 0 || min >= 60) {
////            throw new Exception(String.format("분은 0~59", min));
////        }
////
////        min -= 30;
////        if (min < 0) {
////            if (hour <= 0){
////                hour = 23;
////            }else {
////                hour--;
////            }
////            //hour = (hour <= 0) ? 23 : --hour;
////            min += 60;
////        }
////        System.out.println(String.format("%d %d", hour, min));
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) throws Exception {
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
//////        int n = a / 10; // 1
//////        int n2 = a % 10; // 10
//////        int c = n2 * 10 + n;
//////        int c2 = c * 2;
////// int b
////        int b = (((a % 10) * 10) + (a / 10)) * 2;
////
////        if (b >= 100){
////            b -= 100;
////        }
////        System.out.println(b);
////
////        if (b <= 50){
////            System.out.println(String.format("GOOD"));
////        }
////        else if (b > 50) {
////            System.out.println(String.format("OH MY GOD"));
////        }
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) throws Exception {
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////        int r1 = a + b;
////        int r2 = b + a;
////        int r3 = a - b;
////        int r4 = b - a;
////        int r5 = a * b;
////        int r6 = b * a;
////        int r7 = a / b;
////        int r8 = b / a;
////        double r9 = Math.pow(a,b);
////        double r10 = Math.pow(b,a);
////
////        double array[] = {r1, r2, r3, r4, r5, r6, r7, r8, r9, r10};
////        double max = array[0];
////        for(int i = 0; i < array.length; i++) {
////            if(max < array[i]) {
////                max = array[i];
////            }
////        }
////
//////        double max = r1;
//////        max = Math.max(max, r2);
//////        max = Math.max(max, r3);
//////        max = Math.max(max, r4);
//////        max = Math.max(max, r5);
//////        max = Math.max(max, r6);
//////        max = Math.max(max, r7);
//////        max = Math.max(max, r8);
//////        max = Math.max(max, r9);
//////        max = Math.max(max, r10);
////
////        System.out.println(String.format("%.6f", max));
////    }
////}
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////
////        if (((a%4 == 0 && a%100 != 0) || a%400 == 0) && b == 2) {
////            System.out.println("29");
////        }
////        else if (!((a%4 == 0 && a%100 != 0) || a%400 == 0) && b == 2){
////            System.out.println("28");
////        }
////        else if(b == 4 || b == 6 || b == 9 || b == 11){
////            System.out.println("30");
////        }
////        else if(b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12) {
////            System.out.println("31");
////        }
////    }
////}
////
////
////
////import java.io.BufferedWriter;
////import java.io.IOException;
////import java.io.OutputStreamWriter;
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) throws IOException {
////        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8")); // 자바 한글 변환
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////        int c = sc.nextInt();
////
////        if (a == b && b == c){
////            bw.write(String.format("정삼각형"));
////        }
////        else if (c < a + b){
////            if (a == b || b == c || a == c){
////                bw.write(String.format("이등변삼각형"));
////            }
////            else if ((a*a)+(b*b) == (c*c)){
////                bw.write(String.format("직각삼각형"));
////            }
////            else {
////                bw.write(String.format("삼각형"));
////            }
////        }
////        else
////            bw.write(String.format("삼각형아님"));
////        bw.flush();
////    }
////}
////
////
////
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner scan = new Scanner(System.in);
////        int[] a = new int[7];
////        int[] b = new int[6];
////        int res = 0;
////        int bonus = 0;
////
////        for(int i = 0; i < 7; i++){
////            a[i] = scan.nextInt();
////        }
////        for(int i = 0; i < 6; i++){
////            b[i] = scan.nextInt();
////        }
////        for(int i = 0; i < 6; i++){
////            for(int j = 0; j < 6; j++){
////                if(a[i] == b[j]){
////                    res++;
////                }
////            }
////        }
////        for(int i = 0; i < 1; i++){
////            for(int j = 0; j < 6; j++){
////                if(a[6] == b[j]){
////                    bonus++;
////                }
////            }
////        }
////        if(res == 6){
////            System.out.print("1");
////        } else if(res + bonus == 6 ){
////            System.out.print("2");
////        } else if(res == 5){
////            System.out.print("3");
////        } else if(res == 4){
////            System.out.print("4");
////        } else if(res == 3){
////            System.out.print("5");
////        } else{
////            System.out.print("0");
////        }
////    }
////}
////
////
////import java.io.BufferedWriter;
////import java.io.IOException;
////import java.io.OutputStreamWriter;
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) throws IOException {
////        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
////        Scanner sc = new Scanner(System.in);
////        double h = sc.nextDouble();
////        double w = sc.nextDouble();
////        double nw = (h - 100) * 0.9;
////        double b = (w - nw) * 100 / nw;
////
////        if (b <= 10){
////            bw.write("정상");
////        }
////        else if (b > 10 && b <= 20){
////            bw.write("과체중");
////        }
////        else {
////            bw.write("비만");
////        }
////        bw.flush();
////    }
////}
////
////import java.io.*;
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) throws IOException {
////        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int m = sc.nextInt();
////        Grade[] arr = new Grade[n];
////
////        for (int i = 0; i < n; i++){
////            Grade grade = new Grade();
////            grade.name = sc.next();
////            grade.score = sc.nextInt();
////            arr[i] = grade;
////        }
////        for (int i = arr.length - 1; i > 0; i--) {
////            for (int j = 0; j < i; j++) {
////                if (arr[j].score < arr[j + 1].score) {
////                    Grade grade = arr[j];
////                    arr[j] = arr[j + 1];
////                    arr[j + 1] = grade;
////                }
////            }
////        }
////        for (int i = 0; i < m; i++) {
////            bw.write(arr[i].name + "\n");
////        }
////        sc.close();
////        bw.flush();
////    }
////}
////class Grade {
////    public String name;
////    public int score;
////}
//
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) throws Exception {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int m = sc.nextInt();
////        Student[] students = new Student[n];
////
////        for (int i = 0; i < students.length; i++){
////            String name = sc.next();
////            int score = sc.nextInt();
////
////            students[i] = new Student();
////            students[i].setName(name);
////            students[i].setScore(score);
////        }
////
////        for (int i = 0; i < students.length; i++){
////            for (int j = i; j < students.length; j++){
////                if(students[i].getScore() < students[j].getScore()){
////                    String tempName = students[i].getName();
////                    int tempScore = students[i].getScore();
////
////                    students[i].setName(students[j].getName());
////                    students[i].setScore(students[j].getScore());
////
////                    students[j].setName(tempName);
////                    students[j].setScore(tempScore);
////                }
////            }
////        }
////
////        for (int i = 0; i < m; i++) { // for (Student student : students)
////            System.out.println(students[i]);
////        }
////    }
////}
//
////import lombok.Getter;
////import lombok.Setter;
////
////import java.util.Scanner;
////
////@Getter
////@Setter
////public class Main extends Object {
////
////    private String name;
////    private int score;
////
////    @Override
////    public String toString() {
////        return String.format("이름 : %s, 점수 : %d, 주소 : %s", name, score, super.toString());
////    }
////
////    public static void main(String[] args) {
////
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int m = sc.nextInt();
////        Main[] students = new Main[n];
////
////        for (int i = 0; i < students.length; i++){
////            String name = sc.next();
////            int score = sc.nextInt();
////
////            students[i] = new Main();
////            students[i].setName(name);
////            students[i].setScore(score);
////        }
////
////        for (int i = 0; i < students.length; i++){
////            for (int j = i; j < students.length; j++){
////                if(students[i].getScore() < students[j].getScore()){
////                    String tempName = students[i].getName();
////                    int tempScore = students[i].getScore();
////
////                    students[i].setName(students[j].getName());
////                    students[i].setScore(students[j].getScore());
////
////                    students[j].setName(tempName);
////                    students[j].setScore(tempScore);
////                }
////            }
////        }
////
////        for (int i = 0; i < m; i++) { // for (Student student : students)
////            System.out.println(students[i]);
////        }
////    }
////}
//
///*
//import java.io.*;
//import java.util.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        Student[] students = new Student[n];
//        int size = 0;
//
//        for (int i = 0; i < n; i++) {
//            String name = sc.next();
//            int score = sc.nextInt();
//            students[i] = new Student(score, name);
//            size++;
//        }
//
//        Arrays.sort(students, 0, size, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return Integer.compare(s2.no, s1.no);
//            }
//        });
//
//        for (int i = 0; i < m; i++) {
//            bw.write(students[i].name + "\n");
//        }
//
//        bw.flush();
//    }
//}
//class Student {
//    int no;
//    String name;
//
//    Student(int no, String name) {
//        this.no = no;
//        this.name = name;
//    }
//}*/
//
//import java.io.*;
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
//        Scanner sc = new Scanner(System.in);
//
//        // 첫 번째 줄에 입력 데이터의 개수 n
//        int n = sc.nextInt();
//        int m = sc.nextInt(); // 출력할 학생 수
//        sc.nextLine(); // 개행 문자 처리
//
//        // 최대 n개의 데이터를 저장할 배열
//        Student[] students = new Student[n];
//        int size = 0; // 현재 배열에 저장된 데이터 개수
//
//        // n개의 데이터 입력
//        for (int i = 0; i < n; i++) {
//            String name = sc.next();
//            int score = sc.nextInt();
//            students[i] = new Student(score, name);
//            size++;
//        }
//
//        // 점수를 기준으로 내림차순 정렬
//        Arrays.sort(students, 0, size, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return Integer.compare(s2.no, s1.no); // 내림차순 정렬
//            }
//        });
//
//        // 정렬된 순서대로 m개의 학생 이름 출력
//        for (int i = 0; i < m; i++) {
//            bw.write(students[i].name + "\n");
//        }
//
//        bw.flush();
//    }
//}
//class Student {
//    int no;
//    String name;
//
//    Student(int no, String name) {
//        this.no = no;
//        this.name = name;
//    }
//}

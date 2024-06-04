package com.kys.study01.mathexam;

public class MathExam {
    public int subTest001(int n1, int n2) throws Exception {
        if(n1 < -50000 || n1 > 50000){
            throw new Exception("num1 값은 -50000보다 작거나 50000보다 큽니다.");
        }
        if(n2 < -50000 || n2 > 50000){
            throw new RuntimeException("num2 값은 -50000보다 작거나 50000보다 큽니다.");
        }
        return n1 - n2;
    }

    public int mathTest002(int n1, int n2) throws Exception {
        if(n1 < 0 || n1 > 100){
            throw new Exception("num1 값은 0 ~ 100 사이의 값이어야 합니다.");
        }
        if(n2 < 0 || n2 > 100){
            throw new Exception("num2 값은 0 ~ 100 사이의 값이어야 합니다.");
        }
        return n1 * n2;
    }

    public int mathTest004(int n1, int n2) throws Exception {
        if(n1 < 0 || n1 > 10000){
            throw new Exception("num1 값은 0 ~ 10000 사이의 값이어야 합니다.");
        }
        if(n2 < 0 || n2 > 10000){
            throw new Exception("num2 값은 0 ~ 10000 사이의 값이어야 합니다.");
        }
        return n1 == n2 ? 1 : -1;
    }

    public int exam120585(int[] array, int heigth) throws Exception {
        if(array == null || array.length <= 0 || array.length > 100){
            throw new Exception(String.format("array는  null이 아니고, 길이가 1~100 이어야합니다"));
        }
        if(heigth <= 0 || heigth > 200){
            throw new Exception(String.format("height [%d]는 1~200 이어야합니다", heigth));
        }
        int result = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] <= 0 || array[i] > 200){
                throw new Exception(String.format("array[%d] = [%d]는 1~200 이어야합니다", i, array[i]));
            }
            if (array[i] > heigth){
                // 키 큰 사람 누적
                result++;
            }
        }
        return result;
    }

    public int exam120818(int price) throws Exception {
        if(price <= 10 || price >= 1000000){
            throw new Exception(String.format("price 값은 10 ~ 1000000 사이의 값이어야 합니다."));
        }
        if(price % 10 != 0){
            throw new Exception(String.format("price 값은 10원 단위로(1의 자리가 0) 주어집니다."));
        }
        if(price >= 100000){
            price = (price * (95 % 100));
        }
        if(price >= 100000 || price <= 300000){
            price = (price * (90 % 100));
        }
        if(price <= 500000){
            price = (price * (80 % 100));
        }
        return price;
    }
}

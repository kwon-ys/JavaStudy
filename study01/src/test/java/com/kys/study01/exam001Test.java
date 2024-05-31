package com.kys.study01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class exam001Test {
    @Test
    public void subtract001() throws Exception {
        // given    테스트하기 위한 준비 동작
//        int num1 = 2;
//        int num2 = 3;
//        int expected = -1;
        // when     테스트를 실시
//        int actual = subTest001(num1, num2);
        // then     실제값과 기대값을 비교해서 테스트한다.
        assertThat(-1).isEqualTo(subTest001(2, 3));
        assertThat(98).isEqualTo(subTest001(100, 2));
        assertThat(3).isEqualTo(subTest001(10, 7));
        assertThat(10).isLessThan(subTest001(100, 70)); // 답이 30보다 작으면 통과
        assertThat(301).isGreaterThan(subTest001(1000, 700)); //답이 300보다 크면 통과

        //예외가 발생해야지만 정상 동작으로 인식한다.
        assertThatThrownBy(() -> subTest001(70000, 7)).isInstanceOf(Exception.class);
        Throwable exception = assertThrows(RuntimeException.class, () -> {
           subTest001(2330, 50002);
        });
        System.out.println(exception.toString());
    }
    int subTest001(int n1, int n2) throws Exception {
        if(n1 < -50000 || n1 > 50000){
            throw new Exception("num1 값은 -50000보다 작거나 50000보다 큽니다.");
        }
        if(n2 < -50000 || n2 > 50000){
            throw new RuntimeException("num2 값은 -50000보다 작거나 50000보다 큽니다.");
        }
        return n1 - n2;
    }
}

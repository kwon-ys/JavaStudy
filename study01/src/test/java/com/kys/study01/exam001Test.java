package com.kys.study01;

import com.kys.study01.mathexam.MathExam;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class exam001Test {
    @Test
    public void subtract001() throws Exception {
        // given    테스트하기 위한 준비 동작
        MathExam math = new MathExam();
//        int num1 = 2;
//        int num2 = 3;
//        int expected = -1;
        // when     테스트를 실시
//        int actual = subTest001(num1, num2);
        // then     실제값과 기대값을 비교해서 테스트한다.
        assertThat(-1).isEqualTo(math.subTest001(2, 3));
        assertThat(98).isEqualTo(math.subTest001(100, 2));
        assertThat(3).isEqualTo(math.subTest001(10, 7));
        assertThat(10).isLessThan(math.subTest001(100, 70)); // 답이 30보다 작으면 통과
        assertThat(301).isGreaterThan(math.subTest001(1000, 700)); //답이 300보다 크면 통과

        //예외가 발생해야지만 정상 동작으로 인식한다.
        assertThatThrownBy(() -> math.subTest001(70000, 7)).isInstanceOf(Exception.class);
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            math.subTest001(2330, 50002);
        });
        System.out.println(exception.toString());
    }
    @Test
    public void multiply001() throws Exception{
        // given
        MathExam math = new MathExam();
        // when
        // then
        assertThat(12).isEqualTo(math.mathTest002(3,4));
        assertThat(513).isEqualTo(math.mathTest002(27,19));
        assertThatThrownBy(() -> math.mathTest002(-1, 10)).isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.mathTest002(10, 101)).isInstanceOf(Exception.class);
    }
}

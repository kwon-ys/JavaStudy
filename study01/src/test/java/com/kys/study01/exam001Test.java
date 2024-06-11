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

        // Exception 예외가 발생해야지만 정상 동작으로 인식한다.
        assertThatThrownBy(() -> math.subTest001(70000, 7)).isInstanceOf(Exception.class);
        // RuntimeException 예외가 발생해야지만 정상 동작으로 인식한다.
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            math.subTest001(222, 55555);
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

    @Test
    public void comparison001() throws Exception{
        // given
        MathExam math = new MathExam();
        // when
        // then
        assertThat(-1).isEqualTo(math.mathTest004(2,3));
        assertThat(1).isEqualTo(math.mathTest004(11,11));
        assertThat(-1).isEqualTo(math.mathTest004(7,99));
        assertThatThrownBy(() -> math.mathTest004(-1, 10000)).isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.mathTest004(10000, 10001)).isInstanceOf(Exception.class);
    }

    @Test
    public void exam120585() throws Exception{
        System.out.println("exam120585");
        MathExam math = new MathExam();
        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120585(new int[] {}, 150));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120585(new int[] {150, 201}, 130));
        System.out.println(ex2.toString());
        Throwable ex3 = assertThrows(Exception.class, () -> math.exam120585(new int[] {150, 180}, 201));
        System.out.println(ex3.toString());

        assertThat(math.exam120585(new int[] {149, 180, 192, 170}, 167)).isEqualTo(3);
        assertThat(math.exam120585(new int[] {180, 120, 140}, 190)).isEqualTo(0);
        assertThat(math.exam120585(new int[] {169, 177, 181, 190, 157, 188}, 175)).isEqualTo(4);
    }

    @Test
    public void exam120818() throws Exception {
        System.out.println("exam120818");
        MathExam math = new MathExam();

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120818(0));    //price가 10보다 작을 때
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120818(1000010)); //price가 1000000보다 클 때
        System.out.println(ex2.toString());
        Throwable ex3 = assertThrows(Exception.class, () -> math.exam120818(10001));  //price의 1의 자리가 0이 아닐 때
        System.out.println(ex3.toString());

        assertThat(math.exam120818(50000)).isEqualTo(50000);
        assertThat(math.exam120818(150000)).isEqualTo(142500);
        assertThat(math.exam120818(350000)).isEqualTo(315000);
        assertThat(math.exam120818(580000)).isEqualTo(464000);
    }

    @Test
    public void exam120837() throws Exception{
        System.out.println("exam120837");
        MathExam math = new MathExam();

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120837(-1));    //0보다 작을 때
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120837(1001));  //1000보다 클 때
        System.out.println(ex2.toString());

        assertThat(math.exam120837(23)).isEqualTo(5);
        assertThat(math.exam120837(24)).isEqualTo(6);
        assertThat(math.exam120837(999)).isEqualTo(201);
    }

    @Test
    public void exam120839() throws Exception{

        System.out.println("exam120839");
        MathExam math = new MathExam();

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120839(null));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120839(""));
        System.out.println(ex2.toString());
        Throwable ex3 = assertThrows(Exception.class, () -> math.exam120839("026"));
        System.out.println(ex3.toString());

        assertThat(math.exam120839("2")).isEqualTo("0");
        assertThat(math.exam120839("205")).isEqualTo("052");
        assertThat(math.exam120839("000222555")).isEqualTo("555000222");
    }

    @Test
    public void exam120824() throws Exception{
        System.out.println("exam120824");
        MathExam math = new MathExam();

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120824(null));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120824(new int[] {}));
        System.out.println(ex2.toString());
        Throwable ex3 = assertThrows(Exception.class, () -> math.exam120824(new int[] {2, 3, 7, 10, 1001, 653}));
        System.out.println(ex3.toString());

        assertThat(math.exam120824(new int[] {1, 2, 3, 4, 5})).isEqualTo(new int[] {2, 3});
        assertThat(math.exam120824(new int[] {1, 3, 5, 7})).isEqualTo(new int[] {0, 4});
    }

    @Test
    public void exam120899() throws Exception{
        System.out.println("exam120899");
        MathExam math = new MathExam();

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120899(null));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120899(new int[] {}));
        System.out.println(ex2.toString());
        Throwable ex3 = assertThrows(Exception.class, () -> math.exam120899(new int[] {1001, 653}));
        System.out.println(ex3.toString());
        Throwable ex4 = assertThrows(Exception.class, () -> math.exam120899(new int[] {1, 1}));
        System.out.println(ex4.toString());

        assertThat(math.exam120899(new int[] {1, 8, 3})).isEqualTo(new int[] {8, 1}); //제일 큰 수 8 위치 1
        assertThat(math.exam120899(new int[] {9, 10, 11, 8})).isEqualTo(new int[] {11, 2}); //제일 큰 수 11 위치 2
        assertThat(math.exam120899(new int[] {38, 43, 18, 22, 30, 12, 54})).isEqualTo(new int[] {54, 6}); //제일 큰 수 54 위치 6
    }

    @Test
    public void numberPrint() throws Exception {
        int x = 0b1011, y = 0206, z = 0x2A0F;
        char a = 'A', b = 'B', c = 'C';

        System.out.println(String.format("10진수 : x = %d, y = %d, z = %d", x, y, z));
        System.out.println(String.format("8진수 : x = %o, y = %o, z = %o", x, y, z));
        System.out.println(String.format("16진수 : x = %x, y = %x, z = %x", x, y, z));
        System.out.println(String.format("char : x = %c, y = %c, z = %c", x, y, z));

        System.out.println(String.format("10진수 : a = %d, b = %d, c = %d", (int)a, (int)b, (int)c));
        System.out.println(String.format("8진수 : a = %o, b = %o, c = %o", (int)a, (int)b, (int)c));
        System.out.println(String.format("16진수 : a = %x, b = %x, c = %x", (long)a, (byte)b, (short)c)); //long, byte, short 가능
        System.out.println(String.format("char : a = %c, b = %c, c = %c", a, b, c));
        {
            //변수의 값 영향을 받는 우선 순위가 높음
            
        }
    }

}

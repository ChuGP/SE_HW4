package SE;

import org.junit.Test;

import static org.junit.Assert.*;

public class SE_ClassTest {

    @Test
    public void letterGrade_A() {
        SE_Class SE = new SE_Class();
        char score = SE.letterGrade(94);
        assertEquals('A',score);
    }

    @Test
    public void letterGrade_B() {
        SE_Class SE = new SE_Class();
        char score = SE.letterGrade(84);
        assertEquals('B',score);
    }

    @Test
    public void letterGrade_C() {
        SE_Class SE = new SE_Class();
        char score = SE.letterGrade(74);
        assertEquals('C',score);
    }

    @Test
    public void letterGrade_D() {
        SE_Class SE = new SE_Class();
        char score = SE.letterGrade(64);
        assertEquals('D',score);
    }

    @Test
    public void letterGrade_F() {
        SE_Class SE = new SE_Class();
        char score = SE.letterGrade(54);
        assertEquals('F',score);
        score = SE.letterGrade(44);
        assertEquals('F',score);
        score = SE.letterGrade(34);
        assertEquals('F',score);
        score = SE.letterGrade(24);
        assertEquals('F',score);
        score = SE.letterGrade(14);
        assertEquals('F',score);
        score = SE.letterGrade(4);
        assertEquals('F',score);
    }

    @Test
    public void letterGrade_X() {
        SE_Class SE = new SE_Class();
        char score = SE.letterGrade(-4);
        assertEquals('X',score);
        score = SE.letterGrade(104);
        assertEquals('X',score);
    }

    @Test
    public void letterGrade_boundary_90_TO_100() {
        SE_Class SE = new SE_Class();
        char score = SE.letterGrade(90);
        assertEquals('A',score);
        score = SE.letterGrade(91);
        assertEquals('A',score);
        score = SE.letterGrade(95);
        assertEquals('A',score);
        score = SE.letterGrade(99);
        assertEquals('A',score);
        score = SE.letterGrade(100);
        assertEquals('A',score);
        score = SE.letterGrade(89);
        assertEquals('B',score);
        score = SE.letterGrade(101);
        assertEquals('X',score);
    }

    @Test
    public void letterGrade_boundary_80_TO_89() {
        SE_Class SE = new SE_Class();
        char score = SE.letterGrade(80);
        assertEquals('B',score);
        score = SE.letterGrade(81);
        assertEquals('B',score);
        score = SE.letterGrade(85);
        assertEquals('B',score);
        score = SE.letterGrade(88);
        assertEquals('B',score);
        score = SE.letterGrade(89);
        assertEquals('B',score);
        score = SE.letterGrade(79);
        assertEquals('C',score);
        score = SE.letterGrade(90);
        assertEquals('A',score);
    }

    @Test
    public void letterGrade_boundary_70_TO_79() {
        SE_Class SE = new SE_Class();
        char score = SE.letterGrade(70);
        assertEquals('C',score);
        score = SE.letterGrade(71);
        assertEquals('C',score);
        score = SE.letterGrade(75);
        assertEquals('C',score);
        score = SE.letterGrade(78);
        assertEquals('C',score);
        score = SE.letterGrade(79);
        assertEquals('C',score);
        score = SE.letterGrade(69);
        assertEquals('D',score);
        score = SE.letterGrade(80);
        assertEquals('B',score);
    }

    @Test
    public void letterGrade_boundary_60_TO_69() {
        SE_Class SE = new SE_Class();
        char score = SE.letterGrade(60);
        assertEquals('D',score);
        score = SE.letterGrade(61);
        assertEquals('D',score);
        score = SE.letterGrade(65);
        assertEquals('D',score);
        score = SE.letterGrade(68);
        assertEquals('D',score);
        score = SE.letterGrade(69);
        assertEquals('D',score);
        score = SE.letterGrade(59);
        assertEquals('F',score);
        score = SE.letterGrade(70);
        assertEquals('C',score);
    }


    @Test
    public void letterGrade_boundary_0_TO_59() {
        SE_Class SE = new SE_Class();
        char score = SE.letterGrade(0);
        assertEquals('F',score);
        score = SE.letterGrade(1);
        assertEquals('F',score);
        score = SE.letterGrade(30);
        assertEquals('F',score);
        score = SE.letterGrade(58);
        assertEquals('F',score);
        score = SE.letterGrade(59);
        assertEquals('F',score);
        score = SE.letterGrade(-1);
        assertEquals('X',score);
        score = SE.letterGrade(60);
        assertEquals('D',score);
    }
}
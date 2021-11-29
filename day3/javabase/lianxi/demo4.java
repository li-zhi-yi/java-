package day3.javabase.lianxi;

public class demo4 {
    public static void main(String[] args) {
        char Show = 'a';
        switch (Show) {
        case 'a':
            System.out.print('a');
            break;
        case 'b':
            System.out.print('b');

            break;
        case 'c':
            System.out.print('c');
            break;
        default:
            System.out.print("other");
        }

        // switch  学生分数是否及格
        int grate = 80;
        switch (grate / 10) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println("不及格");
            break;
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
            System.out.println("及格");
            break;
        }
    }
}

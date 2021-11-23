package day3.javabase;

/*
逻辑运算符
& 逻辑与   && 短路与
| 逻辑或  || 短路或
! 逻辑非  ^ 逻辑异或 (两个 a^b  a与b 相同则为false  不同为true)

说明：
逻辑运算符操作的都是boolean类型的变量
*/
public class Test4 {
    public static void main(String[] args) {

        /*
         * 区分& 与 && 相同点：1 &与&&的运算结果相同 2 当符号左边的运算为true 时，二者都会执行符号右边的运算
         * 
         * 不同点：当符号左边时false时，& 会执行右边的运算 而 && 会发生短路判断 不执行右边的 运算
         */
        boolean b1 = false;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("我现在在BJ");
        } else {
            System.out.println("我现在在NJ");
        }

        System.out.println(num1);// 11
        boolean b2 = false;
        int num2 = 10;
        if (b1 && (num2++ > 0)) {
            System.out.println("我现在在BJ");
        } else {
            System.out.println("我现在在NJ");
        }

        System.out.println(num2);// 10

        // 区分：| 与||
        // 相同点 ：1  |与|| 的运算结果相同
        //          2  当符号左边的 时false 时，二者都会执行右边的运算
        // 不同点 : 当呼号左边时true时，|会继续执行符号右边的运算，而||不会继续执行
        //开发中推荐使用 && 和 ||
        boolean b3 = false;
        int num3 = 10;
        if (b3 | (num3++ > 0)) {
            System.out.println("我现在在BJ");
        } else {
            System.out.println("我现在在NJ");
        }

        System.out.println(num3);// 

        boolean b4 = false;
        int num4 = 10;
        if (b4 || (num4++ > 0)) {
            System.out.println("我现在在BJ");
        } else {
            System.out.println("我现在在NJ");
        }

        System.out.println(num4);// 10
    }

}

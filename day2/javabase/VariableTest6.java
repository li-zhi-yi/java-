package day2.javabase;

/*
������в�ͬ���Ƶ�ʹ��˵��
 ���������������ֱ�ʾ��ʽ
 ������(binary):0��1 ,��2��1,��0b��0B��ͷ��
 �˽���(decimal):0,9,��10��1.
 ʮ����(octal):0-7
 ʮ������(hex):0-9��A-F,��16��1,��0x��0X��ͷ��ʾ���˴�A-F�����ִ�Сд;
 �磺ox21AF+1=oXx1B0;
*/

public class VariableTest6 {
    public static void main(String[] args) {
        int num1 = 0b110;
        int num2 = 110;
        int num3 = 0127;
        int num4 = 0x110A;

        System.out.println("num1= :" + num1);//6
        System.out.println("num2= :" + num2);//110
        System.out.println("num3= :" + num3);//87
        System.out.println("num4= :" + num4);//4362
    }
}

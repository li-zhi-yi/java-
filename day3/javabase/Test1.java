package day3.javabase;

/*
�����:���������
+ ��
�� ��
* ��
/ ��
% ȡģ
++a ǰ++  ��++������
a++ ��++  ������Ϻ� ��+1
--a ǰ--  ��--������
a-- ��--  �����  ��-1
*/
public class Test1 {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 2;
        int result1 = num1 / num2;
        System.out.println(result1);// 6

        int result2 = num1 / num2 * num2;
        System.out.println(result2);// 12

        double result3 = num1 / num2 * num2;
        System.out.println(result3);// 12.0

        // % ȡģ
        // ��������뱻ħ���ķ�����ͬ
        // �����У�����ʹ��%���ж��ܷ񱻳��������
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1%n2: " + m1 % n1);

        int m2 = -12;
        int n2 = -5;
        System.out.println("m1%n2: " + m2 % n2);

        int m3 = 12;
        int n3 = -5;
        System.out.println("m1%n2: " + m3 % n3);

        int m4 = -12;
        int n4 = -5;
        System.out.println("m1%n2: " + m4 % n4);

        /*
          ++a ǰ++ ��++������
          a++ ��++ ������Ϻ� ��+1 
          --a ǰ-- ��--������ 
          a-- ��-- ����� ��-1
         */
        int a1=10;
        int b1=++a1;//11

        int a2=10;
        int b2=a2++;//10

        int a3=10;
        int b3=--a3;//9

        int a4=10;
        int b4=a4--;//10

        // ע���
        short s1=10;
        // s1=s1+1;//����ʧ��  1ʱ���� int   ����int ת���� short ����ʧ��
        // s1=(short)(s1+1);//ǿ��ת��
        s1++;//����1����ð��걾��������������ͣ�
    }
}

package day2.javabase;

/*
������������֮����������
ǰ�᣺�������۵�ʱ7�л����������ͱ���������� ������boolean����
1 �Զ���������:
    ���ۣ�������С���������͵ı�������������������͵İ�����������ʱ������Զ�����Ϊ���������������
    byte ,char,short-->short--> int--> long--> float--> double
    �ر�ģ���byte,short ,char�����ֱ��������������ʱ��;�����int���ͱ���
2 ǿ������ת���� ��VaribalbeTest4.java
    ˵���� ��ʱ��������Сָ���ǣ���ʾ���ķ�Χ�Ĵ��С����float����Ҫ����long������
*/
public class VariableTest3 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 12;
        // byte b2=i1+b1;//����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
        int b2 = i1 + b1;
        long l1 = b1 + i1;

        System.out.println(b2);// 14

        float f = b1 + i1;
        System.out.println(f);// 14.0;

        short s1 = 123;
        double d1 = s1;
        System.out.print(d1);// 123.0;

        // ************************ */
        char c1 = 'a';// 97 ascll��
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        short s2 = 10;
        // char c2=c1+s2;//���벻ͨ��

        byte b3 = 10;
        // char c3=c1+b3;//���벻ͨ��

        // short s3=b1+b2;���벻ͨ��

    }
}

package day2.javabase;

/*
������ʹ��
1 java ��������ĸ�ʽ���������� ������=����ֵ

2 ˵��
    1 ������������������ʹ��
    2 ���������������������ڡ����������ڣ�������Ч�ġ����仰˵�������������ʧЧ��
    3 ͬһ���������ڣ���������������ͬ���ı���

    
3   Java �������������

    3.1������װ������������
        1������������
            ���� byte(1�ֽ�=8bit) ;short(2�ֽ�);int(4�ֽ�) ;long(8�ֽ�);
            ������ float ;double
            �ַ��� char
            ������ boolean

        2������������
            ��(class)
            �ӿ�(interface)
            ����(array)
       
    3.2  ����������������λ�ã�
    ��Ա����  cs �ֲ����� ����ͼ��
*/
public class Variable2 {
    public static void main(String[] args) {
        // �������  ��  �� 
        int myAge = 12;
        System.out.println(myAge);
        // Ҳ�����ȶ���
        int newYear;
        // ��ֵ
        newYear = 2021;
        System.out.println(newYear);

        // ���� byte(1�ֽ�=8bit) ;short(2�ֽ�);int(4�ֽ�) ;long(8�ֽ�);
        // byte��Χ-128~127
        byte b1 = 12;
        byte b2 = -128;
        // b2 = 128; ����byte��Χ ���벹ͨ��
        System.out.println(b1);
        System.out.println(b2);

        /*
        ����long�ͱ�����������l �� L ��β��
        ͨ�����������ͱ���ʱ��ʹ��int
        */ 
        short s1 = 128;
        int s2 = 1234;
        long s3 = 324234234L;
        System.out.println(s3);
    }

}
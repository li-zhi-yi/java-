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
        // �������  �� ��  
        int myAge = 12;
        System.out.println(myAge);
        // Ҳ�����ȶ���
        int newYear;
        // ��ֵ
        newYear = 2021;
        System.out.println(newYear);

        // 1 ���� byte(1�ֽ�=8bit) ;short(2�ֽ�);int(4�ֽ�) ;long(8�ֽ�);
        // byte��Χ-128~127
        byte b1 = 12;
        byte b2 = -128;
        // b2 = 128; ����byte��Χ ���벻ͨ��
        System.out.println(b1);
        System.out.println(b2);

        /*
         * ����long�ͱ�����������l �� L ��β ͨ�����������ͱ���ʱ��ʹ��int
         */
        short s1 = 128;
        int s2 = 1234;
        long s3 = 324234234L;
        System.out.println(s3);

        /*
         * 2 ������ (�����ͱ�ʾ��С�������ֵ)  float (4�ֽ�) doubule(8�ֽ�) float
         * ��ʾ��ֵ�ķ�Χ��long����
         * 
         */

         // ����float���͵ı���ʱ������Ҫ��f��F��β
        float d1 = 12.3f;
        System.out.println(d1);
        /*
        ͨ�����Ƕ��帡���ͱ�����ʱ�� ʹ��double��Χ���� ���ȸ���
        */
        double d2 = 123.33;
        System.out.println(d2);

        /*
        3  �ַ��ͣ�char��1�ַ�=2�ֽڣ�
        ����char�ͱ��� ͨ��ʹ��һ��''
        */
        char c1='a';
        char c2='��';
        // c1='AB';  �ַ��� ֻ���Ը�ֵһ���ַ� ���� ���������͵�����
        System.out.println(c1);
        System.out.println(c2);

        //��ʾ��ʽ 1�� ���� һ���ַ� 2 ת���ַ�   3 ֱ��ʹ��Unicode ֵ����ʾ�ַ��ͳ���
        char c3='\n';//ת���ַ�
        c3='\t';//�Ʊ��
        char c4='\u0043';
        System.out.print("hello"+c3);
        System.out.println("world");
        System.out.println(c4);


        /*
        4  �����ͣ�boolean(����ѭ���� �������ж���ʹ��)
        ֮��ȡ����ֵ  true ,false
        */
        boolean bb1=true;
        System.out.println(bb1);
        boolean isMarried=true;
        if(isMarried){
            System.out.println("���ܲμӵ���\"����\"party��\\n ���ź�");
        }else{
            System.out.println("������Ů����ѽ!");
        }
    }

}
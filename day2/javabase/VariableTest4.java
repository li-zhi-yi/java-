package day2.javabase;

/*
ǿ������ת��:�Զ��������������������
1  ��Ҫʹ��ǿת����()
2  ע��㣺ǿ������ת�������ܵ��¾�����ʧ��

*/
public class VariableTest4 {
    public static void main(String[] args){
        double d1=12.3;
        //������ʧ����1
        int i1=(int)d1;//�ضϲ��� 
        System.out.println(i1);//12

        //û�о�����ʧ
        long l1=123;
        short s2=(short)l1;
        System.out.println(s2);//123

        //������ʧ����2
        int i2=128;
        byte b=(byte)i2;
        System.out.println(b);//-128

    }
}

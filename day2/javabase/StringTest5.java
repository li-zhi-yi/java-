package day2.javabase;
/*
String ���ͱ�����ʹ��
1 String ����������������
2 ����String���ͱ���ʱ��ʹ��һ��""
3 Strign���Ժ�8�л����������ͱ���������,��ֻ���������������+
4 ����Ľӿ���Ȼ��String����
*/
public class StringTest5 {
    public static void main(String[] args){
        String s1="Hello world!";

        System.out.println(s1);

        String s2="a";
        String s3="";

        // char c=''; ���벻ͨ��

        //************************* 
        int number=100;
        String numStr="ѧ�ţ�";
        String info=numStr+number;
        boolean b1=true;
        String info1=info+b1;//��������
        System.out.println(info1);


        //************************* 
        //��ϰ1
        char c='a';//ascll��  a 97  A 65
        int  num=10;
        String str="hello";
        System.out.println(c+num+str);//107hello
        System.out.println(c+str+num);//ahello10
        System.out.println(c+(num+str));//a10hell
        System.out.println((c+num)+str);//107hello
        System.out.println(str+num+c);//hello10a

        //ʣ����ϰ�� ��img String��ϰ��15

        // String str1=123;//���벻ͨ��
        String str1=123+"";//"123"

        //int num1=str1;
        // int num1=(int)str1;//���벻ͨ�� String ������ת����int
       
        //������׮��Integer�е�priseInt()
        int num1=Integer.parseInt(str1);
        System.out.println(str1);//123
    }
}

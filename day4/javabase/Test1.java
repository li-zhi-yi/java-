/*
һ ����ĸ���
1����Array ���Ƕ����ͬ�������ݰ�һ��˳�����еĽ�飬��ʹ��һ������������
��ͨ����ŵķ�ʽ����Щ���ݽ���ͳһ����

2 ������صĸ���
������
Ԫ��
�Ǳꡢ�±ꡢ����
����ĳ���

3 ������ص㣬
  3.1�������������е�
  3.2���������������͵ı����������Ԫ�ؼȿ����ǻ�������Ҳ��������������
  3.3���������������ڴ��п���һ���������Ŀռ�
  3.4 ����ĳ���һ��ȷ�����Ͳ����޸�

4 ����ķ���
  4.1  ����ά����һά���飬��ά���顣��������
  4.2  ��������Ԫ�ص����ͣ������������͵����顢������������Ԫ�ص�����

5  һά�����ʹ��
    5.1  һά����������ͳ�ʼ��
    5.2  ��ε��������ָ��λ�õ�Ԫ��
    5.3  ��λ�ȡ����ĳ���
    5.4  ��α�������
    5.5  ����Ԫ�ص�Ĭ�ϳ�ʼֵ
    5.6  ������ڴ����
*/
public class Test1 {
    public static void main(String[] args) {
        //1 һά�����ʲô���ʼ��
        int num;//����
        num=10;//��ʼ��
        int id=1001;//����+��ʼ��

        int[] ids;//�����������͵�����
        //1.1 ��̬��ʼ��:����ĳ�ʼ��������Ԫ�صĸ�ֵ����ͬʱ����
        ids=new int[]{1001,1002,1003};
        System.out.println(ids); 
        System.out.println(id); 
        System.out.println(num); 
        //1.2 ��̬��ʼ��������ĳ�ʼ��������Ԫ�صĸ�ֵ�����ֿ�����
        String[] names=new String[4];

        //�ܽ᣺ ����һ����ʼ����ɣ��䳤��Ҳ��ȷ����

        //2 ��ε��������ָ��λ�õ�Ԫ�أ�ͨ���Ǳ�ķ�ʽ����
        // ����ĽǱ꣨��������0��ʼ �����鳤��-1����
        names[0]="����";
        names[1]="����";
        names[2]="������";
        names[3]="����";

        //3  ��λ�ȡ����ĳ���
        //���� length
        System.out.println(names.length);//4

        //4 ��α�������
        /*
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        */
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        //5  ����Ԫ�ص�Ĭ�ϳ�ʼֵ
        /*
         ����Ԫ�ص�Ĭ�ϳ�ʼֵ
            ����Ԫ���ǻ�����������ʱ��
                    ������Ԫ�������ͣ�0 
                    ������Ԫ���Ǹ����ͣ�0.0 
                    ������Ԫ����char�ͣ�0��'\u0000',����'0' 
                    ������Ԫ����boolean�ͣ�false

            
            ����Ԫ����������������ʱ��
                    null
        */

        int[] arr=new int[4];
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);// 4�� 0
        }

        System.out.println("****************");

        short[] arr1=new short[4];
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);// 4�� 0
        }

        System.out.println("****************");

        float[] arr2=new float[4];
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);// 4�� 0.0
        }

        System.out.println("****************");

        char[] arr3=new char[4];
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);// 4�� 0��ascll'\u0000'
        }

        System.out.println("****************");

        boolean[] arr4=new boolean[4];
        for(int i=0;i<arr4.length;i++){
            System.out.println(arr4[i]);// 4�� false
        }

        System.out.println("****************");

        String[] arr5=new String[4];
        System.out.println(arr5[0]);
        if(arr5[0]==null){
            System.out.println("������������");
        }
    }
}

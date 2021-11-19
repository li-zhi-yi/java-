public class hello {
    public static void main(String[] args){
        //单行注释
        /*
        多行注释 会忽略单行和多行注释
        */

        /**
         * 文档注释
         * 用法  先使用javac 解析.java文件
         * 之后 使用 javadoc  -d  文件夹名字  -author  -version  .java文件
         * javadoc -h  查看注释文档用法
        */
        System.out.println("hahah");
    }
}

// ////////////////////////////////////////////////////////
//
// J_Scope.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     同名变量作用域范围重叠情况处理例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.


class J_Time {
    public int data = 3;
    // 这里省略类体的其他部分
} // 类J_Time结束

public class J_Scope extends J_Time {
    public int data = 2;

    public void mb_method() {
        int data = 1;
        System.out.println("data=" + data);
        System.out.println("this.data=" + this.data);     //2
        System.out.println("super.data=" + super.data);  //3
    } // 方法mb_method结束

    public static void main(String args[]) {
        J_Scope a = new J_Scope();
        a.mb_method();
    } // 方法main结束
} // 类J_Scope结束


//J_Primitive.java
// ////////////////////////////////////////////////////////
//
// J_Finalize.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     实例对象生命周期的例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

class J_Book {
    public int m_id; // 书的编号

    public J_Book(int i) {
        m_id = i;
    } // J_Book构造方法结束

    protected void finalize() {
        switch (m_id) {
            case 1:
                System.out.print("《飘》");
                break;
            case 2:
                System.out.print("《Java程序设计教程》");
                break;
            case 3:
                System.out.print("《罗马假日》");
                break;
            default:
                System.out.print("未知书籍");
                break;
        } // switch语句结束
        System.out.println("所对应的实例对象存储单元被回收");
    } // 方法finalize结束
} // 类J_Book结束

public class J_Finalize {
    public static void main(String args[]) {
        J_Book book1 = new J_Book(1);
        new J_Book(2);
        new J_Book(3);
        System.gc(); // 申请立即回收垃圾
    } // 方法main结束
} // 类J_Finalize结束

//在调用System.gc()的时候，两个示例对象占据的内存被回收，
// 回收之前,java虚拟机一般会调用两个实例对象的finalize成员方法



//J_Teacher.java
// ////////////////////////////////////////////////////////
//
// J_Scope.java
//
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ͬ������������Χ�ص�����������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.


class J_Time {
    public int data = 3;
    // ����ʡ���������������
} // ��J_Time����

public class J_Scope extends J_Time {
    public int data = 2;

    public void mb_method() {
        int data = 1;
        System.out.println("data=" + data);
        System.out.println("this.data=" + this.data);     //2
        System.out.println("super.data=" + super.data);  //3
    } // ����mb_method����

    public static void main(String args[]) {
        J_Scope a = new J_Scope();
        a.mb_method();
    } // ����main����
} // ��J_Scope����


//J_Primitive.java
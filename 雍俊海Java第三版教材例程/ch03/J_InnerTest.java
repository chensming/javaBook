// ////////////////////////////////////////////////////////
//
// J_InnerTest.java
//
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ʵ���ڲ������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.


class J_Test {
    int m_dataOuter = 1;
    static int m_dataOuterStatic = 2;

    class J_Inner {
        int m_data;
        static final int m_dataStatic = 4;

        public J_Inner() {
            m_data = 3;
        } // J_Inner���췽������

        public void mb_method() {
            System.out.println("m_dataOuter=" + m_dataOuter);
            System.out.println("m_dataOuterStatic="
                    + m_dataOuterStatic);
            System.out.println("m_data=" + m_data);
            System.out.println("m_dataStatic=" + m_dataStatic);
            mb_methodOuter();
        } // ����mb_method����
    } // �ڲ���J_Inner����

    public void mb_methodOuter() {
        System.out.println("mb_methodOuter");
    } // ����mb_methodOuter����

} // ��J_Test����

public class J_InnerTest {
    public static void main(String args[]) {
        J_Test a = new J_Test();
        J_Test.J_Inner b = a.new J_Inner();
        b.mb_method();
    } // ����main����
} // ��J_InnerTest����

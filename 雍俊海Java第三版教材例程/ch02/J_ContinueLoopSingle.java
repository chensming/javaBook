// ////////////////////////////////////////////////////////
//
// J_ContinueLoopSingle.java
//
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �ڲ���Ƕ�׵�ѭ������е�continue������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.


public class J_ContinueLoopSingle {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            if (1 < i && i < 8)
                continue;
            System.out.println("i=" + i);
        } // forѭ������
    } // ����main����
} // ��J_ContinueLoopSingle����


//J_ContinueLoopNested.java
// ////////////////////////////////////////////////////////
//
// J_ContinueLoopNested.java
//
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��Ƕ��ѭ������е�continue������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_ContinueLoopNested {
    public static void main(String args[]) {
        aContinueBlock:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (0 < i && i < 3)
                    continue aContinueBlock;
                System.out.println("i=" + i + ", j=" + j);
            } // �ڲ�forѭ������
        } // ����aContinueBlock����, ���forѭ������
    } // ����main����
} // ��J_ContinueLoopNested����

// J_Factorial.java
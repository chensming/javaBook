// ////////////////////////////////////////////////////////
// 
// J_WeakHashMap.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��WeakHashMap���Զ�ȥ��һЩ�������á�Ԫ��(�ؼ��ּ���Ӧ��ֵ)�����̡�
// ////////////////////////////////////////////////////////
// Copyright:
//
// Using this example, please explicitly refer to the book:
//     Jun-Hai Yong. Textbook for Programming in Java (Third Edition). 
//     Beijing: Tsinghua University Press, 2014.
// The example should be used legally, beneficially and
// without any harm to anybody. Please note that the
// author and the publisher make no warranty of any kind
// on the examples provided.
// Citation examples:
// The program is an example in (or based on, or modified from)
//     Jun-Hai Yong. Textbook for Programming in Java (Third Edition). 
//     Beijing: Tsinghua University Press, 2014.
//
// Some selected books by Jun-Hai Yong are:
//      [1] Jun-Hai Yong. Playing Magic Cube Is Fun: 
//          A Small Course by Professor of Tsinghua University.
//          Beijing: Tsinghua University Press, 2018.
//      [2] Jun-Hai Yong. Programming in C. 
//          Beijing: Tsinghua University Press, 2017.
//      [3] Jun-Hai Yong. Textbook for Programming in Java (Third Edition). 
//          Beijing: Tsinghua University Press, 2014.
//      [4] Jun-Hai Yong. Programming in Java (Second Edition). 
//          Beijing: Tsinghua University Press, 2014.
//      [5] Jun-Hai Yong. Fundamentals of Computer Animation: Algorithms and Programming. 
//          Beijing: Tsinghua University Press, 2008.
//      [6] Jun-Hai Yong. Exercises for Programming in Java.
//          Beijing: Tsinghua University Press, 2006.
//
// ��Ȩ:
// ʹ�ñ����ӣ���ע������:
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ��Ϸ�ʹ�����̣�����;Ӧ���Ϸ�������Ҳ�Ӧ���κ�������κ�
// �˺�����ʧ��ͬʱ��ע��̲����߼�������û�ж����������κγ�
// ŵ�뱣֤��
// �������õķ�������������:
// ������������̲ĵ�һ������(�򱾳����������̲ĵ������޸�)
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
//
// Ӻ��������д�����µĽ̲ĺͽ̲�:
//      [1] Ӻ����. �廪���ڵ�С����: ħ�������. ����: �廪��ѧ������. 2018.
//      [2] Ӻ����. C�������. ����: �廪��ѧ������. 2017.
//      [3] Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
//      [4] Ӻ����. Java�������(��2��). ����: �廪��ѧ������. 2014.
//      [5] Ӻ����. ����������㷨���̻���. ����: �廪��ѧ������. 2008.
//      [6] Ӻ����. Java�������ϰ�⼯(���ο���). 
//          ����: �廪��ѧ������, 2006.
//
// ////////////////////////////////////////////////////////

import java.util.WeakHashMap;

public class J_WeakHashMap
{
    public static void main(String args[ ]) throws Exception
    {
        // ����WeakHashMapʵ������
        int s=800; // ����WeakHashMapʵ����������ӵ�Ԫ�صĸ���
        WeakHashMap<String, String> ht
            = new WeakHashMap<String, String>(s*4/3, 0.75f);

        // ��WeakHashMapʵ���������Ԫ��(�ؼ��ּ���ֵ)
        int i;
        for (i=0; i<s; i++)
            ht.put(("key"+i), ("value"+i));
        System.out.println("�ڸ����������ʱ������ϣ��Ԫ�ظ�����" + ht.size( ));

        // ����Ѿ�����WeakHashMapʵ�������е�Ԫ�أ�����ȴ�����ϣ��ɾ��Ԫ��
        for (i=0; i<s; )
        {
            if (!ht.containsKey("key"+i))
                System.out.print("key" + i + "; ");
            if (ht.size( )!=s)
                i++;
        } // forѭ������
        System.out.println("");
        System.out.println("һ��ʱ��֮������ϣ��Ԫ�ظ�����" + ht.size( ));
    } // ����main����
} // ��J_WeakHashMap����

// ////////////////////////////////////////////////////////
//
// J_Hashtable.java
//
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ͨ����ϣ���γ������±���ֵ֮���˫��ӳ�䡣
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.


import java.util.Hashtable;

public class J_Hashtable {
    public static void main(String args[]) {
        String[] sa = {"Mary", "Tom", "John", "James", "Louis", "Jim",
                "Rose", "Ann", "Liza", "Betty", "Henry", "Albert"};
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();

        // ����ϣ�������Ԫ�أ���ʹ�ùؼ�����ֵ֮�佨����ӳ���ϵ
        int i;
        for (i = 0; i < sa.length; i++)
            ht.put(sa[i], new Integer(i));

        // ͨ���±�������(�ַ���ֵ)
        i = 8;
        System.out.println(
                "��sa�����У��±�Ϊ" + i + "���ַ�����\"" + sa[i] + "\"");

        // ͨ����ϣ��ֱ�ӻ������(�ַ���ֵ)�������±�
        String s = sa[i];
        System.out.println("��sa�����У�\"" + s + "\"���±���" + ht.get(s));
    } // ����main����
} // ��J_Hashtable����

/*
��sa�����У��±�Ϊ8���ַ�����"Liza"
��sa�����У�"Liza"���±���8
 */



//J_WeakHashMap.java
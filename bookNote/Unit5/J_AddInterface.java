
interface J_Interface<T extends Number> {
    public int mb_Sum(T a1, T a2, T a3);
}


public class J_AddInterface<T extends Number> implements J_Interface<T> {
    @Override
    public int mb_Sum(T a1, T a2, T a3) {
        int b1 = a1.intValue();
        int b2 = a2.intValue();
        int b3 = a3.intValue();
        return (b1 + b2 + b3);
    }

    public static void main(String args[]) {
        //J_AddInterface<Integer> b = new J_AddInterface<Integer>()；也可
        J_AddInterface<Integer> b = new J_AddInterface<>();
        Integer a1 = new Integer(1);
        Integer a2 = new Integer(2);
        Integer a3 = new Integer(3);
        System.out.println(b.mb_Sum(a1, a2, a3));
    }
}
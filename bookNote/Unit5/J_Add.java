

public class J_Add<T>{
    public String sum(T a1, T a2, T a3){
        return (a1.toString() + a2.toString() +a3.toString());
    }

    public static void main(String args[]){
        J_Add<Integer> b = new J_Add<>();
        Integer a1 = new Integer(1);
        Integer a2 = new Integer(2);
        Integer a3 = new Integer(3);
        System.out.println(b.sum(a1,a2,a3));
    }
}
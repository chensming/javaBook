

class J_C1{
    public void mb_methodA(){
        System.out.println("A");
    }
}

interface J_C2{
    public void mb_methodB();
}

class J_C3 extends J_C1 implements J_C2{
    public void mb_methodB(){
        System.out.println("B (from J_C3)");
    }
}


class J_T<T extends J_C1 & J_C2>{
    public void mb_MethodT(T t){
        t.mb_methodA();
        t.mb_methodB();
    }
}

public class J_Genericity{
    public static void main(String[] args) {
        J_T<J_C3> a = new J_T<>();
        a.mb_MethodT(new J_C3());
    }
}

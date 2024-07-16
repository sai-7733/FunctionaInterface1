public class Main{
    public static void main(String args[]){
        B ob=new B(){
            public void m1(){
                System.out.println("hai");
        }
    };
    ob.m1();
    C obj=new C();
    obj.m1();
    }
}
class C implements B{
    @Override
    public void m1(){
        System.out.println("sai");
    }
}
@FunctionalInterface
interface B{
    public void m1();
}
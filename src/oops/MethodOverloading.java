package oops;

public class MethodOverloading {
    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public int sum(int a,int b, int c){
        return a+b+c;
    }

    public float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading ml = new MethodOverloading();
        ml.sum(5,6);
        System.out.println(ml.sum(5.6f,8.3f));
        System.out.println(ml.sum(5,2,7));
    }

}

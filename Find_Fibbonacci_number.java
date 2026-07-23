package Code;

public class Find_Fibbonacci_number {
    public static void main(String[]args){
        int ans=fibo(20);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}

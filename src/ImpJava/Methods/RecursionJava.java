package ImpJava.Methods;

public class RecursionJava {
    public static void main(String [] arg){
        int result = sum (10, 15);
        System.out.println(result);
    }
    public static int sum (int start, int end){
        if (end > start){
            return end + sum(start, end - 1);
        }else {
            return end;
        }
    }
}

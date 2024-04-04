public class Factorial {

    public Integer FactorialRecursion(int num){
        if(num == 1){
            return 1;
        }
        return num * FactorialRecursion(num - 1);
    }

    public Integer Factorial(Integer num){
        int fact = 1;
        int n = num;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

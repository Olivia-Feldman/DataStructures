public class Recursion {

    public static void main(String[]args){
        int num = 4;
        System.out.println(recursiveFactorial(num));


    }
    // 1! = 0! * 1 = 1
    // 2! = 2 * 1 = 2* 1!
    //3! = 3 * 2 * 1 = 3 * 2!
    //n! = n(n-1)! formula

    public static int recursiveFactorial(int num){
        if (num ==0){
            return 1;
        }

        return num * recursiveFactorial(num-1);
    }



    //method for factorial does not use recursion
    public  static int interativeFactorial(int num){
        if (num ==0){
            return 1;

        }
        int factorial = 1;
        for (int i =1; i <=num;i++ ){
            factorial *=i;

        }
        return  factorial;

    }
}

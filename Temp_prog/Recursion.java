class Recursion {
    /*
     * static int factorial(int i, int result, int max) {
     * if (i >= max) {
     * return result;
     * }
     * i++;
     * return factorial(i, result*i, max);
     * }
     */

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
        }

    public static void main(String[] args) {
        int n = 10;
        for(int i=0;i<=n;i++){
        System.out.println(fibonacci(i));
        }
    }

/*
 * 
 * call stack (n=5)
 * -----------
 * 
 * factorial(0, 1, 5) ^
 * factorial(1, 1, 5) |
 * factorial(2, 4, 5) |
 * factorial(3, 6, 5) |
 * factorial(4, 24, 5) |
 * factorial(5, 120, 5) |
 * -------->------->---->
 * 
 */

/*
 * call stack (n=5)
 * ----------------
 * 
 * fibonacci(5)
 * fibonacci(4) + fibonacci(3)      [5+5]
 * fibonacci(3) + fibonacci(2)      [3+2]
 * fibonacci(2) + fibonacci(1)      [2+1]
 * fibonacci(1) + fibonacci(0)      [1+0]
 * 
 * fibonacci(x-1) + fibonacci(x-1+x)      [1+0]
 * fibonacci(x) + fibonacci(x-1)      [1+0]
 */

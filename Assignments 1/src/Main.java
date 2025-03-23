import java.util.Scanner;


// <---- Problem 1: ---->

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//        int min = min_arr(num);
//        System.out.println(min);
//
//    }
//
//    public static int min_arr(int num) {
//        System.out.println("Problem 1:");
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Enter array elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int min_element = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] < min_element) {
//                min_element = arr[i];
//            }
//        }
//
//        return min_element;
//    }
//
//}

//-------------------------------------------------------------------


// <---- Problem 2: ---->

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//
//        float avg_num = avg_arr(n);
//        System.out.println(avg_num);
//    }
//
//    public static float avg_arr(int n) {
//        float[] arr = new float[n];
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextFloat();
//        }
//
//        float sum_nums = 0;
//        for (int i = 0; i < n; i++) {
//            sum_nums += arr[i];
//        }
//
//        return sum_nums / n;
//    }
//
//}

//-------------------------------------------------------------------

// <---- Problem 3: ---->

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n3 = sc.nextInt();
//
//        if (isPrime(n3)) {
//            System.out.println("Prime");
//        } else {
//            System.out.println("Composite");
//        }
//    }
//
//        public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//
//}


//--------------------------------------------------------------------------------------


// <---- Problem 4: ---->

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter n: ");
//        int n4 = sc.nextInt();
//
//        int result = factorial(n4);
//        System.out.println(result);
//    }
//
//
//    public static int factorial (int n) {
//        if(n == 1)
//            return 1;
//        else {
//            return n * factorial(n-1);
//        }
//    }
//}

//---------------------------------------------------------------------

// <---- Problem 5: ---->

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter n: ");
//        int n4 = sc.nextInt();
//
//        int result = Fibonacci_element(n4);
//        System.out.println(result);
//    }
//
//
//    public static int Fibonacci_element (int n) {
//        // 0 1 1 2 3 5
//
//        if (n <= 1) {
//            return n;
//        }
//        else {
//            return Fibonacci_element(n - 1) + Fibonacci_element(n - 2);
//        }
//
//    }
//}


// <---- Problem 6: ---->

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a: ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        int result = degree(a, n);
//        System.out.println(result);
//    }
//
//    public static int degree(int a, int n) {
//
//        int res = 1;
//
//        for (int i = 1; i <= n; i++) {
//            res=res*a;
//        }
//        return res;
//    }
//}

//-----------------------------------------------------------

// <---- Problem 7: ---->

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Str: ");
//        String str = sc.nextLine();
//
//        permutations(str, "");
//    }
//
//    static void permutations(String str, String prefix) {
//        if (str.length() == 0) {
//            System.out.println(prefix);
//            return;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            String newStr = str.substring(0, i) + str.substring(i + 1);
//            permutations(newStr, prefix + str.charAt(i));
//        }
//    }
//
//}


//------------------------------------------------------------------------------


// <---- Problem 8: ---->

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the s: ");
//        String s = sc.nextLine();
//
//
//        System.out.println(isAllDigits(s) ? "Yes" : "No");
//    }
//
//    public static boolean isAllDigits(String s) {
//        return s.matches("\\d+");
//    }
//
//}


//-----------------------------------------------------------------------------


// <---- Problem 9: ---->

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        System.out.print("Enter k: ");
//        int k = sc.nextInt();
//
//        System.out.println(binomialCoefficient(n, k));
//    }
//
//    public static int binomialCoefficient(int n, int k) {
//
//        if (k == 0 || k == n) {
//            return 1;
//        }
//
//        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
//    }
//
//}


//-----------------------------------------------------------------------------


// <---- Problem 10: ---->

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a: ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter b: ");
//        int b = sc.nextInt();
//
//        System.out.println(gcd(a, b));
//    }
//
//
//    public static int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);
//    }
//
//}




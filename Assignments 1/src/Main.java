import java.util.Scanner;


// <---- Problem 1: ---->

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        System.out.println("Enter array elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int min = findMin(arr, n - 1);
//        System.out.println(min);
//    }
//
//    public static int findMin(int[] arr, int index) {
//        if (index == 0) {
//            return arr[0];
//        }
//        return Math.min(arr[index], findMin(arr, index - 1));
//    }
//}
//
//}

//-------------------------------------------------------------------


// <---- Problem 2: ---->

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//
//        float[] arr = new float[n];
//        System.out.println("Enter array elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextFloat();
//        }
//
//        float avg = findAverage(arr, n - 1) / n;
//        System.out.println(avg);
//    }
//
//    public static float findAverage(float[] arr, int index) {
//        if (index == 0) {
//            return arr[0];
//        }
//        return arr[index] + findAverage(arr, index - 1);
//    }
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
//        System.out.print("Enter a: ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        int result = power(a, n);
//        System.out.println(result);
//    }
//
//    public static int power(int a, int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return a * power(a, n - 1);
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
//        System.out.print("Enter the string: ");
//        String s = sc.nextLine();
//
//        System.out.println(isAllDigits(s, 0) ? "Yes" : "No");
//    }
//
//    public static boolean isAllDigits(String s, int index) {
//        if (index == s.length()) {
//            return true;
//        }
//        if (!Character.isDigit(s.charAt(index))) {
//            return false;
//        }
//        return isAllDigits(s, index + 1);
//    }
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




public class array {
    public static void main(String[] args) {
        int[][] x = new int[3][2];
        System.out.println(x);

        //type of array to know class name
        System.out.println(x.getClass().getPackageName());

        
        x[0][0] = 22;
        x[0][1] = 23;
        x[1][0] = 24;
        x[1][1] = 25;
        x[2][0] = 26;
        x[2][1] = 27;
        // one dimension array
        System.out.println(x[1][0]);
        // initialization and declaration
        int[] a = { 22, 23, 24, 30 };
        System.out.println(a[3]);
        int[] arr = new int[] { 1, 2, 3, 4 };
        System.out.println(arr[1]);


        // two dimension array
        int[][] b = { { 56, 67, 60 }, { 30, 40 }, { 10, 40 } };
        System.out.println(b[1][1]);

        // 3d array
        int[][][] z ={{{10,11,12},{13,14,15}},{{16,17},{18,19,20},{21}}};
        System.out.println(z);
        System.out.println(z[1][1][2]);
        // System.out.println(z[0][0][3]); // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        //length vs length()
        String s ="sonalee"; 
        System.out.println(s.length()); // methode
         
        int[] f = new int[4];
        System.out.println(f.length); // array length variable

        String[] mystring1 = {"abc","def","xyz","mno"};
        // System.out.println(mystring1.length());// invalide Cannot invoke length() on the array type String[]
        // System.out.println(mystring1[0].length); //can not be work in String
        System.out.println(mystring1[0].length());
        System.out.println(mystring1.length);
        
        //Anonymous array
        /*An array in Java without any name is known as an anonymous array
        It is an array just for creating and using instantly. Using an anonymous array, we can pass an array with user values without the referenced variable.*/
       
        
        new int[]{10,20,30,40};

        // new int [3]{70,90,80};  invalid For Anonymous array creation, do not mention size in []. The number of values passing inside {} will become the size.

        new char[] {'x', 'y', 'z'};
      
        
    
    }
}

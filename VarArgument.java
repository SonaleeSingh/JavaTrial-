public class VarArgument {
    public static void main(String[] args) {
        //  sum();
        //  sum(1);
        //  sum(1,2);

       int[]x ={10,20,30};
       int[]y = {40,50,60};
       int[] z ={70,80};
       add(x,y,z);
 

    }

        // public static void sum(int...x) {
        //     int total = 0;
        //     for(int x1:x){
        //         total = total+ x1;
        //     }
        //     System.out.println(total);
        //     System.out.println(x.length);
            // last methode should be vararg methode
        // }
            public static void add(int[] ...a) {

            for(int[] i:a){ 
                System.out.println(i[0]);
            } //2darray 
                
            }
            
        
    
}

public class array3 {
    public static void main(String[] args) {
    //    int[][] x=new int[2][3];
    //    System.out.println(x); //[[I@372f7a8d  
    //    System.out.println(x[0]); //[I@2f92e0f4
    //    System.out.println(x[0][0]); //0
    int[][] x=new int[2][];
    System.out.println(x); //[[I@372f7a8d 
    System.out.println(x[0]); //null
    System.out.println(x[0][0]);  //Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "<local1>[0]" is null
    } 
}

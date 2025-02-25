public class array4 {
    public static void main(String[] args) {
        // reprsentation of array in one line 
        //1D array
        int[] x={10,20,30};
        System.out.println(x[1]); //x[0]=10 ,x[1]=20,x[2]=30
   
        //2D Array
        int[][] a={{10,20},{30,40,50}};
        System.out.println((a[0][1])+(a[1][1])); //20+40=60

        //3D Array
        int[][][] b={{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
        System.out.println(b[0][1][2]); //60
        System.out.println(b[1][0][1]); //80
        System.out.println(b[2][0][0]); //out of bond runtime error
        System.out.println(b[1][2][0]); // out of bond runtime error 
        System.out.println(b[1][1][1]); //100

    }
    
}

public class FunctionPattern {
    public static void main(String[] args) {
        LeftHalfPyramid(); //function Calling
       
    }

    public static void LeftHalfPyramid(){
        int row = 0;

        while (row < 5) {
            System.out.print("*");

            int i = 0;
            while(i < row){
                System.out.print(" *");
                i++;

            }
           
            System.out.println();
            row++;
        }
            
    }
    
}

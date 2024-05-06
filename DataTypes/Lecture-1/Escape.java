public class Escape {
    public static void main(String[] args) {
        System.out.println("Hey Satya!!");  //output:Hey Satya!!
        System.out.println("Hey\tSatya!!");  //output:Hey	Satya!!
        System.out.println("Hello\bSatya!!");  //output:HellSatya!!
        System.out.println("Hey\nSatya!!");   
        //output:Hey
        //       Satya!!
       
        System.out.println("Hey \'Satya!!\'");  //output:Hey 'Satya!!'
        System.out.println("Hey \"Satya!!\"");  //output:Hey "Satya!!"
        System.out.println("Hey \\Satya!!\\"); //output:Hey \Satya!!\ 
    }
}

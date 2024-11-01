public class stringClass {
    public static void main(String[] args) {
        int marks = 88;
        int ph = 634625;
        int ph2 = 656734625;
        String name = "Satya";
        System.out.printf("%s Your marks is %d", name ,marks);//Satya Your marks is 88
        System.out.printf("\n%S Your marks is %d", name ,marks);//SATYA Your marks is 88
        System.out.printf("\n%S your phone number is %,+15d",name,ph); //SATYA your phone number is        +634,625
        System.out.printf("\n%S your phone number is %,-+15d",name,ph);//SATYA your phone number is +634,625
        System.out.printf("\n%S your phone number is %,+d",name,ph2);//SATYA your phone number is +656,734,625
        System.out.printf("\n%,012d",ph);//00000634,625
        System.out.printf("\n%d%%",marks);//88%
    }
}

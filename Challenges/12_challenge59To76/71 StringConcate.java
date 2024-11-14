
// 71. Concatenate and Convert: Take two strings, concatenate them,
// and convert the result to uppercase.

 class  StringConcate {
    public static void main(String[] args) {
        String fName = "Satya";
        String lastName = "Gupta";

        String fullName = fName.concat(" " + lastName);
        System.out.println(fullName.toUpperCase());
    }
}


// Outputs : 

// SATYA GUPTA
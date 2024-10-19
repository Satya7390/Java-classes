public class ForEach {
    public static void main(String[] args) {
        String[] array = new String[] {
                "Ram", "Shyam", "Mohan", "Sohan", "Sita", "Gita"
        };
        forEach(array);
        // forLoop(array);
    }

    // using forEach loop
    // it is very easy and simple to apply on array to fech
    // data without any initialization of conditions

    public static void forEach(String array[]) {
        for (String name : array) {
            System.out.println(name);
        }
    }

    // using for loop
    public static void forLoop(String array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

// Outputs:

// Ram
// Shyam
// Mohan
// Sohan
// Sita
// Gita
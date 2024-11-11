
// 75. Take an array of words and concatenate them into a single string
// using StringBuilder.
class ArrayToString {

    public static void main(String[] args) {
        String[] arr = new String[]{
            "Today", "I", "am", "doing", "my", "75", "challenge", "and", "in", "my", "Github", "42", "streak", "has", "done!!"
        };

        StringBuilder sb = new StringBuilder();
        for (String string : arr) {
            sb.append(string).append(" ");
        }
        System.out.println(sb);

    }
}


// Output : 
// Today I am doing my 75 challenge and in my Github 42 streak has done!!
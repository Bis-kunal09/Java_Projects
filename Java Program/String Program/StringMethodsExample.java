public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        
        int length = str.length();
        System.out.println("Length: " + length);

        
        char firstChar = str.charAt(0);
        System.out.println("First character: " + firstChar);

        
        String substring = str.substring(7);
        System.out.println("Substring: " + substring);

        
        int indexOfComma = str.indexOf(",");
        System.out.println("Index of comma: " + indexOfComma);

        
        int lastIndexOfl = str.lastIndexOf("l");
        System.out.println("Last index of 'l': " + lastIndexOfl);

      
        String otherString = "Hello, World!";
        boolean areEqual = str.equals(otherString);
        System.out.println("Are equal: " + areEqual);

        
        String caseInsensitive = "hello, world!";
        boolean areEqualIgnoreCase = str.equalsIgnoreCase(caseInsensitive);
        System.out.println("Are equal (ignore case): " + areEqualIgnoreCase);

        
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWithWorld);

        
        boolean isEmpty = str.isEmpty();
        System.out.println("Is empty: " + isEmpty);

        
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        
        String replacedStr = str.replace("Hello", "Hi");
        System.out.println("Replaced string: " + replacedStr);

        
        String stringWithSpaces = "   Trim me   ";
        String trimmedStr = stringWithSpaces.trim();
        System.out.println("Trimmed string: " + trimmedStr);

        
        String concatStr = str.concat(" Have a nice day!");
        System.out.println("Concatenated string: " + concatStr);

        
        boolean matchesRegex = str.matches("Hello.*");
        System.out.println("Matches regex 'Hello.*': " + matchesRegex);

        
        String[] words = str.split(", ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        
        String sub = str.substring(7, 12);
        System.out.println("Substring (start to end): " + sub);

        
        String replacedAll = str.replaceAll("[Hl]", "X");
        System.out.println("Replaced all 'H' and 'l': " + replacedAll);
    }
}

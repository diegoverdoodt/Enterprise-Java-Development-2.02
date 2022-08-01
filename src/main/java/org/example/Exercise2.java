package org.example;

public class Exercise2 {

    /*
    Enunciado: Java has certain words that are considered “Java Keywords”.
    Keywords are reserved and cannot be used as variable names. Employing TDD,
    create a method that takes in a String and returns true if the String contains
    any Java Keywords. For example, break is a Java keyword. The String "Don't break my heart"
    should return true. The String "I love to breakdance" should return false. You will need
    to use Google to find a list of all Java Keywords.
    */
    public static void main(String[] args) {
        usedReservedKeyword("Don't break my heart");
        //System.out.println(usedReservedKeyword("Don't break my heart"));
    }



    public static boolean usedReservedKeyword(String frase){
        frase.toLowerCase();
        String[] fraseSplit = frase.split(" ");
        String[] reservedKeywords = {"abstract", "assert", "boolean", "break",
                "byte", "case", "catch", "char",
                "class", "const", "continue", "default",
                "do", "double", "else", "enum",
                "extends", "final", "finally", "float",
                "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface",
                "long", "native", "new", "package",
                "private", "protected", "public", "return",
                "short", "static", "staticfp", "super",
                "switch", "synchronized", "this", "throw",
                "throws", "transient", "try", "void",
                "volatile", "while"};

        boolean result = false;

        for (int i=0; i<fraseSplit.length; i++){
            for (int j=0; j<reservedKeywords.length; j++){
                if (fraseSplit[i].equals(reservedKeywords[j])) {
                    System.out.println("La palabra " + fraseSplit[i].toString() + " es una palabra reservada.");
                    result = true;
                    break;
                }
            }
        }
      return result;
    }
}


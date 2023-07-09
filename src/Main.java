import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        /// print in cli
        System.out.println("First Line");
        System.out.println("Second Line");

        /// final keyword (const in c++)
        final int FINAL_INT = 100;

        /// primitive data type
        byte size8Bit = 10;
        short size16Bit = 1000;
        int size32Bit = 1000;
        long size64Bit = 1000L;
        float size32BitFloat = 1000.5f;
        double size64BitDouble = 1000.5d;
        boolean booleanData = false;
        char size8BitChar = 'C';

        /// arithmetic operator
        float sum = 2.5f + 2;
        double subtract = 2.5f - 2;
        double multiply = 2.5d * 2;
        double divide = 2.5d / 2;
        double reminder = 2.5 % 2;

        int number = 0;
        ++number;
        number++;
        --number;
        number++;

        number += 2;
        number -= 2;
        number *= 2;
        number /= 2;
        number %= 2;

        /**
         /// operator precedence
         * a++, a-- > ++a, --a > *, /, % > +, -
         * if same precedence then calculated left to right
         * Note: use brackets for complex equations
         */

        /// type cast
        long longVar = 10L;
        // Narrowing needs to be explicitly declared
        byte byteVar = (byte) longVar;
        // Widening is done automatically by the compiler
        longVar = byteVar;

        /// conditional operator
        short firstShortInt = 1;
        short secondShortInt2 = 2;
        short thirdShortInt2 = 3;

        if (firstShortInt > 1) {
            // The visibility of the var is only within this block
            short insideBlockStatement = 1;
        }

        if (firstShortInt > 1) ;
        if (firstShortInt < 1) ;
        if (firstShortInt >= 1) ;
        if (firstShortInt <= 1) ;
        if (firstShortInt != 1) ;
        if (firstShortInt == 1) ;

        // both side of & is compared
        if (firstShortInt == 1 & secondShortInt2 == 2) ;

        // left is compared first.
        // If left true then right is compared.
        // If left false then right is not compared.
        if (firstShortInt == 1 && secondShortInt2 == 2) ;
        else if (thirdShortInt2 == 3) ;
        else ;

        final int result;
        switch (firstShortInt) {
            case 1:
                result = 100;
                break;
            case 2:
                result = 200;
                break;
            default:
                result = 0;
        }

        /// array
        double[] doubleArray = new double[5];

        /// loop
        int counter = 0;
        do {
            ++counter;
        } while (counter < 5);
        for (int index = 0; index < 5; ++index) ;
        for (double Item : doubleArray) ;

        /// string
        String lFirstName = "rashed";
        String lFamilyName = "azad";
        String lFullName = lFirstName + " " + lFamilyName;
        String lTempFullName = "rashed azad";
        // will return false. Because they compare reference (address)
        if (lFullName == lTempFullName) ;
        // will return true. Because they do char by char comparison
        if (lFullName.equals(lTempFullName)) ;
        // intern looks for the string in the memory
        // If not found one it creates one and store the reference (memory location) in the variable
        // If found as in case of lFullNameInternTemp. It stores the same reference.
        String lFullNameIntern = lFullName.intern();
        String lFullNameInternTemp = lTempFullName.intern();
        // will return true.
        // intern stores the reference of the string.
        if (lFullNameIntern == lFullNameInternTemp) ;

        /// method (function)
        doNothing(new String[]{"1", "1.5d"});

        /// string builder
        // string builder provides efficient way to work with string
        StringBuilder lStringBuilderObj = new StringBuilder();
        lStringBuilderObj.append("Hello ");
        lStringBuilderObj.append("World");
        String lStringFromStringBuilder = lStringBuilderObj.toString();

        /// string format specifier
        // precision point
        System.out.println(String.format("Up to 3 floating precision %.2f", 132.34569537f));
        // hex representation
        System.out.println(String.format("Hex representation of %d = %#xf", 20, 20));
        // scientific notation
        System.out.println(String.format("Scientific representation of %.3f =  %.3e", 132.34569537f, 132.34569537f));
        // width formatting
        System.out.println(String.format("Width Formatted. Width: %10f Length: %10f", 1553.332, 2.13));
        System.out.println(String.format("Width Formatted. Width: %10f Length: %10f", 1.332, 2556.13));
        // zero formatted. (used for coordinate system)
        System.out.println(String.format("Zero Formatted. Width: %010f Length: %010f", 1553.332, 2.13));
        System.out.println(String.format("Zero Formatted. Width: %010f Length: %010f", 1.332, 2556.13));
        // left justified ( - )
        System.out.println(String.format("Left Justified. Width: %-10f Length: %-10f", 1553.332, 2.13));
        System.out.println(String.format("Left Justified. Width: %-10f Length: %-10f", 1.332, 2556.13));
        // grouped ( , )
        System.out.println(String.format(Locale.ENGLISH, "Grouped with , : %,d", 1553332));
        // Space (Align both number)
        System.out.println(String.format("Space : % d", 16));
        System.out.println(String.format("Space : % d", -15));
        // + (Show sign)
        System.out.println(String.format("Plus : %+d", 16));
        System.out.println(String.format("Plus : %+d", -15));
        // ( (Show negative number in ())
        System.out.println(String.format("Space : % (d", 16));
        System.out.println(String.format("Space : % (d", -15));
        // Index based formatting (index is 1 based)
        System.out.println(String.format("First: %1$d, Third: %3$d, Second: %2$d", 1, 2, 3));

        System.out.println("End of Getting Started with Programming in Java 11");
    }

    private static void doNothing(String[] aArgs) {
        int lArg0 = Integer.parseInt(aArgs[0]);
        double lArg1 = Double.parseDouble(aArgs[1]);
    }

}

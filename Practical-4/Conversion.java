class Conversion {
    public static String toXXString(String num, String format) {
        int number = Integer.parseInt(num);
        format = format.toUpperCase();

        if (format.equals("B")) {
            return Integer.toBinaryString(number);
        } else if (format.equals("H")) {
            return Integer.toHexString(number).toUpperCase();
        } else if (format.equals("O")) {
            return Integer.toOctalString(number);
        } else if (format.equals("D")) {
            return Integer.toString(number);
        }

        return "Invalid format";
    }

    public static void main(String[] args) {
        System.out.println(toXXString("35", "b"));
        System.out.println(toXXString("35", "h"));
        System.out.println(toXXString("35", "O"));
        System.out.println(toXXString("35", "D"));
    }
}


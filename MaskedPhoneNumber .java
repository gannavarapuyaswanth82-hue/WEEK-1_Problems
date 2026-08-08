public class MaskedPhoneNumber {

    static String maskPhoneNumber(String phone) {

        // Validate length
        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        // Validate that every character is a digit
        for (int i = 0; i < phone.length(); i++) {

            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        String lastFourDigits = phone.substring(6);

        StringBuilder result = new StringBuilder("XXXXXX");

        result.insert(6, "-");
        result.append(lastFourDigits);

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(
            maskPhoneNumber("9876543210")
        );

        System.out.println(
            maskPhoneNumber("98765")
        );
    }
}

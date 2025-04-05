public class NullPointException {
    public static void main(String[] args) {
        String text = null;
        try {
            System.out.println(text.length()); // Attempt to access a null object
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot access length of a null object.");
        }
    }
}

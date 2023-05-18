public class ArrayCopy {
    public static void main(String[] args) {
        String[] favouritePlayers = {"Ronaldo", "Messi", "Haaland", "Bernado"};
        String[] eliteFavouritePlayers = new String[2];
        System.arraycopy(favouritePlayers, 0, eliteFavouritePlayers, 0, 2);
        for (String player : eliteFavouritePlayers) {
            System.out.println(player + " ");
        }

        String[] otherFavourites = java.util.Arrays.copyOfRange(favouritePlayers, 2, 4);
        System.out.println(java.util.Arrays.toString(otherFavourites));
        int[] oddNumbers = {1, 3, 5, 7, 9, 11, 13};
        java.util.Arrays.stream(favouritePlayers).map(player -> player + " ").forEach(System.out::print);
    }
}

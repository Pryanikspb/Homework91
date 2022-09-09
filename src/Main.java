public class Main {
    public static void main(String[] args) {
        Author fedorDostoevsky = new Author("Fedor", "Dostoevsky");
        Book crimeAndPunishment = new Book("Crime and punishment", 1970, fedorDostoevsky);
        crimeAndPunishment.setPublishDate(1900);
        System.out.println(crimeAndPunishment);

        Author mikhailBulgakov = new Author("Mikhail", "Bulgakov");
        Book dogsHeart = new Book("Dogs Heart", 1920, mikhailBulgakov);
        System.out.println(dogsHeart);

        System.out.println(Book.hashCode() == Book2.hashCode());
        System.out.println(Book.equals(Book2));

    }
}
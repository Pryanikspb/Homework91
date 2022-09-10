public class Main {
    public static void main(String[] args) {

        Author author = new Author("Иван", "Ильин");
        Book book = new Book("О сопротивлении злу силою", 1950, author);
        Book book2 = new Book("О сопротивлении злу силою", 1950, author);

        Author fedorDostoevsky = new Author("Fedor", "Dostoevsky");
        Book crimeAndPunishment = new Book("Crime and punishment", 1970, fedorDostoevsky);
        crimeAndPunishment.setPublishDate(1900);
        System.out.println(crimeAndPunishment);

        Author mikhailBulgakov = new Author("Mikhail", "Bulgakov");
        Book dogsHeart = new Book("Dogs Heart", 1920, mikhailBulgakov);
        System.out.println(dogsHeart);
        System.out.println(book);

        System.out.println(book.equals(book2));
        System.out.println(book.hashCode() == book2.hashCode());

    }
}
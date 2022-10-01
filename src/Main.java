public class Main {
    public static void separation() {
        System.out.println("===============================================================================");
    }
    public static void main(String[] args) {
        Author tolstoi = new Author("Lev","Tolstoi");
        Author pushkin = new Author("Alexander","Pushkin");
        Book warAndPeace = new Book(tolstoi, "War and Peace", 0);
        Book captainsDaugher = new Book(pushkin, "Captain's Daugher", 0);
        warAndPeace.setTheYearOfPublishing(1865);
        captainsDaugher.setTheYearOfPublishing(1836);
        separation();
        System.out.println(captainsDaugher);
        separation();
        System.out.println(warAndPeace);
        separation();



    }
}
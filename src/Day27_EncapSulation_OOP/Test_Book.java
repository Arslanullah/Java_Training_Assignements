package Day27_EncapSulation_OOP;

public class Test_Book {
    public static void main(String[] args) {


        Book book=new Book("Holy Quran","EnglishVersion","Mohammad Pickhtel",154);


        Ebook ebook1=new Ebook("shahih bukahari","Hadithbook","Sahih Muslim",100,120,100);


        AudioBook audioBook=new AudioBook("shahih bukahari","Hadithbook","Sahih Muslim",100,10,"Sahil Adeem");

        System.out.println(" ------- Holy quran The Book ----------------------------------");



        System.out.println(book);



        System.out.println("-----  E  Book ------- -----------------------------------------");
        System.out.println(ebook1);
        ebook1.readbook();

        System.out.println("---------Audio Book----");

        System.out.println(audioBook);


    }
}

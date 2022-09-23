public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bob",8,50);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Jake",4,70);
        cat2.introduce();
        cat2.printCatInfo();
    }
}

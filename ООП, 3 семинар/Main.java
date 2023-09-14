public class Main implements Constants {
    public static void main(String[] args) {
        Cat cat = new Cat();
        List<Cat> othercats = new ArrayList<>();
        
        othercats.add(new Cat("Мурзик", 6, "Сергей"));
        othercats.add(new Cat("Снежок", 9, "Александр"));
        othercats.add(new Cat("Сахарок", 7, "Глеб"));
        othercats.add(new Cat("Буся", 3, "Екатерина"));

        cat.setName(CAT_NAME);
        cat.setAge(CAT_AGE);
        cat.setOwnerName(OWNER_NAME);

        cat.printGreeting();

        Predicates<Integer> ElderCatCheck = ValueForAge -> ValueForAge > OLD_CAT_AGE;
        boolean SortResult = ElderCatCheck.testing(cat.getAge());
        if (result) {
            System.out.println(cat.getName() + ", пора пройти диспансеризацию!");
        }

        cat.Soundmaking();
        cat.Stepmaking();
        cat.AnimalCare();
        cat.AnimalCall();

        System.out.println("\nКошки до того, как их отсортировали: ");
        for (Cat items : othercats) {
            System.out.println(items);
        }

        Comparator<Cat> ComparatorForAge = Comparator.IntComparing(items -> items.getAge());
        Collections.sort(othercats, ComparatorForAge);

        System.out.println("\n Кошки, отсортированные по возрасту: ");
        for (Cat items : othercats) {
            System.out.println(items);
        }
    }
}
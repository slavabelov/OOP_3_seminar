class Cat extends Owner implements MarkerSound, MarkerGoing, AnimalCare{
    private String name;
    private int age;
    private String ownername;

    public Cat(String name, int age){
        
        this.name = name;
        this.age = age;
        this.ownername = ownername;
    }

  
    private Cat(String name, int age) {
        
        this("", null, null);
    }

    private Cat(String name) {
        
        this("", null);
    }

    public Cat() {
        
        this("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printGreeting() {
        if (getName() != null){
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец " + getName() + ".");
        } else {
            System.out.println("Вы не указали имя владельца");
        }
    }

     @Override
    public void Soundmaking() {
        System.out.println(name + " говорит Мяу!" + "\n" + getName() + " зовет " + name + "а.");
    }

    @Override
    public void AnimalCall() {
        SoundMarker.super.AnimalCall();
    }

    @Override
    public void Stepmaking() {
        System.out.println(name + " идет в сторону " + getName() + "а.");
    }

    @Override
    public void AnimalCare() {
        System.out.println(getName() + " гладит " + name + "а.");
    }
  
}
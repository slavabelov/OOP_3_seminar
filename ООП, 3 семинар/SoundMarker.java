public interface SoundMarker {
    void Soundmaking();
    default void AnimalCall() {
        System.out.println("Все животные счастливы!");
    }
}
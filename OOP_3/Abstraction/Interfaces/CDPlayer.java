public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("I Start Rock Music in a Car");
    }

    @Override
    public void stop() {
        System.out.println("I Stop the music in the Car");
    }

}
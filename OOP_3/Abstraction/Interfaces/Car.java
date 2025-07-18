public class Car implements Engine, Brake, Media{
    @Override
    public void brake(){
        System.out.println("I Brake a Car");
    }

    @Override
    public void start(){
        System.out.println("I Start a Car");
    }

    @Override
    public void accelerate(){
        System.out.println("I Accelerate a Car");
    }

    @Override
    public void stop(){
        System.out.println("I Stop a Car");
    }

    public static void main(String[] args) {
        Car car=new Car();
        car.accelerate();
        car.stop();
        car.brake();
        car.start();
        Media carMedia =new Car();
        carMedia.stop();
        NiceCar car = new NiceCar();
        

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}

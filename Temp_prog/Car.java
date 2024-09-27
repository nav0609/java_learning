interface light {
    boolean isRunning();

    void turnOn();

    void turnOff();
}

interface headlight extends light {
    void blinkers();
}

interface taillight extends light {
}

interface lightsystem extends headlight, taillight {
}

interface speaker {
    void music();
}

interface audiosystem extends speaker {
}

class Engine {
    void start() {
        System.out.println("Engine start");
    }

    private void stop() {
        System.out.println("Engine stop");
    }

    void restart() {
        start();
        stop();
    }
}

public class Car extends Engine implements lightsystem {
    public void blinkers() {
        System.out.println("blinkers are running");
    }

    public boolean isRunning() {
        super.restart();
        return true;
    }

    public void turnOn() {
        System.out.println("is turned on");
    }

    public void turnOff() {
        System.out.println("is turned off");
    }

    public static void main(String[] args) {
        Car maruti = new Car();
        maruti.start();
        maruti.restart();
        maruti.isRunning();
        maruti.turnOn();
        maruti.turnOff();
        maruti.blinkers();
    }
}

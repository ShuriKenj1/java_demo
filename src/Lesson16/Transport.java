package Lesson16;

public enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22), UNDEFINED(0);

    private int speed;

    Transport(int i) {
        speed = i;
    }

    int getSpeed(){
        return speed;
    }
}
package Lesson15;

public class Dawg {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    Dawg(String name){
        this.name = name;
    }

    public void putCollar(){
        System.out.println("The collar is on!");
        isCollarPutOn = true;
    }

    public void putLeash(){
        System.out.println("The leash is on!");
        isLeashPutOn = true;
    }

    public void putMuzzle(){
        System.out.println("The muzzle is on!");
        isMuzzlePutOn = true;
    }

    public void walk() throws DawgIsNotReadyException {
        if (isMuzzlePutOn && isLeashPutOn && isCollarPutOn){
            System.out.println("Great, let's go for a walk. " + name + " is happy!");
        } else {
            throw new DawgIsNotReadyException("The dawg " + name + " is not ready for walk. " +
                    "Please check if everything is right.");
        }
    }

    public static void main(String[] args) {
        Dawg dawg = new Dawg("Braza");
        dawg.putCollar();
        dawg.putLeash();
        try {
            dawg.walk();
        } catch (DawgIsNotReadyException e) {
            e.printStackTrace();
            System.out.println("Check everything again!" +
                    "\nIs collar on? " + dawg.isCollarPutOn +
                    "\nIs leash on? " + dawg.isLeashPutOn +
                    "\nIs muzzle on? " + dawg.isMuzzlePutOn);
        }
    }
}

package ch07;

public class Television implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void volumeUp() {
        if(volume < MAX_VOLUME){
            this.volume++;
        }
    }

    @Override
    public void volumeDown() {
        if(volume > MIN_VOLUME){
            this.volume--;
        }
    }

    public void volumeState(){
        System.out.println("volume : " + volume);
    }
}

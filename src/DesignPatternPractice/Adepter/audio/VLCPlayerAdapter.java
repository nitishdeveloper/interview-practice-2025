package DesignPatternPractice.Adepter.audio;

public class VLCPlayerAdapter implements AudioTypePlayer {
    private final VLCPlayer vlcPlayer = new VLCPlayer();

    @Override
    public void play(String fileName) {
        vlcPlayer.playVLC(fileName);
    }
}

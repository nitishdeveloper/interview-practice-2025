package DesignPatternPractice.Adepter.audio;

public class MP4PlayerAdapter implements AudioTypePlayer {
    private final MP4Player mp4Player = new MP4Player();

    @Override
    public void play(String fileName) {
        mp4Player.playMP4(fileName);
    }
}

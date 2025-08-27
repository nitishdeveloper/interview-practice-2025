package DesignPatternPractice.Adepter.audio;

public class MainAudioPlayer {
    public static void main(String[] args) {
        AudioPlayer player = new MediaAdapter();
        player.playAudio(AudioType.MP4, "video.mp4");
        player.playAudio(AudioType.VLC, "video.vlc");
    }
}

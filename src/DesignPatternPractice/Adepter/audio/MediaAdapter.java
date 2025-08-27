package DesignPatternPractice.Adepter.audio;

import java.util.EnumMap;
import java.util.Map;

public class MediaAdapter implements AudioPlayer {
    private static final Map<AudioType, AudioTypePlayer> audioTypePlayerEnumMap = new EnumMap<>(AudioType.class);

    static {
        audioTypePlayerEnumMap.put(AudioType.MP4, new MP4PlayerAdapter());
        audioTypePlayerEnumMap.put(AudioType.VLC, new VLCPlayerAdapter());
    }

    @Override
    public void playAudio(AudioType audioType, String fileName) {
        AudioTypePlayer player = audioTypePlayerEnumMap.get(audioType);
        if (player != null) {
            player.play(fileName);
        } else {
            System.out.println("Unsupported format: " + audioType);
        }
    }
}

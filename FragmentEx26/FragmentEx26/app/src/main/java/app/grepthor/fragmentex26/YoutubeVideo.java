package app.grepthor.fragmentex26;

/**
 * Created by Grepthor_4 on 1/4/2018.
 */

public class YoutubeVideo {

    String videoUrl;
    public YoutubeVideo() {}

    public YoutubeVideo(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}

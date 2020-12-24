package ybigta.kpoptwitter.Domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Website {
    public Website(String youtube, String twitter, String vlive, String fancafe) {
        this.youtube = youtube;
        this.twitter = twitter;
        this.vlive = vlive;
        this.fancafe = fancafe;
    }

    private String youtube;
    private String twitter;
    private String vlive;
    private String fancafe;


}

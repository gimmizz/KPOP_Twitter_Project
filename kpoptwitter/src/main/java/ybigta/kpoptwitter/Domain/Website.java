package ybigta.kpoptwitter.Domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Website {
    public Website(String youtube, String twitter, String insta, String fancafe) {
        this.youtube = youtube;
        this.twitter = twitter;
        this.insta = insta;
        this.fancafe = fancafe;
    }

    private String youtube;
    private String twitter;
    private String insta;
    private String fancafe;


}

package ybigta.kpoptwitter.Domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class Member {
    public Member(String link, String name, String birth, String position) {
        this.link = link;
        this.name = name;
        this.birth = birth;
        this.position = position;
    }

    private String link;
    private String name;
    private String birth;
    private String position;

}

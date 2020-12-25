package ybigta.kpoptwitter.Domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@Getter
@Setter
public class Information {
    public Information(String name, String debut, String enter, String fandom) {
        this.name = name;
        this.debut = debut;
        Enter = enter;
        this.fandom = fandom;
    }

    private String name;
    private String debut;
    private String Enter;
    private String fandom;
}

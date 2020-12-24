package ybigta.kpoptwitter.Repository;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import ybigta.kpoptwitter.Domain.Information;
import ybigta.kpoptwitter.Domain.Website;
import ybigta.kpoptwitter.Service.MemberService;

import java.lang.reflect.Member;
import java.util.*;


@Repository
@Getter
@Setter
public class MemoryRepository{
    Information info1 = new Information("BTS", new Date(), "Bighit", "Army");
    Information info2 = new Information("OhMyGirl", new Date(), "WM","Miracle");
    Information info3 = new Information("IU", new Date(), "KakaoM", "유애나");
    Information info4 = new Information("Izone", new Date(), "Produce48","Wizone");
    Information info5 = new Information("EXO", new Date(), "SM Entertainment", "EXO-L");
    Information info6 = new Information("Twice", new Date(), "JYP Entertainment", "Once");
    private ArrayList<Information> informationlist = new ArrayList<Information>(Arrays.asList(info1));

    private ArrayList<Member> memberlist= new ArrayList<>();
    private ArrayList<Website> website = new ArrayList<>();

}

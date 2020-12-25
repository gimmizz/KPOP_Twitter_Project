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
    Information info1 = new Information("BTS", new Date(2013,6,13), "Bighit Entertainment", "Army");
    Information info2 = new Information("OhMyGirl", new Date(2015,4,21), "WM Entertainment","Miracle");
    Information info3 = new Information("IU", new Date(2008,9,18), "KakaoM", "유애나");
    Information info4 = new Information("Izone", new Date(2018,10,29), "오프더레코드 스윙 엔터테인먼트","Wizone");
    Information info5 = new Information("EXO", new Date(2012,4,12), "SM Entertainment", "EXO-L");
    Information info6 = new Information("Twice", new Date(2015,10,20), "JYP Entertainment", "Once");
    Information info7 = new Information("BlackPink", new Date(2016,8,8), "YG Entertainment", "Blink");
    Information info8 = new Information("NCT", new Date(2016,4,9), "SM Entertainment", "NCTzen");
    Information info9 = new Information("BTOB", new Date(2012,3,21), "CUBE Entertainment", "Melody");
    Information info10 = new Information("RedVelvet", new Date(2014,8,1), "SM Entertainment", "ReVeluv");
    private ArrayList<Information> informationlist = new ArrayList<Information>(Arrays.asList(info1,info2, info3,info4, info5,info6,info7,info8,info9,info10));

    private ArrayList<Member> memberlist= new ArrayList<>();
    private ArrayList<Website> website = new ArrayList<>();
    Website web1 = new Website("https://www.youtube.com/user/BANGTANTV","https://twitter.com/bts_bighit","https://www.instagram.com/BTS.bighitofficial/","http://cafe.daum.net/BANGTAN");
    Website web2 = new Website("https://youtube.com/c/OHMYGIRL","https://twitter.com/WM_OHMYGIRL?s=20","https://instagram.com/wm_ohmygirl?igshid=1r7a9ukcvulnb");
    Website web3 = new Website("https://www.youtube.com/channel/UC3SyT4_WLHzN7JmHQwKQZww","https://twitter.com/_IUofficial","https://www.instagram.com/dlwlrma/","http://cafe.daum.net/IU");
    Website web4 = new Website("https://www.youtube.com/channel/UCe_oTYByLWQYCUmgmOMU_xw","https://twitter.com/official_izone","https://www.instagram.com/official_izone/","http://cafe.daum.net/official-izone");
    Website web5 = new Website("https://www.youtube.com/channel/UCzCedBCSSltI1TFd3bKyN6g","https://twitter.com/weareoneEXO","https://www.instagram.com/weareone.exo/","http://exo.smtown.com/");
    Website web6 = new Website("https://www.youtube.com/channel/UCzgxx_DM2Dcb9Y1spb9mUJA/featured","https://twitter.com/JYPETWICE/","https://www.instagram.com/twicetagram/","https://fans.jype.com/");
    Website web7 = new Website("https://youtube.com/c/BLACKPINKOFFICIAL","https://twitter.com/BLACKPINK?s=20","https://instagram.com/blackpinkofficial?igshid=1jz8bhf4o1l4l",);
    Website web8 = new Website("https://youtube.com/c/nctsmtown","https://twitter.com/NCTsmtown?s=20","https://instagram.com/nct?igshid=1245845smutzw");
    Website web9 = new Website("https://youtube.com/user/officialbtob","https://twitter.com/OFFICIALBTOB?s=20","https://instagram.com/cube_official_btob?igshid=184b2464cckru");
    Website web10 = new Website("https://youtube.com/c/redvelvet","https://twitter.com/RVsmtown?s=20","https://instagram.com/redvelvet.smtown?igshid=15dg0sqd3oziq");






}

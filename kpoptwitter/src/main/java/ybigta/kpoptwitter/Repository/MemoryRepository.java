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
    Information info1 = new Information("BTS", "데뷔일   :  2013년 6월 13일", "소속사 :      Bighit Entertainment", "팬덤 : Army");
    Information info2 = new Information("OhMyGirl", "데뷔일   :  2015년 4월 21일", "소속사 :      WM Entertainment","팬덤 : Miracle");
    Information info3 = new Information("IU", "데뷔일   :  2008년 9월 18일", "소속사 :      KakaoM Entertainment", "팬덤 : 유애나");
    Information info4 = new Information("Izone", "데뷔일   :  2018년 10월 29일", "소속사 :      오프더레코드 스윙 엔터테인먼트","팬덤 : Wizone");
    Information info5 = new Information("EXO", "데뷔일   :  2012년 4월 12일", "소속사 :      SM Entertainment", "팬덤 : EXO-L");
    Information info6 = new Information("Twice", "데뷔일   :  2015년 10월 20일", "소속사 :      JYP Entertainment", "팬덤 : Once");
    Information info7 = new Information("BlackPink", "데뷔일   :              2016년 8월 8일", "소속사 :      YG Entertainment", "팬덤 : Blink");
    Information info8 = new Information("NCT", "데뷔일   :  2016년 4월 9일", "소속사 :      SM Entertainment", "팬덤 : NCTzen");
    Information info9 = new Information("BTOB", "데뷔일   :  2012년 3월 21일", "소속사 :      CUBE Entertainment", "팬덤 : Melody");
    Information info10 = new Information("RedVelvet", "데뷔일   :  2014년 8월 1일", "소속사 :      SM Entertainment", "팬덤 : ReVeluv");
    private ArrayList<Information> informationlist = new ArrayList<Information>(Arrays.asList(info1,info2, info3,info4, info5,info6,info7,info8,info9,info10));

    private ArrayList<Member> memberlist= new ArrayList<>();

    Website web1 = new Website("https://www.youtube.com/user/BANGTANTV","https://twitter.com/bts_bighit","https://www.instagram.com/BTS.bighitofficial/","http://cafe.daum.net/BANGTAN");
    Website web2 = new Website("https://youtube.com/c/OHMYGIRL","https://twitter.com/WM_OHMYGIRL?s=20","https://instagram.com/wm_ohmygirl?igshid=1r7a9ukcvulnb","http://cafe.daum.net/-ohmygirl");
    Website web3 = new Website("https://www.youtube.com/channel/UC3SyT4_WLHzN7JmHQwKQZww","https://twitter.com/_IUofficial","https://www.instagram.com/dlwlrma/","http://cafe.daum.net/IU");
    Website web4 = new Website("https://www.youtube.com/channel/UCe_oTYByLWQYCUmgmOMU_xw","https://twitter.com/official_izone","https://www.instagram.com/official_izone/","http://cafe.daum.net/official-izone");
    Website web5 = new Website("https://www.youtube.com/channel/UCzCedBCSSltI1TFd3bKyN6g","https://twitter.com/weareoneEXO","https://www.instagram.com/weareone.exo/","http://exo.smtown.com/");
    Website web6 = new Website("https://www.youtube.com/channel/UCzgxx_DM2Dcb9Y1spb9mUJA/featured","https://twitter.com/JYPETWICE/","https://www.instagram.com/twicetagram/","https://fans.jype.com/");
    Website web7 = new Website("https://youtube.com/c/BLACKPINKOFFICIAL","https://twitter.com/BLACKPINK?s=20","https://instagram.com/blackpinkofficial?igshid=1jz8bhf4o1l4l","https://www.ygfamily.com/artist/Main.asp?LANGDIV=K&ATYPE=2&ARTIDX=70");
    Website web8 = new Website("https://youtube.com/c/nctsmtown","https://twitter.com/NCTsmtown?s=20","https://instagram.com/nct?igshid=1245845smutzw","http://nct.smtown.com/Intro");
    Website web9 = new Website("https://youtube.com/user/officialbtob","https://twitter.com/OFFICIALBTOB?s=20","https://instagram.com/cube_official_btob?igshid=184b2464cckru","http://cafe.daum.net/cube-btob");
    Website web10 = new Website("https://youtube.com/c/redvelvet","https://twitter.com/RVsmtown?s=20","https://instagram.com/redvelvet.smtown?igshid=15dg0sqd3oziq","http://redvelvet.smtown.com/");
    private ArrayList<Website> website = new ArrayList<>(Arrays.asList(web1,web2,web3,web4,web5,web6,web7,web8,web9,web10));

}

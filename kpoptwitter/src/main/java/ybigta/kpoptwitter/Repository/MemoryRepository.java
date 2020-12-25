package ybigta.kpoptwitter.Repository;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import ybigta.kpoptwitter.Domain.Information;
import ybigta.kpoptwitter.Domain.Member;
import ybigta.kpoptwitter.Domain.Website;
import ybigta.kpoptwitter.Service.MemberService;

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


    private ArrayList<Member> memberlist1= new ArrayList<>();
    private ArrayList<Member> memberlist2= new ArrayList<>();
    Member member3_1 = new Member("https://www.instagram.com/dlwlrma/","아이유","1993년 5월 16일","본인");
    private ArrayList<Member> memberlist3= new ArrayList<>(Arrays.asList(member3_1));
    private ArrayList<Member> memberlist4= new ArrayList<>();
    private ArrayList<Member> memberlist5= new ArrayList<>();
    private ArrayList<Member> memberlist6= new ArrayList<>();
    Member member7_1 = new Member("https://www.instagram.com/sooyaaa__/","지수","1995년 1월 3일 ","리드보컬");
    Member member7_2 = new Member("https://www.instagram.com/jennierubyjane/","제니","1996년 1월 16일 ","메인래퍼, 서브보컬");
    Member member7_3 = new Member("https://www.instagram.com/roses_are_rosie/","로제","1997년 2월 11일 ","메인보컬, 리드댄서");
    Member member7_4 = new Member("null","리사","1997년 3월 27일","메인댄서, 리드래퍼, 서브보컬");
    private ArrayList<Member> memberlist7= new ArrayList<>(Arrays.asList(member7_1,member7_2,member7_3,member7_4));
    private ArrayList<Member> memberlist8= new ArrayList<>();
    private ArrayList<Member> memberlist9= new ArrayList<>();
    Member member10_1 = new Member("https://www.instagram.com/renebaebae/","아이린","1991년 3월 29일","센터");
    Member member10_2 = new Member("https://www.instagram.com/hi_sseulgi/","슬기","1994년 2월 10일","메인댄서, 리드보컬");
    Member member10_3 = new Member("https://www.instagram.com/todayis_wendy/","웬디","1994년 2월 21일","메인보컬");
    Member member10_4 = new Member("https://www.instagram.com/_imyour_joy/","조이","1996년 9월 3일","리드래퍼, 서브보컬");
    Member member10_5 = new Member("https://www.instagram.com/yerimiese/","예리","1999년 3월 5일","서브보컬, 서브래퍼");
    private ArrayList<Member> memberlist10= new ArrayList<>(Arrays.asList(member10_1,member10_2,member10_3,member10_4,member10_5));
    private ArrayList<ArrayList<Member>> memberlistlist = new ArrayList<>(Arrays.asList(memberlist1,memberlist2,memberlist3,memberlist4,memberlist5,memberlist6,memberlist7,memberlist8,memberlist9,memberlist10));

}

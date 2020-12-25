package ybigta.kpoptwitter.Repository;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import ybigta.kpoptwitter.Domain.Information;
import ybigta.kpoptwitter.Domain.Member;
import ybigta.kpoptwitter.Domain.Website;
import ybigta.kpoptwitter.Service.MemberService;

import java.lang.reflect.Array;
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
    Information info9 = new Information("AESPA", "데뷔일   :  2020년 11월 17일", "소속사 :      SM Entertainment", "팬덤 : MY");
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
    Website web9 = new Website("https://www.youtube.com/aespa","https://twitter.com/aespa_Official","https://www.instagram.com/aespa_official/","https://www.vlive.tv/channel/97CCED");
    Website web10 = new Website("https://youtube.com/c/redvelvet","https://twitter.com/RVsmtown?s=20","https://instagram.com/redvelvet.smtown?igshid=15dg0sqd3oziq","http://redvelvet.smtown.com/");
    private ArrayList<Website> website = new ArrayList<>(Arrays.asList(web1,web2,web3,web4,web5,web6,web7,web8,web9,web10));



    Member member1_1 = new Member("null","진","1992년 12월 4일","서브보컬");
    Member member1_2= new Member("null","슈가","1993년 3월 9일","리드래퍼");
    Member member1_3= new Member("null","제이홉","1994년 2월 18일","메인댄서");
    Member member1_4= new Member("null","RM","1994년 9월 12일","리더, 메인래퍼");
    Member member1_5= new Member("null","지민","1995년 10월 13일","메인댄서");
    Member member1_6= new Member("null","뷔","1995년 12월 30일","서브보컬");
    Member member1_7= new Member("null","정국","1997년 9월 1일","메인보컬");
    private ArrayList<Member> memberlist1= new ArrayList<>(Arrays.asList(member1_1,member1_2,member1_3,member1_4,member1_5,member1_6,member1_7));

    Member member2_1 = new Member("https://www.instagram.com/candyz_hyojung/","효정","1994. 07. 28","리더, 리드보컬");
    Member member2_2 = new Member("https://www.instagram.com/mimmiiiya/","미미","1995. 05. 01","랩");
    Member member2_3 = new Member("https://www.instagram.com/yoo__sha/","유아","1995. 09. 17","보컬");
    Member member2_4 = new Member("https://www.instagram.com/hyun_maxiang/","승희","1996. 01. 25","리드보컬");
    Member member2_5 = new Member("https://www.instagram.com/jihoa_f/?igshid=1hrwxpq5qt2yk/","지호","1997. 04. 04","보컬");
    Member member2_6 = new Member("https://www.instagram.com/baeyu_b/","비니","1997. 09. 09","보컬");
    Member member2_7 = new Member("https://www.instagram.com/ye._.vely618/","아린","1999. 06. 18","보컬");
    private ArrayList<Member> memberlist2= new ArrayList<>(Arrays.asList(member2_1,member2_2,member2_3,member2_4,member2_5,member2_6,member2_7));

    Member member3_1 = new Member("https://www.instagram.com/dlwlrma/","아이유","1993년 5월 16일","본인");
    private ArrayList<Member> memberlist3= new ArrayList<>(Arrays.asList(member3_1));


    Member member4_1 = new Member("null","권은비","1995. 09. 27.","리더, 메인댄서");
    Member member4_2 = new Member("https://www.instagram.com/39saku_chan/","미야와키 사쿠라","1998. 03. 19.","서브보컬");
    Member member4_3 = new Member("null","강혜원","1999. 07. 05.","서브보컬");
    Member member4_4 = new Member("null","최예나","1999. 09. 29.","리드댄서");
    Member member4_5 = new Member("null","이채연","2000. 01. 11.","메인댄서");
    Member member4_6 = new Member("null","김채원","2000. 08. 01.","리드보컬");
    Member member4_7 = new Member("null","김민주","2001. 02. 05.","서브보컬");
    Member member4_8 = new Member("null","야부키 나코","2001. 06. 18.","서브보컬");
    Member member4_9 = new Member("null","혼다 히토미","2001. 10. 06.","서브보컬");
    Member member4_10 = new Member("null","조유리","2001. 10. 22.","메인보컬");
    Member member4_11 = new Member("null","안유진","2003. 09. 01.","리드보컬");
    Member member4_12 = new Member("null","장원영","2004. 08. 31.","센터");

    private ArrayList<Member> memberlist4= new ArrayList<>(Arrays.asList(member4_1,member4_2,member4_3,member4_4,member4_5,member4_6,member4_7,member4_8,member4_9,member4_10,member4_11,member4_12));

    Member member5_1 = new Member("https://www.instagram.com/e_xiu_o/","시우민","1990. 03. 26.","서브보컬");
    Member member5_2 = new Member("https://www.instagram.com/kimjuncotton/","수호","1991. 05. 22.","리더");
    Member member5_3 = new Member("https://www.instagram.com/baekhyunee_exo/","백현","1992. 05. 06.","메인보컬");
    Member member5_4 = new Member("null","첸","1992. 09. 21.","메인보컬");
    Member member5_5 = new Member("https://www.instagram.com/real__pcy/","찬열","1992. 11. 27.","메인래퍼");
    Member member5_6 = new Member("null","디오","1993. 01. 12.","메인보컬");
    Member member5_7 = new Member("https://www.instagram.com/zkdlin/","카이","1994. 01. 14.","센터, 메인댄서");
    Member member5_8 = new Member("https://www.instagram.com/oohsehun/","세훈","1994. 04. 12.","리드댄서");

    private ArrayList<Member> memberlist5= new ArrayList<>(Arrays.asList(member5_1,member5_2,member5_3,member5_4,member5_5,member5_6,member5_7,member5_8));

    Member member6_1 = new Member("null","나연","1995.09.22.","리드보컬");
    Member member6_2 = new Member("null","정연","1996.11.01.","리드보컬");
    Member member6_3 = new Member("null","모모","1996.11.09.","메인댄서");
    Member member6_4 = new Member("null","사나","1996.12.29.","서브보컬");
    Member member6_5 = new Member("null","지효","1997.02.01.","리더, 메인보컬");
    Member member6_6 = new Member("null","미나","1997.03.24.","메인댄서");
    Member member6_7 = new Member("null","다현","1998.05.28.","리드래퍼");
    Member member6_8 = new Member("null","채영","1999.04.23.","메인래퍼");
    Member member6_9 = new Member("null","쯔위","1999.06.14.","리드댄서");
    private ArrayList<Member> memberlist6= new ArrayList<>(Arrays.asList(member6_1,member6_2,member6_3,member6_4,member6_5,member6_6,member6_7,member6_8,member6_9));
    Member member7_1 = new Member("https://www.instagram.com/sooyaaa__/","지수","1995년 1월 3일 ","리드보컬");
    Member member7_2 = new Member("https://www.instagram.com/jennierubyjane/","제니","1996년 1월 16일 ","메인래퍼, 서브보컬");
    Member member7_3 = new Member("https://www.instagram.com/roses_are_rosie/","로제","1997년 2월 11일 ","메인보컬, 리드댄서");
    Member member7_4 = new Member("https://www.instagram.com/lalalalisa_m/","리사","1997년 3월 27일","메인댄서, 리드래퍼, 서브보컬");
    private ArrayList<Member> memberlist7= new ArrayList<>(Arrays.asList(member7_1,member7_2,member7_3,member7_4));
    Member member8_1 = new Member("https://namu.wiki/w/NCT","<-- 엔시티의 정보는","나무위키로","대체합니다");
    private ArrayList<Member> memberlist8= new ArrayList<>(Arrays.asList(member8_1));

    Member member9_1 = new Member("null","카리나","2000. 04. 11.","리더, 메인댄서");
    Member member9_2 = new Member("null","지젤","2000. 10. 30.","메인래퍼");
    Member member9_3 = new Member("null","윈터","2001. 01. 01.","리드보컬");
    Member member9_4 = new Member("null","닝닝","2002. 10. 23.","메인보컬");

    private ArrayList<Member> memberlist9= new ArrayList<>(Arrays.asList(member9_1,member9_2,member9_3,member9_4));
    Member member10_1 = new Member("https://www.instagram.com/renebaebae/","아이린","1991년 3월 29일","센터");
    Member member10_2 = new Member("https://www.instagram.com/hi_sseulgi/","슬기","1994년 2월 10일","메인댄서, 리드보컬");
    Member member10_3 = new Member("https://www.instagram.com/todayis_wendy/","웬디","1994년 2월 21일","메인보컬");
    Member member10_4 = new Member("https://www.instagram.com/_imyour_joy/","조이","1996년 9월 3일","리드래퍼, 서브보컬");
    Member member10_5 = new Member("https://www.instagram.com/yerimiese/","예리","1999년 3월 5일","서브보컬, 서브래퍼");
    private ArrayList<Member> memberlist10= new ArrayList<>(Arrays.asList(member10_1,member10_2,member10_3,member10_4,member10_5));
    private ArrayList<ArrayList<Member>> memberlistlist = new ArrayList<>(Arrays.asList(memberlist1,memberlist2,memberlist3,memberlist4,memberlist5,memberlist6,memberlist7,memberlist8,memberlist9,memberlist10));

    private ArrayList<String> iframe = new ArrayList<>(Arrays.asList(
            "http://54.173.14.202:5601/goto/eba16be5bd6e6f72ff6a4e6b6e95d78a",
            "2",
            "http://54.173.14.202:5601/goto/4d7f674baced96ed3a25fa49ef52fa43",
            "http://54.173.14.202:5601/goto/faca3dd8c76929ca094d9850ac7119f7",
            "http://54.173.14.202:5601/goto/a9ec0616ee5be4ff91514afe5ff4d0cd",
            "http://54.173.14.202:5601/goto/f26dc4835e0fd315f508efe60dc8e178",
            "http://54.173.14.202:5601/goto/b75996b9d358d0d65c9f673ed2203158",
            "http://54.173.14.202:5601/goto/0226ab347ef0afae4b8e256ec15bd438",
            "http://54.173.14.202:5601/goto/0db4d90c5cd88e576d705c17aa9b6983",
            "10"));

}

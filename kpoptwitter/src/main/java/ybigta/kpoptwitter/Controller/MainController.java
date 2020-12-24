package ybigta.kpoptwitter.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String welcome(){
        return "index";
    }

    @GetMapping("/home")
    public String dashboard(){
        return "dashboard";
    }

    @GetMapping("/artist")
    public String Artist(){
        return "artist";
    }

    @RequestMapping("/artist/{artistid}")
    public String ArtistMain(Model model, @PathVariable String artistid) throws IOException {

        List<String> InformationList = new ArrayList<>();
        List<String> WebsiteList = new ArrayList<>();
        List<String> MemberList = new ArrayList<>();

        MemberList.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        InformationList.add("BTS DEBUT : 1212");
        InformationList.add("BTS HIHI");
        InformationList.add("BDFDF");
        InformationList.add("DFDFDFDFDFDF");
        InformationList.add("DFDFDFDAADF");
        model.addAttribute("InformationList",InformationList);
        model.addAttribute("WebsiteList",WebsiteList);
        model.addAttribute("MemberList",MemberList);
        model.addAttribute("artistid", artistid);

        return "artistmain";
    }

    @GetMapping("/ranking")
    public String ranking(){
        return "rank";
    }

    @RequestMapping("/stat/{artistid}")
    public String ArtistStat(Model model, @PathVariable String artistid) throws IOException {

        model.addAttribute("artistid", artistid);
        return "artiststat";
    }

    @GetMapping("/ma")
    public String maps(){
        return "maps";
    }

}

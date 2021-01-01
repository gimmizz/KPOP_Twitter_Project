package ybigta.kpoptwitter.Controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ybigta.kpoptwitter.Service.MemberService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final MemberService memberService;

    @GetMapping("/")
    public String home(){
        return "redirect:/artist";
    }

    @GetMapping("/artist")
    public String Artist(){
        return "artist";
    }

    @RequestMapping("/artist/{artistid}")
    public String ArtistMain(Model model, @PathVariable String artistid) throws IOException {

        model = memberService.insertname(artistid,model);
        model.addAttribute("artistid", artistid);
        return "artistmain";
    }

    @GetMapping("/ranking")
    public String ranking(){
        return "rank";
    }

    @RequestMapping("/stat/{artistid}")
    public String ArtistStat(Model model, @PathVariable String artistid) throws IOException {
        memberService.insertiframe(artistid,model);
        model.addAttribute("artistid", artistid);
        return "artiststat";
    }

    @GetMapping("/ma")
    public String maps(){
        return "maps";
    }

    @GetMapping("/vs")
    public String vs(){
        return "vs";
    }

}

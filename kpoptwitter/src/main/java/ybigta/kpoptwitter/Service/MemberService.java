package ybigta.kpoptwitter.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import ybigta.kpoptwitter.Domain.Information;
import ybigta.kpoptwitter.Domain.Website;
import ybigta.kpoptwitter.Repository.MemoryRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemoryRepository memoryRepository;

    public Model insertname(String artistid, Model model){
        for(int i=0; i < 10; i++){
            if(artistid.equals(memoryRepository.getInformationlist().get(i).getName().toLowerCase())){
                Information info = memoryRepository.getInformationlist().get(i);
                Website web = memoryRepository.getWebsite().get(i);
                List<Object> infolist = new ArrayList<>();
                List<Object> weblist = new ArrayList<>();
                infolist.add(info.getName());
                infolist.add(info.getDebut());
                //infolist.add(LocalDate.now() -info.getDebut())
                infolist.add(info.getEnter());
                infolist.add(info.getFandom());

                model.addAttribute("InformationList", infolist);
                model.addAttribute("youtube",web.getYoutube());
                model.addAttribute("twitter",web.getTwitter());
                model.addAttribute("instagram",web.getInsta());
                model.addAttribute("fancafe",web.getFancafe());
            }
        }
        return model;

    }
    

}

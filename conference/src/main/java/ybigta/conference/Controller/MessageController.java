package ybigta.conference.Controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.network.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.MessagingAdviceBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ybigta.conference.Domain.Message;
import ybigta.conference.Producer.MessageProducer;

import java.lang.reflect.Member;


@Slf4j
@Controller
public class MessageController {

    @Autowired
    MessageProducer messageProducer;

    @PostMapping("/board")
    public String postMessage(MessageForm messageForm) throws JsonProcessingException {
        Message message = new Message();
        message.setContext(messageForm.getContext());
        message.setMembername(messageForm.getName());
        message.setMessageid(1);
        log.info("Before Sending Message");
        messageProducer.sendMessage(message);
        log.info("Message Send Gooood");

        ///return ResponseEntity.status(HttpStatus.CREATED).body(message);
        return "redirect:/board";
    }
    @GetMapping("/board")
    public String createMessageForm(Model model){
        model.addAttribute("form", new MessageForm());
        return "kpop/createMessageForm";
    }

    @RequestMapping("/")
    public String home(){
        log.info("home controller");
        return "home";

    }



}

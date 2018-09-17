package ru.artbmstu.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.artbmstu.model.AdEntity;
import ru.artbmstu.service.AdService;

import java.util.Optional;

@Controller
public class AdController {

    @Autowired
    private AdService adService;

    @GetMapping("adlist")
    public String adList(final Model model){
        final Iterable<AdEntity> ads = adService.findAll();
        model.addAttribute("ads", ads);
        return "adlist";
    }

    @GetMapping("adcreate")
    public String adCreate(){
        final AdEntity ad = new AdEntity();
        ad.setAdname("Новое объявление");
        adService.save(ad);
        return "redirect:/adlist";
    }

    @GetMapping("adview/{id}")
    public String test(final Model model, @PathVariable("id") final String id){
        final Optional<AdEntity> ad = adService.findByIdad(id);
        ad.ifPresent(a -> model.addAttribute("ad", a));
        return "adview";
    }

}
package ru.artbmstu.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping(value = "adedit/{id}")
    public String adEdit(final Model model, @PathVariable("id") final String id){
        final Optional<AdEntity> ad = adService.findByIdad(id);
        ad.ifPresent(a -> model.addAttribute("ad", a));
        return "adedit";
    }

    @PostMapping("adsave")
    public String adSave(@ModelAttribute("ad") final AdEntity ad, final BindingResult result){
        if (!result.hasErrors()) adService.save(ad);
        return "redirect:/adlist";
    }

    @GetMapping(value = "adview/{id}")
    public String adView(final Model model, @PathVariable("id") final String id){
        final Optional<AdEntity> ad = adService.findByIdad(id);
        ad.ifPresent(a -> model.addAttribute("ad", a));
        return "adview";
    }

    @GetMapping("addelete/{id}")
    public String adDelete(@PathVariable("id") final String id){
        adService.deleteById(id);
        return "redirect:/adlist";
    }
}
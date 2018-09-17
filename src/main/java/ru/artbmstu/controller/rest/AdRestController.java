package ru.artbmstu.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.artbmstu.dto.AdDTO;
import ru.artbmstu.model.AdEntity;
import ru.artbmstu.service.AdService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("api/ad")
public class AdRestController {

    @Autowired
    private AdService adService;

    @GetMapping(value = "adlist", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AdDTO> getAdList(){
        System.out.println("adList processing");
        final Iterable<AdEntity> ads = adService.findAll();
        ads.forEach(val -> System.out.println(val.getAdname()));
        return StreamSupport
                .stream(ads.spliterator(), false)
                .map(AdDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping(value = "adcreate", produces = "application/json")
    public AdDTO adCreate(){
        final AdEntity ad = new AdEntity();
        ad.setAdname("Новое объявление");
        adService.save(ad);
        return new AdDTO(ad);
    }

    @GetMapping("ff/{id}")
    public String test(final Model model, @PathVariable("id") final String id){
        final Optional<AdEntity> ad = adService.findByIdad(id);
        ad.ifPresent(a -> model.addAttribute("ad", a));
        return "smth";
    }


}

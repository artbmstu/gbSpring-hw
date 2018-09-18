package ru.artbmstu.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.artbmstu.dto.AdDTO;
import ru.artbmstu.model.AdEntity;
import ru.artbmstu.service.AdService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("api/ad")
public class AdRestController {

    @Autowired
    private AdService adService;

    @GetMapping(value = "adlist", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AdDTO> getAdList() {
        System.out.println("adList processing");
        final Iterable<AdEntity> ads = adService.findAll();
        ads.forEach(val -> System.out.println(val.getAdname()));
        return StreamSupport
                .stream(ads.spliterator(), false)
                .map(AdDTO::new)
                .collect(Collectors.toList());
    }

    @PostMapping(value = "adcreate", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AdDTO adCreate(AdEntity ad) {
        adService.save(ad);
        return new AdDTO(ad);
    }
}

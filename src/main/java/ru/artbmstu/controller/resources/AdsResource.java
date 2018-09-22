package ru.artbmstu.controller.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.artbmstu.dto.AdDTO;
import ru.artbmstu.dto.ResultDTO;
import ru.artbmstu.model.AdEntity;
import ru.artbmstu.service.AdRestService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("api/ads")
public class AdsResource {

    @Autowired
    AdRestService adService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AdDTO> get(){
        final Iterable<AdEntity> ads = adService.findAll();
        return StreamSupport
                .stream(ads.spliterator(), false)
                .map(AdDTO::new)
                .collect(Collectors.toList());
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResultDTO post(final AdDTO[] ads){
        for (final AdDTO ad: ads) adService.save(ad);
        return new ResultDTO();
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResultDTO put(final AdDTO[] ads){
        for (final AdDTO ad: ads) adService.save(ad);
        return new ResultDTO();
    }

//    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResultDTO delete(final AdDTO[] ads){
//        for (final AdDTO ad: ads) adService.deleteById(ad.getIdad());
//        return new ResultDTO();
//    }
}

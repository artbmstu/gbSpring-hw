package ru.artbmstu.controller.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.artbmstu.dto.AdDTO;
import ru.artbmstu.dto.ResultDTO;
import ru.artbmstu.model.AdEntity;
import ru.artbmstu.service.AdRestService;

import java.util.Optional;

@RestController
@RequestMapping("api/ads")
public class AdResource {

    @Autowired
    AdRestService adService;

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AdDTO get(@PathVariable("id") final String id){
        final Optional<AdEntity> ad = adService.findByIdad(id);
        if (ad.isPresent()) return new AdDTO(ad.get());
        return null;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResultDTO post(final AdDTO ad){
        adService.save(ad);
        return new ResultDTO();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResultDTO put(final AdDTO ad){
        adService.save(ad);
        return new ResultDTO();
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResultDTO delete(final AdDTO ad){
        adService.delete(ad);
        return new ResultDTO();
    }
}

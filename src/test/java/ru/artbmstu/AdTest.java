package ru.artbmstu;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import ru.artbmstu.dto.AdDTO;

import java.net.MalformedURLException;

public class AdTest {

    @Test
    public void testGetList() throws MalformedURLException{
        final RestTemplate template = new RestTemplate();
        final String url = "http://localhost:8080/api/ad/adlist";
        final AdDTO[] ads = template.getForObject(url, AdDTO[].class);
        Assert.assertNotNull(ads);
    }
}

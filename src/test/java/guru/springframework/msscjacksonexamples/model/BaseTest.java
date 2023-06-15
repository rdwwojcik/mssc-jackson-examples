package guru.springframework.msscjacksonexamples.model;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by radek on 2023-06-15
 */
public class BaseTest {

    BeerDto getBeerDto() {
        return BeerDto.builder()
                .beerName("BeerName")
                .beerStyle("Ale")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .upc(123123112313L)
                .build();
    }
}

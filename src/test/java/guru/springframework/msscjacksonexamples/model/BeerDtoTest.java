package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by radek on 2023-06-15
 */
@JsonTest
class BeerDtoTest extends BaseTest{

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws IOException {
        String json = "{\"id\":\"a9ada52d-3810-4aa1-abd4-f60ed843f155\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123112313,\"price\":null,\"createdDate\":\"2023-06-15T14:31:24.80467796+02:00\",\"lastUpdatedDate\":\"2023-06-15T14:31:24.80540692+02:00\"}";

        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(beerDto);
    }
}
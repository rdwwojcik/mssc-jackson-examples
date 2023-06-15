package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

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
        String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123112313,\"price\":\"12.99\",\"createdDate\":\"2023-06-15T15:30:10+0200\",\"lastUpdatedDate\":\"2023-06-15T15:30:10.796856834+02:00\",\"myLocalDate\":\"20230615\",\"beerId\":\"dbc452e3-5f6a-4f19-a594-468d8328dad0\"}";

        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(beerDto);
    }
}
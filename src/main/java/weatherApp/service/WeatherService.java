package weatherApp.service;

import weatherApp.model.WeatherDto;
import weatherApp.webclient.weather.WeatherClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;

    public WeatherDto getWeather(){
        return weatherClient.getWeatherForCity("warszawa");
    }


}

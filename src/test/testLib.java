package test;

import WeatherGUI.WeatherData;
import com.teknikindustries.yahooweather.WeatherDoc;

/**
 * Created by Zhengyag's PC on 2016/2/28.
 */
public class testLib {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData("2972");
        System.out.println(wd.getCity());
        System.out.println(wd.getSunrise());

    }
}

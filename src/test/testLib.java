package test;


import Main_Package.GetWeatherXML;

/**
 * Created by Zhengyag's PC on 2016/2/28.
 */
public class testLib {
    public static void main(String[] args) {
        GetWeatherXML getWeatherXML = new GetWeatherXML("2972", "c");
        System.out.println(getWeatherXML.getCity());
        System.out.println(getWeatherXML.getSunrise());

    }
}

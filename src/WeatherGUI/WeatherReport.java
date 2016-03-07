/*
 * Created by JFormDesigner on Sun Feb 28 01:11:00 CST 2016
 */

package WeatherGUI;

import Main_Package.GetWeatherXML;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Zhengyang Zhao
 */
public class WeatherReport extends JFrame {

    private String[] cityName = {"Winnipeg", "Vancouver", "Calgary", "Toronto"};



    public WeatherReport() {
        initComponents();
        initCityCombo();
    }



    /**
     * After the confirme button been clicked
     * selectedCity will be updated
     * findWoeid class will be called
     * All relevent label will be filled
     *
     * @param  e
     */
    private void confirmeButtonActionPerformed(ActionEvent e) {
        FindWoeid findWoeid = new FindWoeid(cityComboBox.getSelectedItem().toString());
        GetWeatherXML weatherData = new GetWeatherXML(findWoeid.getWoeidCode(), "c");


        //Temperature Label
        tempLabel.setText("Temperature: " + weatherData.getTemperature()
                + weatherData.getTemperatureUnit());

        //Humidity Label
        humidityLabel.setText("Humidity: "+weatherData.getHumidity() + "%");

        //sunset label
        sunsetLabel.setText("Sunset: " + weatherData.getSunset());

        //sunrise label
        sunriseLabel.setText("Sunrise: " + weatherData.getSunrise());

        //wind chill label
        windChillLabel.setText("WindChill: " + weatherData.getWindChill()
                + weatherData.getTemperatureUnit());

        //condition label
        conditionLabel.setText("Condition: " + weatherData.getTextCondition());

    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Zhengyang Zhao
        label1 = new JLabel();
        cityComboBox = new JComboBox();
        tempLabel = new JLabel();
        humidityLabel = new JLabel();
        sunriseLabel = new JLabel();
        sunsetLabel = new JLabel();
        confirmeButton = new JButton();
        windChillLabel = new JLabel();
        conditionLabel = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Weather Report");
        setResizable(false);
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Select City:");

        //---- tempLabel ----
        tempLabel.setText("Temperature");

        //---- humidityLabel ----
        humidityLabel.setText("Humidity");

        //---- sunriseLabel ----
        sunriseLabel.setText("Sunrise");

        //---- sunsetLabel ----
        sunsetLabel.setText("Sunset");

        //---- confirmeButton ----
        confirmeButton.setText("Confirm");
        confirmeButton.addActionListener(e -> confirmeButtonActionPerformed(e));

        //---- windChillLabel ----
        windChillLabel.setText("Wind Chill");

        //---- conditionLabel ----
        conditionLabel.setText("Condition");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cityComboBox, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(confirmeButton, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(tempLabel, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                                .addComponent(humidityLabel, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                .addComponent(windChillLabel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
                            .addGap(73, 73, 73)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(sunriseLabel, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
                                .addComponent(sunsetLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                .addComponent(conditionLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addContainerGap(16, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(cityComboBox, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(confirmeButton, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(tempLabel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addComponent(sunriseLabel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(humidityLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(sunsetLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(windChillLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                        .addComponent(conditionLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


    /**
     * The initCityCombo will init the city combo
     * Item will be taken in as String array
     * The default city display will be index:0, Winnipeg
     *
     */
    private void initCityCombo() {
        for(int i = 0; i < cityName.length; i++) {
            cityComboBox.addItem(cityName[i]);
        }
        cityComboBox.setVisible(true);
        cityComboBox.setSelectedIndex(0);

    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Zhengyang Zhao
    private JLabel label1;
    private JComboBox cityComboBox;
    private JLabel tempLabel;
    private JLabel humidityLabel;
    private JLabel sunriseLabel;
    private JLabel sunsetLabel;
    private JButton confirmeButton;
    private JLabel windChillLabel;
    private JLabel conditionLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}



import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;




class Scratch {
    public static void main(String[] args) {
        ResultsRegister[] allResults = new ResultsRegister[30];
        allResults[0] = new ResultsRegister(22.3);
        allResults[1] = new ResultsRegister(14.4);

        System.out.println(allResults);
        System.out.println(Arrays.toString(allResults));



    }
}

class ResultsRegister extends Scratch {

    private double bmi;
    private String dateTime;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    int position = 0;


    ResultsRegister(double bmi){
        this.bmi = bmi;
        this.dateTime = dateFormat.format(new java.util.Date());


    }

}
package com.bizpro.techpm;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class IdGenerator {
	
    static public String getId(){
    	Random rnd = new Random();
        Calendar greg = new GregorianCalendar();
        long id = greg.getTimeInMillis() + rnd.nextInt(999);

        return String.valueOf(id);
    }

}

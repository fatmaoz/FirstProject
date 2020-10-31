package com.createproject.selfstudy.formatter;

import com.createproject.selfstudy.api.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneNumberFormatter implements Formatter<Phone> {
    @Override
    public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

        System.out.println("inside the parse method of the Phone");
        //logic
        String [] phoneNumberArray = completePhoneNumber.split("-");

        Phone phone = new Phone();
        phone.setCountryCode(phoneNumberArray[0]);
        phone.setUserNumber(phoneNumberArray[1]);


        return phone;
    }

    @Override
    public String print(Phone object, Locale locale) {
        return null;
    }
}



///////$44. dkda kaldim
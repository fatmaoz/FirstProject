package com.createproject.selfstudy.formatter;

import com.createproject.selfstudy.api.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;
//57. dk da kaldim
public class PhoneNumberFormatter implements Formatter<Phone> {
    @Override
    public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

        System.out.println("inside the parse method of the Phone");
        //logic
        Phone phone = new Phone();
        String [] phoneNumberArray = completePhoneNumber.split("-");
        int index = completePhoneNumber.indexOf("-");
        if(index== -1){
            phone.setCountryCode("91");
            phone.setUserNumber(phoneNumberArray[0]);
        }else {

            phone.setCountryCode(phoneNumberArray[0]);
            phone.setUserNumber(phoneNumberArray[1]);

        }
        return phone;
    }

    @Override
    public String print(Phone phone, Locale locale) {


        return phone.getCountryCode() + "-" + phone.getUserNumber()  ;
    }


}




///////$44. dkda kaldim
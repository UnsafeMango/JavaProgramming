package com.company;

public class Main {

    public static void main(String[] args) {
//        ITelephone timsPhone = new ITelephone() this is not valid..don't do this here

	    ITelephone timsPhone;
	    timsPhone = new DeskPhone(12343353);
	    timsPhone.powerOn();
	    timsPhone.callPhone(12343353);
	    timsPhone.answer();


	    timsPhone =  new MobilePhone(35334321);
	    timsPhone.powerOn();
	    timsPhone.callPhone(35334321);
	    timsPhone.answer();
    }
}

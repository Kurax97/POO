package date;
import date.*;

public class DateMain {

    public static void main(String[] args){
	Date anni = new Date(2, Month.MAY, 2020);
	Date today = new Date(18, Month.FEBRUARY, 2020);
	Date demain = today.tomorrow();
	Date vac = today.afterNDays(4);
	if (args.length == 0){
	    System.out.println(today.toString());
	    System.out.println("Demain c'est le " + demain.getDay() + " " + demain.getMonth() + " " + demain.getYear());
	    System.out.println("On a les vancances dans 4 jours donc ça va etre le " + vac.getDay() + " " + vac.getMonth());
	    System.out.println("Je vais avoir 20ans dans " + today.gap(anni) + " jours");
	}else{
	    if (Integer.parseInt(args[2]) > 0 && Integer.parseInt(args[1]) > 0 && Integer.parseInt(args[1]) < 13 && Integer.parseInt(args[0]) < Month.values()[Integer.parseInt(args[1]) - 1].nbJours(Integer.parseInt(args[2])) && Integer.parseInt(args[0]) >0){
		Date usr = new Date(Integer.parseInt(args[0]), Month.values()[Integer.parseInt(args[1]) - 1], Integer.parseInt(args[2]));
		int cM = today.getMonth().compareMonth(Month.values()[Integer.parseInt(args[1]) - 1]);
		Date dateann = new Date(usr.getDay(), usr.getMonth(), 2020);
		int anniusr = today.gap(dateann);
		int ageusr = 2020 - usr.getYear();
		if (cM >= 0){
		    System.out.println("Vous anniversaire aura lieu dans " + anniusr + " jours et vous aurez " + ageusr + " ans");
		}else{
		    System.out.println("Votre anniversaire est déjà passé il y a " +anniusr + " jours et vous avez " +ageusr + " ans" );}
	    }else{
		System.out.println("Invalid Inputs!");
	    }

	}
    }
}




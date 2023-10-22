package publicationManagementSystem;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tape extends Publication{
          
          private LocalTime mins;

		public Tape( String title, int price, LocalDate pubDate, short rating,LocalTime t) {
			super(title, price, pubDate, rating);
			// TODO Auto-generated constructor stub
			this.mins=t;
		}

		@Override
		public String toString() {    
			return "Tape "+super.toString()+"Tape : mins=" + mins.getHour()*60+mins.getMinute() + "]";
		}
		
           
}

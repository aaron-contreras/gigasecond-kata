import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private static final long GIGASECOND = (long) (Math.pow(10,9));
    private LocalDateTime dateTime;
    
    Gigasecond(LocalDate moment) {        
        dateTime = addGigaSecond(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        dateTime = addGigaSecond(moment);
    }

    LocalDateTime getDateTime() {
        return dateTime;
    }

    LocalDateTime addGigaSecond(LocalDateTime moment) {
        
        return moment.plusSeconds(GIGASECOND);
    }
}
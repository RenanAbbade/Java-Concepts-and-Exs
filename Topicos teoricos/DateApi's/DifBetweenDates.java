@Test
public void givenTwoDatesInJava8_whenDifferentiating_thenWeGetSix() {
    LocalDate now = LocalDate.now();
    LocalDate sixDaysBehind = now.minusDays(6);
 
    Period period = Period.between(now, sixDaysBehind);
    int diff = period.getDays();
 
    assertEquals(diff, 6);
}
@Test
public void givenTwoDateTimesInJava8_whenDifferentiating_thenWeGetSix() {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime sixMinutesBehind = now.minusMinutes(6);
 
    Duration duration = Duration.between(now, sixMinutesBehind);
    long diff = Math.abs(duration.toMinutes());
 
    assertEquals(diff, 6);
}
@Test
public void givenTwoDateTimesInJava8_whenDifferentiatingInSeconds_thenWeGetTen() {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime tenSecondsLater = now.plusSeconds(10);
 
    long diff = ChronoUnit.SECONDS.between(now, tenSecondsLater);
 
    assertEquals(diff, 10);
}

//Different timezones

@Test
public void givenTwoZonedDateTimesInJava8_whenDifferentiating_thenWeGetSix() {
    LocalDateTime ldt = LocalDateTime.now();
    ZonedDateTime now = ldt.atZone(ZoneId.of("America/Montreal"));
    ZonedDateTime sixMinutesBehind = now
      .withZoneSameInstant(ZoneId.of("Asia/Singapore"))
      .minusMinutes(6);
     
    long diff = ChronoUnit.MINUTES.between(sixMinutesBehind, now);
     
    assertEquals(diff, 6);
}

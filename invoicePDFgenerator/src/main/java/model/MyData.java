package model;


import lombok.Getter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;


/**
 * The type My data. model.POJO
 */
@Getter
public class MyData {
    private final String full_name = "Alex Turner";
    private final String tax_id = "984756";
    private final String bank_name = "N26";
    private final String card_holder = "Alex Turner";
    private final String iban = "DE19827987773";
    private final String bic = "BELADEXX";
    private final String email = "alex@gmail.com";
    private final String invoice_number = Instant.now().getEpochSecond() + "/" + full_name.hashCode();
    private final String invoice_date = String.valueOf(LocalDate.now(
            ZoneId.of( "America/Montreal" )));
    private final String description = "HTML/CSS Basics";
    private final String quantity = "5";
    private final String price = "50";
    private final String amount = String.valueOf(Integer.parseInt(quantity)*  Integer.parseInt(price));
    private final String total = String.valueOf(Integer.parseInt(quantity)*  Integer.parseInt(amount));

}

package by.itacademy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Setter
@Getter
@Entity
@Table(name = "debitors")
@NoArgsConstructor
@ToString
public class Debitors extends BaseEntity {

    @Column(name = "subdivisions")
    private String subdivisions;

    @Column(name = "debitor")
    private String debitor;

    @Column(name = "date_of_occurrence")
    private String dateOfOccurrence;

    @Column(name = "principal_amount")
    private String principalAmount;

    @Column(name = " sent_date")
    private String sentDate;

    @Column(name = " amount_claimed")
    private String amountClaimed;

    @Column(name = " date_of_debit")
    private String date_of_debit;

    @Column(name = " redemption_amount")
    private String redemptionAmount;

    @Column(name = " balance_owed")
    private String balanceOwed;

    @Column(name = " redemption_measures")
    private String redemptionMeasures;

    public Debitors(String subdivisions, String debitor,
                    String dateOfOccurrence, String principalAmount,
                    String sentDate, String amountClaimed, String date_of_debit,
                    String redemptionAmount, String balanceOwed,
                    String redemptionMeasures) {
        this.subdivisions = subdivisions;
        this.debitor = debitor;
        this.dateOfOccurrence = dateOfOccurrence;
        this.principalAmount = principalAmount;
        this.sentDate = sentDate;
        this.amountClaimed = amountClaimed;
        this.date_of_debit = date_of_debit;
        this.redemptionAmount = redemptionAmount;
        this.balanceOwed = balanceOwed;
        this.redemptionMeasures = redemptionMeasures;
    }
}
package net.joelinn.stripe.response.recipients;

/**
 * User: Joe Linn
 * Date: 5/25/2014
 * Time: 7:11 PM
 */
public class BankAccountResponse {
    protected String id;

    protected String object;

    protected String bankName;

    protected String accountHolderName;

    protected String accountHolderType;

    protected String routingNumber;

    protected String country;

    protected String currency;

    protected String last4;

    protected boolean disabled;

    protected String fingerprint;

    protected boolean validated;

    protected boolean verified;

    protected String status;

    public String getId() {
        return id;
    }

    public String getObject() {
        return object;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountHolderType() {
        return accountHolderType;
    }

    public String getCountry() {
        return country;
    }

    public String getCurrency() {
        return currency;
    }

    public String getLast4() {
        return last4;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public boolean isValidated() {
        return validated;
    }

    public boolean isVerified() {
        return verified;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public String getStatus() {
        return status;
    }
}

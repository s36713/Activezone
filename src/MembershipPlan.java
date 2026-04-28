public abstract class MembershipPlan implements Billable {
    private String planCode;
    private String clientName;
    private int months;
    private double baseMonthlyFee;
    private boolean autoRenew;

    public MembershipPlan(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew) {
        this.planCode = planCode;
        this.clientName = clientName;
        this.months = months;
        this.baseMonthlyFee = baseMonthlyFee;
        this.autoRenew = autoRenew;
    }

    public abstract String getPlanType();

    @Override
    public double calculateMonthlyGrossPrice() {
        return calculateMonthlyNetPrice() * 1.23;
    }

    public double calculateTotalNetPrice() {
        return calculateMonthlyNetPrice() * months;
    }

    public final void printSummary() {
        System.out.println("Plan: " + getPlanType() + " [" + planCode + "]");
        System.out.println("Client: " + clientName);
        System.out.println("Monthly Net: " + calculateMonthlyNetPrice());
        System.out.println("Monthly Gross: " + calculateMonthlyGrossPrice());
        System.out.println("Total Net: " + calculateTotalNetPrice());
    }

    @Override
    public String toString() {
        return String.format("Code: %s, Client: %s, Duration: %d months, Auto-renew: %b",
                planCode, clientName, months, autoRenew);
    }

    public String getPlanCode() { return planCode; }
    public String getClientName() { return clientName; }
    public int getMonths() { return months; }
    public double getBaseMonthlyFee() { return baseMonthlyFee; }
    public boolean isAutoRenew() { return autoRenew; }
}
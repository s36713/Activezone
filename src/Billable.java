public interface Billable {
    double calculateMonthlyNetPrice();
    double calculateMonthlyGrossPrice();
}

interface RemoteAccess {
    boolean hasOnlineAccess();
}

interface Freezable {
    boolean canFreeze();
}

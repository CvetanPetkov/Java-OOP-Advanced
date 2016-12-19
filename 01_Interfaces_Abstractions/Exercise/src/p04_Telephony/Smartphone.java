package p04_Telephony;
c class Smartphone implements Callable, Browseable {

    public Smartphone() {
    }

    @Override
    public String call(String number) {
        if (number.matches("\\d*")) {
            return String.format("Calling... %s", number);
        }
        throw new IllegalArgumentException("Invalid number!");
    }

    @Override
    public String browse(String url) {
        if (url.matches("\\D*")) {
            return String.format("Browsing: %s!", url);
        }
        throw new IllegalArgumentException("Invalid URL!");
    }
}

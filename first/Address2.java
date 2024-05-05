class Address {

    private double latitude;
    private double longitude;
    private String writtenAddress;


    public Address(double latitude, double longitude, String writtenAddress) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.writtenAddress = writtenAddress;
    }


    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getWrittenAddress() {
        return writtenAddress;
    }


    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setWrittenAddress(String writtenAddress) {
        this.writtenAddress = writtenAddress;
    }

    // محاسبه فاصله بین دو نقطه
    public double distanceFrom(Address otherAddress) {
        double la = Math.abs(this.latitude - otherAddress.getLatitude());
        double lo = Math.abs(this.longitude - otherAddress.getLongitude());

        double distance = Math.sqrt(Math.pow(la, 2) + Math.pow(lo, 2));

        return distance;
    }
    // چاپ اطلاعات آدرس
    public String toString() {
        return "Address{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", writtenAddress='" + writtenAddress + '\'' +
                '}';
    }
    }


public abstract class HolidayBuilder {

    private String name;
    private int days;

    final void buildHolidayPackage(){
        addCustomerName();
        bookDays();
        if(customerWantsInsurance()) {
            addInsurance();
        }
    }
    public void addCustomerName( ){
        System.out.println("Added Name...");    }
    public void bookDays(){
        System.out.println("Added days...");
    }
    public boolean customerWantsInsurance(){
        return true;
    }
    public abstract void addInsurance();
    public abstract String getCustomerDetails();
}

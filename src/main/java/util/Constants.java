package util;

public interface Constants {
    enum DATES{
        FIRST_DATE("19000101"),
        LAST_DATE("21000101");

        private String year;
        DATES(String year){
            this.year = year;
        }

        public String getYear(){
            return year;
        }
    }
}

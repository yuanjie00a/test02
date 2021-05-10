package test.enums;

public enum Day {
    mon("一",1),tues("一",2),wed("一",3),thurs("一",4),fri("一",5),satur("一",6),sun("一",7);
    private String s;
    private Integer c;
    private Day(String s,Integer c){
        this.s=s;
        this.c=c;
        }
        public String getS(){
        return s;
        }
    public Integer getC(){
        return c;
    }

    public static void main(String[] args) {
        for (Day d:Day.values()
             ) {
            System.out.println(d.name()+d.getS()+d.getC());
        }
    }
}

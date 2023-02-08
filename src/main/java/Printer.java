public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = 1000;
        this.toner = 1000;
    }

    public int getPaper () {return this.sheets;}
    public int setSheets (int sheets){return this.sheets = sheets;}
    public int getToner () {return this.toner;}
    public int setToner (int toner){return this.toner = toner;}


    public String printJob(int copies, int pages) {
        int printed = copies*pages;
        if (this.toner >= printed && this.sheets >= printed) {
            this.sheets -= printed;
            this.toner -= printed;
            return String.format("printed %s copies", printed);
        }else{
                return "not enough paper, sorry";
            }


    }
}

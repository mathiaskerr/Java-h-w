public class Printer {
    private int pages;
    private int toner;

    public Printer(int pages,int toner){
        this.pages= pages;
        this.toner=toner;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getToner() {
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }


    public void print(int i) {
        if(getPages()>= i || getToner() >=i){
            setPages(getPages() - i);
            setToner(getToner() - i);
        }
    }
}

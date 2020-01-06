public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets) {
        this.sheets = sheets;
        this.toner = 100;
    }

    public int getSheets(){
        return this.sheets;
    }

    public boolean print(int pages, int copies){
        int total = pages * copies;
        if (total <= this.sheets){
            this.sheets -= total;
            return true;
            } else {
            return false;
        }
    }

    public int getToner(){
        return this.toner;
    }

    }


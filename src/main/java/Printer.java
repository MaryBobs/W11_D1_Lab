public class Printer {
    private int sheets;

    public Printer(int sheets) {
        this.sheets = sheets;
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

    }


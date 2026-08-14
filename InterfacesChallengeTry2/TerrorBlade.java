import java.util.ArrayList;
import java.util.List;

public class TerrorBlade implements ISaveable{
    String minuteMark;
    int lvl;
    int netWorth;
    int NumCoreItemsPurchased;


    TerrorBlade(String minuteMark, int lvl, int netWorth, int NumCoreItemsPurchased){
        this.minuteMark = minuteMark;
        this.lvl = lvl;
        this.netWorth = netWorth;
        this.NumCoreItemsPurchased = NumCoreItemsPurchased;
    }

    public String getMinuteMark() {
        return minuteMark;
    }

    public void setMinuteMark(String minuteMark) {
        this.minuteMark = minuteMark;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(int netWorth) {
        this.netWorth = netWorth;
    }

    public int getNumCoreItemsPurchased() {
        return NumCoreItemsPurchased;
    }

    public void setNumCoreItemsPurchased(int coreItemsPurchased) {
        this.NumCoreItemsPurchased = coreItemsPurchased;
    }

    @Override
    public String toString(){
        return "MinuteMark = " +getMinuteMark()
                + "Level = " +Integer.toString(getLvl())
                + "Net Worth = " +Integer.toString(getNetWorth())
                + "Number of Core Items Purchase = " +Integer.toString(getNumCoreItemsPurchased());
    }
    @Override
    //saves all current stats of the object to an arrayList
    public List<String> saveStatsToArray() {
        List<String> tempArray = new ArrayList<>();

        tempArray.add(getMinuteMark());
        tempArray.add(Integer.toString(getLvl()));
        tempArray.add(Integer.toString(getNetWorth()));
        tempArray.add(Integer.toString(getNumCoreItemsPurchased()));

        return tempArray;
    }

    @Override
    //sets all hero stats from an arrayList
    public void extractStats(List<String> myArray) {
        setMinuteMark(myArray.get(0));
        setLvl(Integer.parseInt(myArray.get(1)));
        setNetWorth(Integer.parseInt(myArray.get(2)));
        setNumCoreItemsPurchased(Integer.parseInt(myArray.get(3)));
    }

}

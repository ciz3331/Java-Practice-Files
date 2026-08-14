import java.util.ArrayList;
import java.util.List;

public class AntiMage implements IGameStats{
    int lvl;
    int netWorth;
    int numOfCoreItems;

    AntiMage(int lvl, int netWorth, int numOfCoreItems){
        this.lvl = lvl;
        this.netWorth = netWorth;
        this.numOfCoreItems = numOfCoreItems;
    }

    @Override
    public List<IGameStats> storeHeroInstance(){
        List<IGameStats> heroInstance = new ArrayList<>();
        return heroInstance;
    }

    @Override
    public IGameStats populateStats(IGameStats tbMinute){
        tbMinute = new TerrorBlade(getLvl(), getNetWorth(), getNumOfCoreItems());

        return tbMinute;
    }


    @Override
    public String toString(){
        String lvl = Integer.toString(getLvl());
        String netWorth = Integer.toString(getNetWorth());
        String numOfCoreItems = Integer.toString(getNumOfCoreItems());
        return "Level: " +lvl + " NetWorth: " +netWorth +" Number of CoreItems: " +numOfCoreItems;

    }

    public int getLvl() {
        return lvl;
    }

    public int getNetWorth() {
        return netWorth;
    }

    public int getNumOfCoreItems() {
        return numOfCoreItems;
    }
}

import java.util.List;

public interface IGameStats {
    List<IGameStats> storeHeroInstance();
    IGameStats populateStats (IGameStats heroMinute);
}

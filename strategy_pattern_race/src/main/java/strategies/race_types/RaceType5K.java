package strategies.race_types;

public class RaceType5K implements IRaceType
{
    @Override
    public String[] getRewards()
    {
        return new String[] {
            "smelly shoes",
            "sweet trophy",
            "$1000"
        };
    }
}

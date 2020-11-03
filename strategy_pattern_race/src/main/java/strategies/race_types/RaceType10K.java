package strategies.race_types;

public class RaceType10K implements IRaceType
{
    @Override
    public String[] getRewards()
    {
        return new String[] {
            "key to the city",
            "sweet medal",
            "$5000"
        };
    }
}

package factory_method_pattern.ads;

import factory_method_pattern.entities.Advertisement;
import factory_method_pattern.generation.IRegionalGenerator;

import java.util.List;

public class LongIslandAdGenerator implements IRegionalGenerator
{
    @Override
    public List<Advertisement> getAppropriateAds()
    {
        return List.of(
            new Advertisement("Smash burgers are the best!"),
            new Advertisement("Chili and curry")
        );
    }

    @Override
    public Advertisement getPrimaryAd()
    {
        return new Advertisement("Sugar at dunkin donuts!");
    }
}

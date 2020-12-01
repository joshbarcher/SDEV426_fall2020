package factory_method_pattern.ads;

import factory_method_pattern.entities.Advertisement;
import factory_method_pattern.generation.IRegionalGenerator;

import java.util.List;

public class VirginiaBeachAdGenerator implements IRegionalGenerator
{
    @Override
    public List<Advertisement> getAppropriateAds()
    {
        return List.of(
            new Advertisement("Sugar at dunkin donuts!"),
            new Advertisement("Come visit Busch Gardens")
        );
    }

    @Override
    public Advertisement getPrimaryAd()
    {
        return new Advertisement("Mount Trashmore!");
    }
}

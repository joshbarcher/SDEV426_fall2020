package factory_method_pattern.generation;

import factory_method_pattern.ads.LongIslandAdGenerator;

public class LongIslandAds extends AdGenerator
{
    @Override
    public IRegionalGenerator getGenerator()
    {
        return new LongIslandAdGenerator();
    }
}

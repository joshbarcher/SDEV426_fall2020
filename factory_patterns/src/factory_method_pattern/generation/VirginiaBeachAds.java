package factory_method_pattern.generation;

import factory_method_pattern.ads.VirginiaBeachAdGenerator;

public class VirginiaBeachAds extends AdGenerator
{
    @Override
    public IRegionalGenerator getGenerator()
    {
        return new VirginiaBeachAdGenerator();
    }
}

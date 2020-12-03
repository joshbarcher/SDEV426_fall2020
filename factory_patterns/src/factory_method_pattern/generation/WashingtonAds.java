package factory_method_pattern.generation;

import factory_method_pattern.ads.WashingtonAdGenerator;

public class WashingtonAds extends AdGenerator
{
    @Override
    public IRegionalGenerator getGenerator()
    {
        return new WashingtonAdGenerator();
    }
}

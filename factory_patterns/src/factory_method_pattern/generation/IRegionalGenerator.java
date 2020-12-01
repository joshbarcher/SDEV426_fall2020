package factory_method_pattern.generation;

import factory_method_pattern.entities.Advertisement;

import java.util.List;

public interface IRegionalGenerator
{
    List<Advertisement> getAppropriateAds();
    Advertisement getPrimaryAd();
}



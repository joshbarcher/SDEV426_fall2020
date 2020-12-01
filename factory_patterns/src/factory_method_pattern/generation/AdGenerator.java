package factory_method_pattern.generation;

import factory_method_pattern.entities.Advertisement;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class AdGenerator
{
    private Random random = new Random();
    private List<Advertisement> ads;
    private Advertisement ultimateAd;
    
    public AdGenerator()
    {
        IRegionalGenerator generator = getGenerator();

        ads = generator.getAppropriateAds();
        ultimateAd = generator.getPrimaryAd();
    }

    //this is an abstract factory method (the object we need is provided in a child class)
    public abstract IRegionalGenerator getGenerator();
    
    public Advertisement showAd()
    {
        //pick a random advertisement to show
        return ads.get(random.nextInt(ads.size()));
    }
    
    public List<Advertisement> getAllAds()
    {
        return Collections.unmodifiableList(ads);
    }

    public Advertisement getUltimateAd()
    {
        return ultimateAd;
    }
}


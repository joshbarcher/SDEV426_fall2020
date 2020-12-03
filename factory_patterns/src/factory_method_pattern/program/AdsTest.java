package factory_method_pattern.program;

import factory_method_pattern.entities.Advertisement;
import factory_method_pattern.generation.AdGenerator;
import factory_method_pattern.generation.LongIslandAds;
import factory_method_pattern.generation.VirginiaBeachAds;
import factory_method_pattern.generation.WashingtonAds;

public class AdsTest
{
    public static void main(String[] args)
    {
        AdGenerator adgenerator = new WashingtonAds();
        
        for (Advertisement ad : adgenerator.getAllAds())
        {
            System.out.println(ad);
        }

        System.out.println("Primary ad: " + adgenerator.getUltimateAd());
    }
}




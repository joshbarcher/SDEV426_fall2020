package factory_method_pattern.program;

import factory_method_pattern.entities.Advertisement;
import factory_method_pattern.generation.AdGenerator;
import factory_method_pattern.generation.LongIslandAds;
import factory_method_pattern.generation.VirginiaBeachAds;

public class AdsTest
{
    public static void main(String[] args)
    {
        AdGenerator adgenerator = new VirginiaBeachAds();
        
        for (Advertisement ad : adgenerator.getAllAds())
        {
            System.out.println(ad);
        }

        System.out.println("Ultimate ad: " + adgenerator.getUltimateAd());
    }
}




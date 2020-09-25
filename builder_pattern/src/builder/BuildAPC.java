package builder;

public class BuildAPC
{
    public static void main(String[] args)
    {
        PCPartList list = PCPartList.builder()
            .gpu(true)
            .computerCase("Lian Li XL")
            .ram("GSkill Trident 32 GB")
            .cpu("Intel Core i9 10900K")
            .mobo("Asus ROG Maximus XII Extreme")
            .build();

        System.out.println(list);
    }
}

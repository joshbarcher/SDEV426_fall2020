package builder;

public class PCPartList
{
    private String computerCase;
    private String ram;
    private String mobo;
    private String cpu;
    private boolean gpu;

    public PCPartList(String computerCase, String ram,
                      String mobo, String cpu, boolean gpu)
    {
        this.computerCase = computerCase;
        this.ram = ram;
        this.mobo = mobo;
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public String getComputerCase()
    {
        return computerCase;
    }

    public void setComputerCase(String computerCase)
    {
        this.computerCase = computerCase;
    }

    public String getRam()
    {
        return ram;
    }

    public void setRam(String ram)
    {
        this.ram = ram;
    }

    public String getMobo()
    {
        return mobo;
    }

    public void setMobo(String mobo)
    {
        this.mobo = mobo;
    }

    public String getCpu()
    {
        return cpu;
    }

    public void setCpu(String cpu)
    {
        this.cpu = cpu;
    }

    public boolean isGpu()
    {
        return gpu;
    }

    public void setGpu(boolean gpu)
    {
        this.gpu = gpu;
    }

    @Override
    public String toString()
    {
        return "PCPartList{" +
                "computerCase='" + computerCase + '\'' +
                ", ram='" + ram + '\'' +
                ", mobo='" + mobo + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu=" + gpu +
                '}';
    }

    public static Builder builder()
    {
        return new Builder();
    }

    //this class will help us put together a PCPartList
    public static class Builder
    {
        private String computerCase;
        private String ram;
        private String mobo;
        private String cpu;
        private boolean gpu;

        public Builder()
        {
            //do nothing...
        }

        public Builder computerCase(String computerCase)
        {
            this.computerCase = computerCase;
            return this;
        }

        public Builder ram(String ram)
        {
            this.ram = ram;
            return this;
        }

        public Builder mobo(String mobo)
        {
            this.mobo = mobo;
            return this;
        }

        public Builder cpu(String cpu)
        {
            this.cpu = cpu;
            return this;
        }

        public Builder gpu(boolean gpu)
        {
            this.gpu = gpu;
            return this;
        }

        public PCPartList build()
        {
            return new PCPartList(computerCase, ram, mobo, cpu, gpu);
        }

        public PCPartList buildWithDefaults()
        {
            //give some sensible defaults for omitted fields
            if (mobo == null)
            {
                mobo = "Standard MOBO";
            }

            return new PCPartList(computerCase, ram, mobo, cpu, gpu);
        }
    }
}









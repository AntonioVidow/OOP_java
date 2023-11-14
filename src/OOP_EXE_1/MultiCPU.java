package OOP_EXE_1;

public class MultiCPU {
    private double cpuCount;
    private double corePerCPU;
    private double GHz;

    private double configToSingleCPUDATA;

    public double getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(double cpuCount) {
        this.cpuCount = cpuCount;
    }

    public double getCorePerCPU() {
        return corePerCPU;
    }

    public void setCorePerCPU(double corePerCPU) {
        this.corePerCPU = corePerCPU;
    }

    public double getGHz() {
        return GHz;
    }

    public void setGHz(double GHz) {
        this.GHz = GHz;
    }

    public double getConfigToSingleCPUDATA() {
        return configToSingleCPUDATA;
    }

    public void setConfigToSingleCPUDATA(double configToSingleCPUDATA) {
        this.configToSingleCPUDATA = configToSingleCPUDATA;
    }

    public MultiCPU(double cpuCount, double corePerCPU, double MHz) {
        this.cpuCount = cpuCount;
        this.corePerCPU = corePerCPU;
        this.GHz = MHz;
    }

    public void configureToSingleCPUDATA(){
        if(this.cpuCount > 1){
            this.configToSingleCPUDATA = ((0.7*this.corePerCPU) * 0.8 * this.corePerCPU) * this.GHz;
        } else{
            this.configToSingleCPUDATA = 1;
        }
    }

    public double timeForTaskCompletion(double secondsForSingleCPUTaskCompletion) {
        return (secondsForSingleCPUTaskCompletion * this.configToSingleCPUDATA) / this.GHz;
    }

    @Override
    public String toString(){
        return "MultiCPU : CPU count-" + this.cpuCount +" / cores per CPU-" + this.corePerCPU + " / " + this.GHz + "GHz";
    }
}
